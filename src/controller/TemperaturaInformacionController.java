package controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import dto.DtoUsuario;
import service.Temperatura_Service;

@CrossOrigin(origins = "*")
@Controller
public class TemperaturaInformacionController {
	
	//Controlador que se encarga de calcular la Maxima Temperatura ,Minima temperatura y la Media de las 

	@Autowired
	Temperatura_Service service;

	@GetMapping(value = "doMaximaTemperatura", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody Double maxima(@RequestParam("parametro")String parametro,HttpSession sesion) {
		System.out.println("hola"+parametro);

		DtoUsuario usuario = (DtoUsuario) sesion.getAttribute("usuario");
		Double tempMax = service.maxTemp(usuario.getIdUsuario(),parametro);
		
		return tempMax;

	}

	@GetMapping(value = "doMinimaTemperatura", produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody Double minima(@RequestParam("parametro")String parametro,HttpSession sesion) {

		DtoUsuario usuarios = (DtoUsuario) sesion.getAttribute("usuario");

		Double tempMin = service.minTemp(usuarios.getIdUsuario(),parametro);

		return tempMin;

	}

	
	@GetMapping(value = "doMediaTemperatura", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody double mediaTemperatura(@RequestParam("parametro")String parametro,@SessionAttribute("usuario") DtoUsuario usuario) {

		return service.mediaTemp(usuario.getIdUsuario(),parametro);
	}

}
