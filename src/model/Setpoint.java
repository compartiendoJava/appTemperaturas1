package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the setpoint database table.
 * 
 */
@Entity
@Table(name="setpoint")

public class Setpoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private int param1;
	private int param2;
	private int param3;
	private int param4;
	private int param5;
	private int param6;
	public Setpoint(int idUsuario, int param1) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
	}
	public Setpoint(int idUsuario, int param1, int param2) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
		this.param2 = param2;
	}
	public Setpoint(int idUsuario, int param1, int param2, int param3) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
	}
	public Setpoint(int idUsuario, int param1, int param2, int param3, int param4) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
	}
	public Setpoint(int idUsuario, int param1, int param2, int param3, int param4, int param5) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
	}
	public Setpoint(int idUsuario, int param1, int param2, int param3, int param4, int param5, int param6) {
		super();
		this.idUsuario = idUsuario;
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		this.param6 = param6;
	}
	public Setpoint() {
		super();
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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