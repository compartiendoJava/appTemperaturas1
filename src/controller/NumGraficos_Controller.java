package controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.DtoUsuario;
import model.Usuario;
import service.NumGraficos_Service;
import service.Usuario_Service;
import util.Utilidades;

import model.Numgrafico;
@CrossOrigin(origins = "*")
@Controller
public class NumGraficos_Controller {

	@Autowired
	NumGraficos_Service service;
	@Autowired
	Usuario_Service services;
	
	
    //Controlador que recibe el numero de graficos cuando te registras 
	//y al que llama antes de graficar para saber cuantos graficos tiene que graficar
	
	
	//Guarda el numero de graficos
	@GetMapping("doNumGraficos")

	public String guardaNumGraficos(@RequestParam("numGraficos") int numgraficos, HttpSession sesion) {

		System.out.println("stamos en doNumGraficos");

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");

		Usuario usu = Utilidades.convertirUsuarioADto(u);

		service.insertar(new Numgrafico(usu.getIdUsuario(), numgraficos));
		
		return "seleccion";

		
	}
   //Devuelve el numero de graficos
	
	@GetMapping(value=("doNumGraficosEntero"), produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody int NumGraficos( HttpSession sesion) {

		System.out.println("estamos en doNumGraficosEntero");

		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");

		Usuario usu = Utilidades.convertirUsuarioADto(u);

		return service.numeroGraficos(usu.getIdUsuario());

	}
}
