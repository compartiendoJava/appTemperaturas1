package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Numgrafico;
@Repository
public class NumGraficos_Repository_Impl implements NumGraficos_Repository {
	
	

	@Autowired
	NumGraficos_Repository_Spring_Data_Jpa repository;

	@Override
	public int numGraficos(int idUsuario) {
		
		Numgrafico f=repository.findById(idUsuario).get();
		
		return f.getNumgraficos();
	}

	@Override
	public void insertar(Numgrafico numgraficos) {
		
		repository.save(numgraficos);
		
	}

	@Override
	public void borrar(int idUsuario) {
		
		repository.deleteById(idUsuario);
		
	}

}
