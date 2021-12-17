package repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Temperatura;

@Repository
public class Temperatura_Repository_Impl implements Temperatura_Repository {
	
	@Autowired
	Temperatura_Repository_Spring_Data_Jpa repository;

	@Override
	public List<Temperatura> todasLasTemperaturas(int idUsuario) {
		
		return repository.todasLasTemperaturas(idUsuario);
	}

	@Override
	public Temperatura UnaTemperatura(int param1, int idUsuario) {
		
		return repository.UnaTemperatura(idUsuario, param1);
	}

	@Override
	public void InsertarTemperaturas(Temperatura temperatur) {
		
		repository.save(temperatur);
		
	}

	@Override
	public List<Temperatura> temperaturaEntreFechas(LocalDateTime fechaIni, LocalDateTime FechaFin, int idUsuario) {
		
		return repository.temperaturaEntreFechas(fechaIni, FechaFin, idUsuario);
	}

	@Override
	public List<Temperatura> maxTemperatura(int idUsuario) {
		System.out.println("impl");
		return repository.todasLasTemperaturas(idUsuario);
	}

	@Override
	public List<Temperatura> minTemperatura(int idUsuario) {
		System.out.println("impl");
		return  repository.todasLasTemperaturas(idUsuario);
	}

	@Override
	public Double maxTempDia(LocalDate fecha,int idUsuario,String parametro ) {
		
		return repository.maxTemperaturaDia(idUsuario,fecha,parametro);
	}

	@Override
	public Double  minTempDia(LocalDate fecha, int idUsuario,String parametro) {
		
		return repository.minTemperatura(idUsuario, fecha,parametro);
	}

	@Override
	public Double mediaTemperatura(int idUsuario,String parametro) {
		
		return repository.mediaTemperatura(idUsuario,parametro);
	}

	@Override
	public Double maxTemp(int idUsuario,  String parametro) {
		
		return null;
	}

	@Override
	public Double minTemp(int idUsuario, String parametro) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	

}
