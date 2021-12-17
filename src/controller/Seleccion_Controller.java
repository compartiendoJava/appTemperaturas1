package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dto.DtoUsuario;
import model.Seleccion;
import model.Usuario;
import service.Seleccion_Service;
import util.Utilidades;

@Controller
public class Seleccion_Controller {
	
	//Controlador que guarda el nombre de los parametros y posteriormente  los llama 
	//antes de graficar para nombrar los parametros en los graficos
	
	
	@Autowired
	Seleccion_Service service;
	@GetMapping(value=("doSeleccionTodosLabels"),produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Seleccion> todosLabels(HttpSession sesion){
		
		
		DtoUsuario u = (DtoUsuario) sesion.getAttribute("usuario");

		Usuario usu = Utilidades.convertirUsuarioADto(u);
		
		List<Seleccion> seleccion=service.Labels(usu.getIdUsuario());
		seleccion.forEach(s->System.out.println(s.getLabel1()));
		return seleccion;
		
	}
	@PostMapping("doAgregarSeleccion")
	public String agregarset(HttpSession sesion, Seleccion seleccion) throws IOException {
		System.out.println("estamos en seleccionar"+ seleccion.getLabel1());
		DtoUsuario u=(DtoUsuario) sesion.getAttribute("usuario");
		
		seleccion.setIdUsuario(u.getIdUsuario());
		service.insertarSeleccion(seleccion);
		
		return "seleccionColores";

	}
	

}
