package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the numgraficos database table.
 * 
 */
@Entity
@Table(name="numgraficos")

public class Numgrafico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private int numgraficos;

	public Numgrafico() {
	}

	public Numgrafico(int idUsuario, int numgraficos) {
		super();
		this.idUsuario = idUsuario;
		this.numgraficos = numgraficos;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getNumgraficos() {
		return this.numgraficos;
	}

	public void setNumgraficos(int numgraficos) {
		this.numgraficos = numgraficos;
	}

}