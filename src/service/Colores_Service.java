package service;

import java.util.List;

import model.Colore;

public interface Colores_Service {
	
	
	List<Colore> todos(int IdUsuario);

	void guardar(Colore colores);


}
