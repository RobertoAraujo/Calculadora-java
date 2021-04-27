package br.gov.ac.sefaz.classes;

import java.util.Objects;

public class Multiplicacao {
	int numero1;
	int numero2;
	// method 
	public int multiplicacao() {
		int resultado = (numero1 * numero2);
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
		Multiplicacao other = (Multiplicacao) obj;
		return numero1 == other.numero1 && numero2 == other.numero2;
	}

	@Override
	public String toString() {
		return "Multiplicacao [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
	
	
}
