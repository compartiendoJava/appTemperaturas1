package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
@Entity
@Table(name="configuracion")
public class Seleccion implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
    @Id
	private int idUsuario;
	
	
	
	private String label1;
	
	private String label2;
	
	private String label3;
	
	private String label4;
	
	private String label5;
	
	private String label6;
	
	

	public Seleccion() {
		super();
	}
	

	public Seleccion(int idUsuario, String label1, String label2, String label3, String label4,
			String label5, String label6) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.label4 = label4;
		this.label5 = label5;
		this.label6 = label6;
	}
	public Seleccion(int idUsuario, String label1, String label2, String label3, String label4,
			String label5) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.label4 = label4;
		this.label5 = label5;
	}


	public Seleccion(int idUsuario, String label1, String label2, String label3, String label4) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
		this.label4 = label4;
	}
	


	public Seleccion(int idUsuario, String label1, String label2, String label3) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
		this.label2 = label2;
		this.label3 = label3;
	}
	


	public Seleccion(int idUsuario, String label1, String label2) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
		this.label2 = label2;
	}
	


	public Seleccion(int idUsuario, String label1) {
		super();
		this.idUsuario = idUsuario;
		
		this.label1 = label1;
	}


	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	

	public String getLabel1() {
		return label1;
	}

	public void setLabel1(String label1) {
		this.label1 = label1;
	}

	public String getLabel2() {
		return label2;
	}

	public void setLabel2(String label2) {
		this.label2 = label2;
	}

	public String getLabel3() {
		return label3;
	}

	public void setLabel3(String label3) {
		this.label3 = label3;
	}

	public String getLabel4() {
		return label4;
	}

	public void setLabel4(String label4) {
		this.label4 = label4;
	}

	public String getLabel5() {
		return label5;
	}

	public void setLabel5(String label5) {
		this.label5 = label5;
	}

	public String getLabel6() {
		return label6;
	}

	public void setLabel6(String label6) {
		this.label6 = label6;
	}
	

}
