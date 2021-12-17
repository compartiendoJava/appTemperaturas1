package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Colore;
@Repository
public class Colores_Repository_Impl implements Colores_Repository {
	
	@Autowired
	
	Colores_Repository_Spring_Data_Jpa repository;

	@Override
	public List<Colore> todosLosColores(int IdUsuario) {
		
		return repository.colores(IdUsuario);
	}

	@Override
	public void guardarColores(Colore colores) {
		
		System.out.println("  el id  "+colores.getIdUsuario() +" el 1 "+ colores.getColorParam1()+ " el 2  "+ colores.getColorParam2());
		
		repository.save(colores);
	}

	@Override
	public void borrar(int idUsuario) {
		
		repository.deleteById(idUsuario);
		
	}

}
