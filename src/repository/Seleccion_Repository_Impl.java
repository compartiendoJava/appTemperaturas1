package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Seleccion;

@Repository
public class Seleccion_Repository_Impl implements Seleccion_Repository{
	
	@Autowired
	Seleccion_Repository_Spring_Data repository;

	@Override
	public void agregarGraficosLabels(Seleccion seleccion) {
		
		repository.save(seleccion);
		
	}

	@Override
	public List<Seleccion> todosLosLabels(int idUsuario) {
		return repository.todosLosLabels(idUsuario);
	}

	@Override
	public Seleccion seleccion(int idUsuario) {
		
		return repository.findById(idUsuario).orElse(null);
	}

}
