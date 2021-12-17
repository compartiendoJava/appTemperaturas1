package controller;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.SessionAttribute;

import dto.DtoTemperatura;
import dto.DtoUsuario;
import model.Temperatura;
import model.Usuario;
import service.SetPoint_Service;
import service.Temperatura_Service;
import util.Utilidades;

@CrossOrigin(origins = "*")
@Controller
public class TemperaturaController {
   //Controllador que se encarga de llamar a los parametros para mostrar ,
	//te devuelve todas la temperaturas, las temperaturas entre fechas
	@Autowired
	Temperatura_Service service;

	@Autowired
	SetPoint_Service services;

	@GetMapping(value = "doTodasTemperaturas", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<DtoTemperatura> temperaturas(@SessionAttribute("usuario") DtoUsuario usuario) {

		List<DtoTemperatura> lista = service.todas(usuario.getIdUsuario());
		
		lista.forEach(l->System.out.println("estamos llamando desde todas"+l.getParam1()+l.getParam2()));

		return lista;
	}

	

	

	@GetMapping(value = "doMostrarTemperaturas", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<DtoTemperatura> temperatura(HttpSession sesion) {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		List<DtoTemperatura> listaString = service.todas(usuarios.getIdUsuario());

		return listaString;
	}
   //Devuelve las temperaturas entre fechas que anteriormente capturo en un atributo de sesion
	
	@GetMapping(value = "doMostrarTemperaturaEntreFechas", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody List<DtoTemperatura> temp(HttpSession sesion) {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String fecha1 = (String) sesion.getAttribute("Fecha1");
		String fecha2 = (String) sesion.getAttribute("Fecha2");
		System.out.println("esto es lo que dice que null: " + fecha1 + " la otra: " + fecha2);
		LocalDateTime fech1 = LocalDateTime.parse(fecha1, format);
		LocalDateTime fech2 = LocalDateTime.parse(fecha2, format);

		System.out.println("esta es fech1   " + fech1 + "  esta es fech2  " + fech2);

		List<Temperatura> listas = service.tempEntreFechas(fech1, fech2, usuarios.getIdUsuario());

		List<DtoTemperatura> listaFechas = new ArrayList<>();

		for (Temperatura e : listas) {

			listaFechas.add(new DtoTemperatura(e.getParam1(), e.getParam2(),e.getParam3(), e.getParam4(),e.getParam5(), e.getParam6(),
					e.getFecha().toString(),usuarios.getIdUsuario()));

		}
		listaFechas.forEach(l -> System.out.println(l.getFecha()));

		
			

			
			return listaFechas;
		
	}
    //Recibe la fechas las cambia de formato y las mete en un atributo de sesion que las deja listas para ser llamadas
	
	@PostMapping(value=("doTemperaturaEntreFechas"),produces=MediaType.APPLICATION_JSON_VALUE)

	public String temperaturaFechas(@RequestParam("fecha1") String fechaIni, @RequestParam("fecha2") String fechaFin,
			HttpSession sesion) throws ParseException, FileNotFoundException,DateTimeParseException {

		//System.out.println("esta es la fecha en doTemperaturaEntreFechas" + fechaIni + " yesta la otra" + fechaFin);
		
			if(fechaIni!=""&&fechaFin!="") {
			sesion.setAttribute("Fecha1", Utilidades.cambioFormato5(fechaIni));
			sesion.setAttribute("Fecha2", Utilidades.cambioFormato5(fechaFin));
			
			}
		
		return "graficoEntreFechas.html";

	}
}
