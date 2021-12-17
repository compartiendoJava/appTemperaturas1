package util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

import dto.DtoTemperatura;
import dto.DtoUsuario;
import model.Temperatura;
import model.Usuario;




public class Utilidades {
	
	public static Usuario convertirUsuarioADto(DtoUsuario dtoUsuario) {
		
		Usuario usu=new Usuario();

		        usu.setIdUsuario(dtoUsuario.getIdUsuario());
			    usu.setNombre(dtoUsuario.getNombre());
				usu.setPassword(dtoUsuario.getPassword());
				usu.setEmail( dtoUsuario.getEmail());
				
				return usu;
	}

	
		public static LocalDate convertirDateALocalDate(Date fecha) {	//convertir Date a LocalDate
			
			LocalDate ld=Instant.ofEpochMilli(fecha.getTime()) //Instant
					.atZone(ZoneId.systemDefault()) //ZoneDateTime
					.toLocalDate();
			System.out.println(ld);
			
			return ld;
		}
		public static Date convertirLocalDateADate(LocalDate fecha) {//convertir LocalDate a Date
			
			
			
			Date fe=Date.from(
					fecha.atStartOfDay(ZoneId.systemDefault()) //ZoneDateTime
					.toInstant()); //Instrant
			System.out.println(fe);
			return fe;
		}
		
		public static String cambioFormato(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			LocalDateTime date = LocalDateTime.parse(fecha, inputFormatter);
			String formattedDate = outputFormatter.format(date.plusHours(1));
			
			return formattedDate;
		}
		public static String cambioFormato3(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd ", Locale.ENGLISH);
			LocalDateTime date = LocalDateTime.parse(fecha, inputFormatter);
			String formattedDate = outputFormatter.format(date.plusHours(1));
			
			return formattedDate;
		}
		public static String cambioFormato5(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			LocalDateTime date = LocalDateTime.parse(fecha, inputFormatter);
			String formattedDate = outputFormatter.format(date.plusHours(1));
			
			return formattedDate;
		}
		public static String cambioFormato4(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
			LocalDateTime date = LocalDateTime.parse(fecha, inputFormatter);
			String formattedDate = outputFormatter.format(date.plusHours(1));
			
			return formattedDate;
		}
		public static String cambioFormato2(LocalDateTime fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			String date = outputFormatter.format(fecha);
			
			
			return date;
		}
		public static LocalDateTime cambioFormato2(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			LocalDateTime local=LocalDateTime.parse(fecha,outputFormatter);
			
			
			
			return local;
		}
		public static DtoTemperatura convertirADtoTempraratura1(Temperatura temperatura) {

			return new DtoTemperatura(temperatura.getParam1() ,temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}
		public static DtoTemperatura convertirADtoTempraratura2(Temperatura temperatura) {
			
			//System.out.println("el idUsuario"+temperatura.getUsuario().getIdUsuario()+" el param1 "+temperatura.getParam1()+" el param2  "+temperatura.getParam2());

			return new DtoTemperatura(temperatura.getParam1(), temperatura.getParam2() ,temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}
		public static DtoTemperatura convertirADtoTempraratura3(Temperatura temperatura) {

			return new DtoTemperatura(temperatura.getParam1(), temperatura.getParam2(),temperatura.getParam3() ,temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}
		public static DtoTemperatura convertirADtoTempraratura4(Temperatura temperatura) {

			return new DtoTemperatura(temperatura.getParam1(), temperatura.getParam2(),temperatura.getParam3(),temperatura.getParam4() ,temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}
		public static DtoTemperatura convertirADtoTempraratura5(Temperatura temperatura) {

			return new DtoTemperatura(temperatura.getParam1(), temperatura.getParam2(),temperatura.getParam3(),temperatura.getParam4(),temperatura.getParam5(),temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}
		public static DtoTemperatura convertirADtoTempraratura6(Temperatura temperatura) {

			return new DtoTemperatura(temperatura.getParam1(), temperatura.getParam2(),temperatura.getParam3(),temperatura.getParam4(),temperatura.getParam5(),temperatura.getParam6() ,temperatura.getFecha().toString(),
					temperatura.getUsuario().getIdUsuario());
		}

		public static Temperatura candidatoEntityBuilder(DtoTemperatura dtoTemperatura) {

			Temperatura entity = new Temperatura();
			entity.getIdtemp();
			entity.setParam1(dtoTemperatura.getParam1());
			entity.setParam2(dtoTemperatura.getParam2());
			entity.setParam3(dtoTemperatura.getParam3());
			entity.setParam4(dtoTemperatura.getParam4());
			entity.setParam5(dtoTemperatura.getParam5());
			entity.setParam6(dtoTemperatura.getParam6());
			
			entity.setFecha(LocalDateTime.parse(dtoTemperatura.getFecha()));
			entity.setDia(dtoTemperatura.getDia());
			entity.setUsuario(new Usuario());

			return entity;
		}
		public static Usuario candidatoEntityBuilder(DtoUsuario dtoUsuario) {

			Usuario entity = new Usuario();
			entity.setIdUsuario(entity.getIdUsuario());
			entity.setNombre(entity.getNombre());
			entity.setPassword(entity.getPassword());
			entity.setEmail(entity.getEmail());
			entity.setFoto(entity.getFoto());
			
			

			return entity;
		}

		
		public static String cambioFormatoString(String fecha) {
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ENGLISH);
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm", Locale.ENGLISH);
			LocalDate date = LocalDate.parse(fecha, inputFormatter);
			String formattedDate = outputFormatter.format(date);

			return formattedDate;
		}

		
		public static DtoUsuario convertirADtoUsuario(Usuario usuario) {

			return new DtoUsuario(usuario.getIdUsuario(), usuario.getNombre(), usuario.getPassword(), usuario.getEmail());
		}

		
	}

		
		
	




