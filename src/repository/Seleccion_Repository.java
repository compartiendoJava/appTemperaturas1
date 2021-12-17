package repository;

import java.util.List;

import model.Seleccion;

public interface Seleccion_Repository {
	
	void agregarGraficosLabels(Seleccion seleccion);
	
	List<Seleccion> todosLosLabels(int idUsuario);
	
	Seleccion seleccion(int label);

}
