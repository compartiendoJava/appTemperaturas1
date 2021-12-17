package service;

import java.util.List;

import dto.DtoUsuario;
import model.Usuario;

public interface Usuario_Service {
	
	void darDeAlta(Usuario usuario);
	void darDeBaja(Usuario usuario);
	List<DtoUsuario> todos();
	
	Usuario unUsuario(int idUsuario);
	void usuarioBorrar(int idUsuario);


}
