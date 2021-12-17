package service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import dto.DtoTemperatura;
import model.Temperatura;

public interface Temperatura_Service {
	
	List<DtoTemperatura> todas(int idUsuario );
	Temperatura Una(int param1,int idUsuario );
	void agregar(Temperatura temperatura );
	List<Temperatura>tempEntreFechas(LocalDateTime fechaIni,LocalDateTime FechaFin,int idUsuario );
	List<Temperatura> maxTempService(int idUsuario);
	List<Temperatura> minTempService(int idUsuario);
	
	Double mediaTemp(int idUsuario,String parametro);
	Double maxTemp(int idUsuario,String parametro);
	Double minTemp(int idUsuario,String parametro);

}
