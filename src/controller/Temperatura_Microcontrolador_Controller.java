package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dto.DtoUsuario;
import model.Setpoint;
import model.Temperatura;
import model.Usuario;
import service.SetPoint_Service;
import service.Temperatura_Service;

@CrossOrigin(origins = "*")
@Controller
public class Temperatura_Microcontrolador_Controller {
	
	//Controlador que recibe los datos de los microcontroladores y los guarda ,utiliza un metodo segun el numero de parametros que utilice
	
	@Autowired
	Temperatura_Service service;
	
	@Autowired
	SetPoint_Service services;
	
	@PostMapping("doAgregarTemperaturasMicro1")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));

		service.agregar(temperatura);
		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			
			out.close();
		}

		return "respuestaMicro.html";

	}
	
	@PostMapping("doAgregarTemperaturasMicro2")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1,
			@RequestParam("param2") String param2, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));

		service.agregar(temperatura);
		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			out.println(+e.getParam2());
			
			out.close();
		}

		return "respuestaMicro.html";

	}
	@PostMapping("doAgregarTemperaturasMicro3")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1,
			@RequestParam("param2") String param2,@RequestParam("param3") String param3, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));
		service.agregar(temperatura);

		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			out.println(+e.getParam2());
			out.println(+e.getParam3());
			
			out.close();
		}

		return "respuestaMicro.html";

	}
	@PostMapping("doAgregarTemperaturasMicro4")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1,
			@RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));
		service.agregar(temperatura);
		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			out.println(+e.getParam2());
			out.println(+e.getParam3());
			out.println(+e.getParam4());
			

			out.close();
		}

		return "respuestaMicro.html";

	}
	@PostMapping("doAgregarTemperaturasMicro5")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1,
			@RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4,@RequestParam("param5") String param5, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		Usuario usuario = (Usuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));
		service.agregar(temperatura);
		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			out.println(+e.getParam2());
			out.println(+e.getParam3());
			out.println(+e.getParam4());
			out.println(+e.getParam5());
			

			out.close();
		}

		return "respuestaMicro.html";

	}
	@PostMapping("doAgregarTemperaturasMicro6")
	public String agregarMicro(HttpSession sesion, HttpServletResponse response, @RequestParam("param1") String param1,
			@RequestParam("param2") String param2,@RequestParam("param3") String param3,@RequestParam("param4") String param4,@RequestParam("param5") String param5,@RequestParam("param6") String param6, @RequestParam("idUsuario") String idUsuario) throws IOException {
		
		System.out.println("lo que llega: "+param1);
		LocalDateTime fecha = LocalDateTime.now().withNano(0);

		LocalDate dia = LocalDate.now();

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");

		Temperatura temperatura = new Temperatura(Integer.parseInt(param1),Integer.parseInt(param2),Integer.parseInt(param3),Integer.parseInt(param4),Integer.parseInt(param5),Integer.parseInt(param6),dia,fecha,new Usuario(Integer.parseInt(idUsuario), null, null, null));
		service.agregar(temperatura);

		List<Setpoint> dto = services.recuperarSetPoint(Integer.parseInt(idUsuario));

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for (Setpoint e : dto) {
			out.println("++++");
			out.println(+e.getParam1());
			out.println(+e.getParam2());
			out.println(+e.getParam3());
			out.println(+e.getParam4());
			out.println(+e.getParam5());
			out.println(+e.getParam6());

			out.close();
		}

		return "respuestaMicro.html";

	}



}
