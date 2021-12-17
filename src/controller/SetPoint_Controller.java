package controller;

import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.DtoUsuario;
import model.Setpoint;
import service.SetPoint_Service;

@CrossOrigin(origins = "*")
@Controller
public class SetPoint_Controller {
	
	//Controlador que guarda los setpoints y posteriormente los llama 
	//para cambiar los valores de set point en los microcontroladores

	@Autowired
	SetPoint_Service service;

	@PostMapping("doAgregarSetPoint1")
	public String agregarset1(@RequestParam("param1") String param1,
			HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");
		
		service.insertarSetPoint(new Setpoint(usuarios.getIdUsuario(),Integer.parseInt(param1)));	
		
		return "configuracion.html";

	}

	@PostMapping("doAgregarSetPoint2")
	public String agregarset2(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		service.insertarSetPoint(
				new Setpoint(usuarios.getIdUsuario(), Integer.parseInt(param1), Integer.parseInt(param2)));

		return "configuracion.html";

	}

	@PostMapping("doAgregarSetPoint3")
	public String agregarset3(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			@RequestParam("param3") String param3, HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		service.insertarSetPoint(new Setpoint(usuarios.getIdUsuario(),Integer.parseInt(param1), Integer.parseInt(param2),
				Integer.parseInt(param3)));

		return "configuracion.html";

	}

	@PostMapping("doAgregarSetPoint4")
	public String agregarset4(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			@RequestParam("param3") String param3, @RequestParam("param4") String param4, HttpSession sesion)
			throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		service.insertarSetPoint(new Setpoint(usuarios.getIdUsuario(), Integer.parseInt(param1), Integer.parseInt(param2),
				Integer.parseInt(param3), Integer.parseInt(param4)));

		return "configuracion.html";

	}

	@PostMapping("doAgregarSetPoint5")
	public String agregarset5(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,
			@RequestParam("param4") String param4,@RequestParam("param5") String param5,HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");
		
		service.insertarSetPoint(new Setpoint(usuarios.getIdUsuario(),Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5)));	
		
		return "configuracion.html";

	}
	@PostMapping("doAgregarSetPoint6")
	public String agregarset5(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,
			@RequestParam("param4") String param4,@RequestParam("param5") String param5,@RequestParam("param6") String param6,HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");
		
		service.insertarSetPoint(new Setpoint(usuarios.getIdUsuario(),Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5),Integer.parseInt(param6)));	
		
		return "configuracion.html";

	}


	@PostMapping("doActualizarSetPoint")
	public String actualizar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		service.actualizarSetPoint(
				new Setpoint(usuarios.getIdUsuario(), Integer.parseInt(param1), Integer.parseInt(param2)));

		return "configuracion.html";

	}

	@GetMapping("doBorrarSetPoint")
	public String borrar(HttpSession sesion) throws IOException {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		service.deleteSetPoint(usuarios.getIdUsuario());

		return "configuracion.html";
	}

}
