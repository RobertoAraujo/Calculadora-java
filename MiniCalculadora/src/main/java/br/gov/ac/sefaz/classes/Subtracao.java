package br.gov.ac.sefaz.classes;

import java.io.Serializable;
import java.util.Objects;

public class Subtracao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int numero1;
	int numero2;
	// method 
	public int subtracao() {
		int resultado = (numero1 - numero2);
		return resultado;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero1, numero2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subtracao other = (Subtracao) obj;
		return numero1 == other.numero1 && numero2 == other.numero2;
	}

	@Override
	public String toString() {
		return "Subtracao [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
	
	
	
}
