package service;

import java.util.List;

import model.Seleccion;

public interface Seleccion_Service {
	
	
	void insertarSeleccion(Seleccion select);
	
    List<Seleccion> Labels(int idUsuario);
	
	Seleccion seleccionUna(int param);

}
