package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the temperatura database table.
 * 
 */
@Entity
@Table(name="temperatura")
@NamedQuery(name="Temperatura.findAll", query="SELECT t FROM Temperatura t")
public class Temperatura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idtemp;

	
	private LocalDate dia;

	
	private LocalDateTime fecha;

	private int param1;

	private int param2;

	private int param3;

	private int param4;

	private int param5;

	private int param6;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario")
	private Usuario usuario;

	public Temperatura() {
	}
	public Temperatura( int param1,   LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		
		
		
		
		
		this.usuario = usuario;
	}
	public Temperatura( int param1, int param2,  LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		
		
		
		
		this.usuario = usuario;
	}
	public Temperatura( int param1, int param2, int param3, LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		
		
		
		this.usuario = usuario;
	}

	public Temperatura( int param1, int param2, int param3, int param4, LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		
		
		this.usuario = usuario;
	}

	
	public Temperatura( int param1, int param2, int param3, int param4, int param5,LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		
		this.usuario = usuario;
	}

	public Temperatura( int param1, int param2, int param3, int param4, int param5, int param6,LocalDate dia,LocalDateTime fecha, 
			Usuario usuario) {
		super();
		this.dia = dia;
		this.fecha = fecha;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		this.param6 = param6;
		this.usuario = usuario;
	}


	public int getIdtemp() {
		return this.idtemp;
	}

	public void setIdtemp(int idtemp) {
		this.idtemp = idtemp;
	}

	

	public LocalDate getDia() {
		return dia;
	}


	public void setDia(LocalDate dia) {
		this.dia = dia;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	public int getParam1() {
		return this.param1;
	}

	public void setParam1(int param1) {
		this.param1 = param1;
	}

	public int getParam2() {
		return this.param2;
	}

	public void setParam2(int param2) {
		this.param2 = param2;
	}

	public int getParam3() {
		return this.param3;
	}

	public void setParam3(int param3) {
		this.param3 = param3;
	}

	public int getParam4() {
		return this.param4;
	}

	public void setParam4(int param4) {
		this.param4 = param4;
	}

	public int getParam5() {
		return this.param5;
	}

	public void setParam5(int param5) {
		this.param5 = param5;
	}

	public int getParam6() {
		return this.param6;
	}

	public void setParam6(int param6) {
		this.param6 = param6;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}