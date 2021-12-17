package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the colores database table.
 * 
 */
@Entity
@Table(name="colores")
@NamedQuery(name="Colore.findAll", query="SELECT c FROM Colore c")
public class Colore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	
	private int idUsuario;

	private String colorParam1;

	private String colorParam2;

	private String colorParam3;

	private String colorParam4;

	private String colorParam5;

	private String colorParam6;

	public Colore() {
	}
	

	

	public Colore(int idUsuario, String colorParam1) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
	}




	public Colore(int idUsuario, String colorParam1, String colorParam2) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
		this.colorParam2 = colorParam2;
	}




	public Colore(int idUsuario, String colorParam1, String colorParam2, String colorParam3) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
		this.colorParam2 = colorParam2;
		this.colorParam3 = colorParam3;
	}




	public Colore(int idUsuario, String colorParam1, String colorParam2, String colorParam3, String colorParam4) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
		this.colorParam2 = colorParam2;
		this.colorParam3 = colorParam3;
		this.colorParam4 = colorParam4;
	}




	public Colore(int idUsuario, String colorParam1, String colorParam2, String colorParam3, String colorParam4,
			String colorParam5) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
		this.colorParam2 = colorParam2;
		this.colorParam3 = colorParam3;
		this.colorParam4 = colorParam4;
		this.colorParam5 = colorParam5;
	}




	public Colore(int idUsuario, String colorParam1, String colorParam2, String colorParam3, String colorParam4,
			String colorParam5, String colorParam6) {
		super();
		this.idUsuario = idUsuario;
		this.colorParam1 = colorParam1;
		this.colorParam2 = colorParam2;
		this.colorParam3 = colorParam3;
		this.colorParam4 = colorParam4;
		this.colorParam5 = colorParam5;
		this.colorParam6 = colorParam6;
	}


	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getColorParam1() {
		return this.colorParam1;
	}

	public void setColorParam1(String colorParam1) {
		this.colorParam1 = colorParam1;
	}

	public String getColorParam2() {
		return this.colorParam2;
	}

	public void setColorParam2(String colorParam2) {
		this.colorParam2 = colorParam2;
	}

	public String getColorParam3() {
		return this.colorParam3;
	}

	public void setColorParam3(String colorParam3) {
		this.colorParam3 = colorParam3;
	}

	public String getColorParam4() {
		return this.colorParam4;
	}

	public void setColorParam4(String colorParam4) {
		this.colorParam4 = colorParam4;
	}

	public String getColorParam5() {
		return this.colorParam5;
	}

	public void setColorParam5(String colorParam5) {
		this.colorParam5 = colorParam5;
	}

	public String getColorParam6() {
		return this.colorParam6;
	}

	public void setColorParam6(String colorParam6) {
		this.colorParam6 = colorParam6;
	}

}