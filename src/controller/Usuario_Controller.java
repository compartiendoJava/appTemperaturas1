package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.DtoUsuario;
import model.Seleccion;
import model.Usuario;
import service.NotificationService;
import service.Seleccion_Service;
import service.Usuario_Service;
import util.Utilidades;

@CrossOrigin(origins = "*")
@Controller
public class Usuario_Controller {
	// Controlador que se encarga de realizar Altas,Bajas,Logging,Registros,te
	// devuelve lista de usuarios,etc
	@Autowired
	Usuario_Service service;

	@Autowired
	Seleccion_Service services;

	@Autowired
	NotificationService servicess;
	@Autowired
	private JavaMailSender mailSender;

	@Autowired
	private SimpleMailMessage preConfiguredMessage;

	@PostMapping("doAlta")

	public String registrar(@RequestParam("nombre") String nombre, @RequestParam("password") String password,
			@RequestParam("email") String email, HttpSession sesion) {

		int idUsuario = service.todos().size();

		Usuario usuario = new Usuario(0, nombre, password, email);
		DtoUsuario usuarioConId = new DtoUsuario(idUsuario + 1, nombre, password, email);

		sesion.setAttribute("usuario", usuarioConId);

		service.darDeAlta(usuario);

		return "seleccion";

	}

	@GetMapping("doSeleccion")
	public List<Seleccion> listaSeleccion(@RequestParam("idUsuario") int idUsuario) {

		return services.Labels(idUsuario);

	}

	@PostMapping(value = "doBaja", produces = MediaType.APPLICATION_JSON_VALUE)

	public String darDeBaja(@RequestParam("nombre") String nombre, @RequestParam("password") String password,
			@RequestParam("email") String email, @RequestParam("idUsuario") String idUsuario) {

		DtoUsuario usuario = new DtoUsuario(Integer.parseInt(idUsuario), nombre, password, email);

		service.darDeAlta(Utilidades.candidatoEntityBuilder(usuario));

		return "alta";

	}

	// Recibe una llamada y manda un mail con los datos recibidos en el registro
	@GetMapping("doVerificar")
	public String enviar(HttpSession sesion) throws Exception {

		System.out.println("estamos en verificar");

		DtoUsuario usu = (DtoUsuario) sesion.getAttribute("usuario");

		int idUsuario = service.todos().size();
		idUsuario = idUsuario++;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(usu.getEmail());
		message.setSubject(
				"Muchas Gracias por registrarte en conpartiendoJava aqui te dejamos los datos de tu registro");
		message.setText("Usuario: " + usu.getNombre() + " password:" + usu.getPassword() + " email de registro:"
				+ usu.getEmail());
		mailSender.send(message);

		return "seleccion";

	}
    //Controlador que se encarga de mandar un mail desde contacto al email de la empresa
	@PostMapping("doContacto")
	public String contacto(@RequestParam("nombre") String nombre, @RequestParam("email") String email,
			@RequestParam("mensaje") String mensaje, HttpSession sesion) throws Exception {

		System.out.println("estamos en contacto");

		DtoUsuario usu = (DtoUsuario) sesion.getAttribute("usuario");

		int idUsuario = service.todos().size();
		
		idUsuario = idUsuario++;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("compartiendojava@gmail.com");
		message.setSubject("Mesaje de cliente");
		message.setText("Usuario: " + usu.getNombre() + " password: " + usu.getPassword() + " email de registro: "
				+ usu.getEmail() + "  mensaje del cliente:" + mensaje);
		mailSender.send(message);

		return "contacto";

	}

	@GetMapping(value = "doTodos", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<DtoUsuario> todas(HttpSession sesion) {

		List<DtoUsuario> lista = service.todos();

		return lista;

	}

	@GetMapping(value = "doLoging", produces = MediaType.APPLICATION_JSON_VALUE)

	public String todas(@RequestParam("nombre") String nombre, @RequestParam("password") String password,
			HttpSession sesion) {
		List<DtoUsuario> usuarios = service.todos();

		usuarios.forEach(u -> System.out.println(u.getNombre() + "   " + u.getPassword()));

		DtoUsuario dtou = usuarios.stream().filter(t -> t.getNombre().equals(nombre) && t.getPassword().equals(password)).findAny().orElse(null);
		
		if (dtou != null) {

			sesion.setAttribute("usuario", dtou);

			return "menu";

		}
		// System.out.println("este es el nombre" + nombre);

		// DtoUsuario usuario = service.Logging(nombre, password);

		// sesion.setAttribute("usuario", dtou );

		// System.out.println("este el logging" + usuario.getIdUsuario());
		return "loging";

	}
	//Controlador que devuelve un usuario en concreto recibiendo el id de usuadio

	@GetMapping(value = "doUsuario", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody DtoUsuario usuario(@RequestParam("idUsuario") int idUsuario) {

		Usuario dto = service.unUsuario(idUsuario);

		System.out.println(dto.getNombre() + "  " + dto.getPassword() + "    " + dto.getEmail());

		return Utilidades.convertirADtoUsuario(dto);

	}

	@GetMapping(value = "doEliminar", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<DtoUsuario> eliminar(@RequestParam("idUsuario") int idUsuario) {

		service.usuarioBorrar(idUsuario);

		return service.todos();

	}

	@GetMapping(value = "doNombre", produces = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String nombre(HttpSession sesion) {

		DtoUsuario usu = (DtoUsuario) sesion.getAttribute("usuario");

		System.out.println("estamos en nombre" + usu.getNombre());

		return usu.getNombre();

	}

}
