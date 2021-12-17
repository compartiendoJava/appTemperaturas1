package repository;

import java.util.List;

import model.Colore;

public interface Colores_Repository {

	List<Colore> todosLosColores(int IdUsuario);

	void guardarColores(Colore colores);
	
	
	void borrar (int idUsuario);

}
