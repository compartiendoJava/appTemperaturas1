package dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DtoTemperatura {
	
	private int idtemp1;
	private int idUsuario;
	private LocalDate dia;

	private String fecha ;

	private int param1;
	private int param2;
	private int param3;
	private int param4;
	private int param5;
	private int param6;
	
	public DtoTemperatura(int param1,String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		
	}
	public DtoTemperatura(int param1, int param2,String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		
	}
	public DtoTemperatura(int param1, int param2, int param3,String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		
	}
	public DtoTemperatura(int param1, int param2, int param3, int param4,
			String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		
	}
	public DtoTemperatura(int param1, int param2, int param3, int param4,
			int param5, String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		
	}
	
	public DtoTemperatura(int param1, int param2, int param3, int param4,
			int param5, int param6,String fecha,int idUsuario ) {
		super();
		this.idUsuario = idUsuario;
		
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		this.param6 = param6;
	}



	public DtoTemperatura(int param1, int param2, int idUsuario, LocalDate dia) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		
		this.idUsuario = idUsuario;
		this.dia = dia;
	}

	

	
	

	public DtoTemperatura() {
		super();
	}
	public int getIdtemp1() {
		return idtemp1;
	}

	public void setIdtemp1(int idtemp1) {
		this.idtemp1 = idtemp1;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getParam1() {
		return param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}

	public int getParam3() {
		return param3;
	}

	public void setParam3(int param3) {
		this.param3 = param3;
	}

	public int getParam4() {
		return param4;
	}

	public void setParam4(int param4) {
		this.param4 = param4;
	}

	public int getParam5() {
		return param5;
	}

	public void setParam5(int param5) {
		this.param5 = param5;
	}

	public int getParam6() {
		return param6;
	}

	public void setParam6(int param6) {
		this.param6 = param6;
	}
	
	
	
	

	

}
