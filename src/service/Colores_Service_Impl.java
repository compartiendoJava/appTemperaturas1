package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Colore;
import repository.Colores_Repository;

@Service
public class Colores_Service_Impl implements Colores_Service{
	
	@Autowired
	
	Colores_Repository service;

	@Override
	public List<Colore> todos(int IdUsuario) {
		
		return service.todosLosColores(IdUsuario);
	}

	@Override
	public void guardar(Colore colores) {
		
		service.guardarColores(colores);
		
	}
	
	
	

}
