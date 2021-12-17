package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.DtoUsuario;

import model.Colore;
import model.Usuario;
import service.Colores_Service;
import util.Utilidades;

@CrossOrigin(origins = "*")
@Controller
public class Colores_Controller {
	// Controlador que se encarga de guardar el color de los graficos y devuelve una
	// lista con todos los colores

	@Autowired
	Colores_Service service;

	@GetMapping(value = ("doTodosLosColores"), produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Colore> todosLosColores(HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");

		Usuario usu = Utilidades.convertirUsuarioADto(u);

		List<Colore> c = service.todos(usu.getIdUsuario());
		c.forEach(s -> System.out.println("este el colorparam1" + s.getColorParam1()+"este el colorparam2" + s.getColorParam2()));

		return c;

	}

	@PostMapping("doGuardarColores1")

	public String guardarColores(@RequestParam("colorParam1") String colorParam1, HttpSession sesion) {
		System.out.println(colorParam1);
		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		int idUsuario = usu.getIdUsuario();
		
		

		service.guardar(new Colore(idUsuario, colorParam1));

		return "menu";

	}

	@PostMapping(value = ("doGuardarColores2"))

	public String guardarColores(@RequestParam("colorParam1") String colorParam1,
			@RequestParam("colorParam2") String colorParam2, HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		int idUsuario = usu.getIdUsuario();
		
		

		service.guardar(new Colore(idUsuario, colorParam1, colorParam2));
		return "menu";

	}

	@PostMapping("doGuardarColores3")

	public String guardarColores(@RequestParam("colorParam1") String colorParam1,
			@RequestParam("colorParam2") String colorParam2, @RequestParam("colorParam3") String colorParam3,
			HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		
		int idUsuario = usu.getIdUsuario();
		
		


		service.guardar(new Colore(idUsuario, colorParam1, colorParam2, colorParam3));

		return "menu";

	}

	@PostMapping("doGuardarColores4")

	public String guardarColores(@RequestParam("colorParam1") String colorParam1,
			@RequestParam("colorParam2") String colorParam2, @RequestParam("colorParam3") String colorParam3,
			@RequestParam("colorParam4") String colorParam4, HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		int idUsuario = usu.getIdUsuario();

		service.guardar(new Colore(idUsuario, colorParam1, colorParam2, colorParam3, colorParam4));

		return "menu";

	}

	@PostMapping("doGuardarColores5")

	public String guardarColores(@RequestParam("colorParam1") String colorParam1,
			@RequestParam("colorParam2") String colorParam2, @RequestParam("colorParam3") String colorParam3,
			@RequestParam("colorParam4") String colorParam4, @RequestParam("colorParam5") String colorParam5,
			HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		int idUsuario = usu.getIdUsuario();

		service.guardar(new Colore(idUsuario, colorParam1, colorParam2, colorParam3, colorParam4, colorParam5));

		return "menu";

	}

	@PostMapping("doGuardarColores6")

	public String guardarColores(@RequestParam("colorParam1") String colorParam1,
			@RequestParam("colorParam2") String colorParam2, @RequestParam("colorParam3") String colorParam3,
			@RequestParam("colorParam4") String colorParam4, @RequestParam("colorParam5") String colorParam5,
			@RequestParam("colorParam6") String colorParam6, HttpSession sesion) {

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");
		Usuario usu = Utilidades.convertirUsuarioADto(u);

		int idUsuario = usu.getIdUsuario();

		service.guardar(new Colore(idUsuario, colorParam1, colorParam2, colorParam3, colorParam4, colorParam5, colorParam6));

		return "menu";

	}
}
