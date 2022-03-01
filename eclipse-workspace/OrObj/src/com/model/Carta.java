package com.model;

import java.util.Objects;

public class Carta {
	
	private Integer numero;
	private Palos palo;
	
	public Carta(int numero, Palos palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	public Double getValor() {
		return Double.valueOf(this.numero);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Palos getPalo() {
		return palo;
	}

	public void setPalo(Palos palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(palo, other.palo);
	}

}
