package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Numgrafico;
import repository.NumGraficos_Repository;

@Service

public class NumGraficos_Service_Impl implements NumGraficos_Service{
	
	
	@Autowired
	NumGraficos_Repository service;
	

	@Override
	public int numeroGraficos(int idUsuario) {
		
		return service.numGraficos(idUsuario);
	}


	@Override
	public void insertar(Numgrafico numgraficos) {
		
		service.insertar(numgraficos);
		
	}

}
