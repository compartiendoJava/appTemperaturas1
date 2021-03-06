package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Colore;

public interface Colores_Repository_Spring_Data_Jpa extends JpaRepository<Colore,Integer>{
	
	@Query("select e from Colore e where e.idUsuario=?1 ")
	List<Colore> colores(int idUsuario);

}
