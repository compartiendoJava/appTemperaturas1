package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Seleccion;

public interface Seleccion_Repository_Spring_Data extends JpaRepository<Seleccion, Integer> {

	@Query("select e from Seleccion e where e.idUsuario=?1 ")

	List<Seleccion> todosLosLabels(int idUsuario);

	@Query("select e from Seleccion e where e.label1=?1")

	Seleccion seleccion1(int label1);

	@Query("select e from Seleccion e where e.label2=?1")

	Seleccion seleccion2(int label2);

	@Query("select e from Seleccion e where e.label3=?1")

	Seleccion seleccion3(int label3);

	@Query("select e from Seleccion e where e.label4=?1")

	Seleccion seleccion4(int label4);

	@Query("select e from Seleccion e where e.label5=?1")

	Seleccion seleccion5(int label5);
	@Query("select e from Seleccion e where e.label6=?1")

	Seleccion seleccion6(int label6);

}
