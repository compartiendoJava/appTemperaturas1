package repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import model.Temperatura;

public interface Temperatura_Repository {
	
	
	List<Temperatura> todasLasTemperaturas(int idUsuario );
	Temperatura UnaTemperatura(int temp,int idUsuario );
	void InsertarTemperaturas(Temperatura temperatur );
	List<Temperatura>temperaturaEntreFechas(LocalDateTime fechaIni,LocalDateTime FechaFin,int idUsuario );
	List<Temperatura> maxTemperatura(int idUsuario);
	List<Temperatura> minTemperatura(int idUsuario);
	Double maxTempDia(LocalDate fecha,int idUsuario,String parametro);
	Double minTempDia(LocalDate fecha,int idUsuario,String parametro);
	Double mediaTemperatura(int idUsuario,String parametro);
	Double maxTemp(int idUsuario,String parametro);
	Double minTemp(int idUsuario,String parametro);


	
	

}
