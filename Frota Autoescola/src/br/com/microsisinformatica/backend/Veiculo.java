package br.com.microsisinformatica.backend;

import java.io.Serializable;

public class Veiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String instrutor, tipo, placa;
	
	Veiculo(String instrutor, String tipo, String placa) {
		this.instrutor = instrutor;
		this.tipo = tipo;
		this.placa = placa;
	}

	public String getinstrutor() {
		return instrutor;
	}

	public void setinstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String toString() {
		return placa + " | " + tipo + " | " + instrutor + "\n";
	}

}
