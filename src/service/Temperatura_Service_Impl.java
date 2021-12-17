package service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.DtoTemperatura;
import model.Seleccion;
import model.Temperatura;
import repository.Seleccion_Repository;
import repository.Temperatura_Repository;
import util.Utilidades;

@Service

public class Temperatura_Service_Impl implements Temperatura_Service {

	@Autowired
	Temperatura_Repository service;
	@Autowired
   Seleccion_Repository services;
	@Override
	public List<DtoTemperatura> todas(int idUsuario) {

		if (service.todasLasTemperaturas(idUsuario) != null) {

			List<Temperatura> todas = service.todasLasTemperaturas(idUsuario);

			return todas.stream().map(t->Utilidades.convertirADtoTempraratura6(t)).collect(Collectors.toList());

		}

		return null;
	}

	@Override
	public Temperatura Una(int param1, int idUsuario) {

		if (service.UnaTemperatura( param1, idUsuario) != null) {

			return service.UnaTemperatura( param1, idUsuario);
		}
		return null;
	}

	@Override
	public void agregar(Temperatura temperatura) {

		service.InsertarTemperaturas(temperatura);
	}

	@Override
	public List<Temperatura> tempEntreFechas(LocalDateTime fechaIni, LocalDateTime FechaFin, int idUsuario) {
		if (fechaIni != null && FechaFin != null) {

			return service.temperaturaEntreFechas(fechaIni, FechaFin, idUsuario);
		}
		return null;
	}

	@Override
	public List<Temperatura> maxTempService(int idUsuario) {

		return service.maxTemperatura(idUsuario);
	}

	@Override
	public List<Temperatura> minTempService(int idUsuario) {

		return service.minTemperatura(idUsuario);
	}

	

	@Override
	public Double mediaTemp(int idUsuario,String parametro) {

		return service.mediaTemperatura(idUsuario,parametro);
	}

	@Override
	public Double maxTemp(int idUsuario, String parametro) {
      List<Seleccion>seleccion=services.todosLosLabels(idUsuario);
		
		
		List<Temperatura> lista = (List<Temperatura>) service.todasLasTemperaturas(idUsuario);
		
		
		
		for(Seleccion e:seleccion) {
			if(parametro.equals(e.getLabel1())){
			return lista.stream().mapToDouble(p->p.getParam1()).max().getAsDouble();										
			}
			if(parametro.equals(e.getLabel2())){
				return lista.stream().mapToDouble(p->p.getParam2()).max().getAsDouble();
			}
			if(parametro.equals(e.getLabel3())){
				return lista.stream().mapToDouble(p->p.getParam3()).max().getAsDouble();
			}
			if(parametro.equals(e.getLabel4())){
				return lista.stream().mapToDouble(p->p.getParam4()).max().getAsDouble();
										
			}
			if(parametro.equals(e.getLabel5())){
				return lista.stream().mapToDouble(p->p.getParam5()).max().getAsDouble();
			}
			if(parametro.equals(e.getLabel6())){
				return lista.stream().mapToDouble(p->p.getParam6()).max().getAsDouble();
			}
			
			}
		
			return (double) 0;
		
	}

	@Override
	public Double minTemp(int idUsuario, String parametro) {
List<Seleccion>seleccion=services.todosLosLabels(idUsuario);
		
		
		List<Temperatura> lista = (List<Temperatura>) service.todasLasTemperaturas(idUsuario);
		
		
		
		for(Seleccion e:seleccion) {
			if(parametro.equals(e.getLabel1())){
			return lista.stream().mapToDouble(p->p.getParam1()).min().getAsDouble();										
			}
			if(parametro.equals(e.getLabel2())){
				return lista.stream().mapToDouble(p->p.getParam2()).min().getAsDouble();
			}
			if(parametro.equals(e.getLabel3())){
				return lista.stream().mapToDouble(p->p.getParam3()).min().getAsDouble();
			}
			if(parametro.equals(e.getLabel4())){
				return lista.stream().mapToDouble(p->p.getParam4()).min().getAsDouble();
										
			}
			if(parametro.equals(e.getLabel5())){
				return lista.stream().mapToDouble(p->p.getParam5()).min().getAsDouble();
			}
			if(parametro.equals(e.getLabel6())){
				return lista.stream().mapToDouble(p->p.getParam6()).min().getAsDouble();
			}
			
			}
		
			return (double) 0;
	}
	

}
