package repository;



import model.Numgrafico;





public interface NumGraficos_Repository {
	
	
	int numGraficos(int idUsuario);
	
	void insertar(Numgrafico numgraficos);
	
	void borrar(int idUsuario);

}
