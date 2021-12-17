package repository;

import java.util.List;

import dto.DtoUsuario;
import model.Usuario;

public interface Usuario_Repository {
	
	void darDeAlta(Usuario usuario);
	void darDeBaja(Usuario usuario);
	List<Usuario> todos();
	Usuario informacionUsuario(int idUsuario);
	
	void borrar(int idUsuario);
	
}
