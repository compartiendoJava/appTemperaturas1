package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.DtoUsuario;
import model.Temperatura;
import model.Usuario;
import service.Temperatura_Service;
import util.Utilidades;
@CrossOrigin(origins = "*")
@Controller

public class Temperatura_Manual_Controller {
	
	//Controlador que permite ingresar temperaturas Manualmente para probar que esta funcionando
	
	@Autowired
	Temperatura_Service service;
	
	@PostMapping("doAgregarTemperaturas1")
	public String agregar(@RequestParam("param1") String param1,
			HttpSession sesion, HttpServletResponse response) throws IOException {
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");
		
		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura1(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";

	}
	@PostMapping("doAgregarTemperaturas2")
	public String agregar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,
			HttpSession sesion, HttpServletResponse response) throws IOException {
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura2(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";
		

	}
	@PostMapping("doAgregarTemperaturas3")
	public String agregar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,
			HttpSession sesion, HttpServletResponse response) throws IOException {
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura3(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";
		

	}
	@PostMapping("doAgregarTemperaturas4")
	public String agregar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4,
			HttpSession sesion, HttpServletResponse response) throws IOException {
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura4(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";
	}
	@PostMapping("doAgregarTemperaturas5")
	public String agregar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4,
			@RequestParam("param5") String param5,HttpSession sesion, HttpServletResponse response) throws IOException {
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura5(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";

	}
	@PostMapping("doAgregarTemperaturas6")
	public String agregar(@RequestParam("param1") String param1, @RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4,
			@RequestParam("param5") String param5,@RequestParam("param6") String param6,HttpSession sesion, HttpServletResponse response) throws IOException {
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5),Integer.parseInt(param6),dia,fecha,new Usuario(usuario.getIdUsuario(), null, null, null));

		sesion.setAttribute("temp", Utilidades.convertirADtoTempraratura6(temperatura));
		service.agregar(temperatura);
		
		return "agregar.html";


	}



}
