package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Seleccion;
import repository.Seleccion_Repository;

@Service
public class Seleccion_Service_Impl implements Seleccion_Service {
	
	@Autowired
	Seleccion_Repository service;

	@Override
	public void insertarSeleccion(Seleccion select) {
		
		service.agregarGraficosLabels(select);
		
	}

	@Override
	public List<Seleccion> Labels(int idUsuario) {
		
		return service.todosLosLabels(idUsuario);
	}

	@Override
	public Seleccion seleccionUna(int idUsuario) {
		
		return service.seleccion(idUsuario);
	}
	
	

}
