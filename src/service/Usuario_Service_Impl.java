package service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import dto.DtoUsuario;
import model.Usuario;
import repository.Usuario_Repository;
import util.Utilidades;

@Service

public class Usuario_Service_Impl implements Usuario_Service {

	@Autowired
	Usuario_Repository service;

	@Override
	public void darDeAlta(Usuario usuario) {

		service.darDeAlta(usuario);

	}

	@Override
	public void darDeBaja(Usuario usuario) {

		service.darDeBaja(usuario);

	}

	@Override
	public List<DtoUsuario> todos() {

		try {

			List<Usuario> lista = service.todos();

			return lista.stream().map(d -> Utilidades.convertirADtoUsuario(d)).collect(Collectors.toList());
		} catch (NullPointerException e) {
			e.printStackTrace();
			return null;
		}

	}

	

	@Override
	public Usuario unUsuario(int idUsuario) {

		try {
			return service.informacionUsuario(idUsuario);
		} catch (NullPointerException e) {

			e.printStackTrace();
			return null;

		}
	}

	@Override
	public void usuarioBorrar(int idUsuario) {

		service.borrar(idUsuario);

	}

}
