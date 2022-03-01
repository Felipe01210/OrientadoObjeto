package com.model;

import java.util.Arrays;

public class Baraja {
	
	private final Integer numCartas = 48;
	private final Integer cartasPorPalo = 12;
	private Integer siguiente;
	
	private Carta[] listaDeCartas;
	
	public Baraja () {
		super();
		this.listaDeCartas = new Carta[numCartas];
		
		int numPalos = Palos.values().length;
		
		for(int i = 0; i<numPalos; i++) {
			for (int j = 0; j < cartasPorPalo; j++) {
				Carta c = new Carta(j+1,Palos.values()[i]);
				System.out.println(c);
			}
		}
	}

	public Carta[] getCartas() {
		return listaDeCartas;
	}

	public void setCartas(Carta[] cartas) {
		this.listaDeCartas = cartas;
	}

	public Integer getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Integer siguiente) {
		this.siguiente = siguiente;
	}

	public Integer getNumCartas() {
		return numCartas;
	}

	public Integer getCartasPorPalo() {
		return cartasPorPalo;
	}

	@Override
	public String toString() {
		return "Baraja [cartas=" + Arrays.toString(listaDeCartas) + ", numCartas=" + numCartas + ", cartasPorPalo="
				+ cartasPorPalo + ", siguiente=" + siguiente + "]";
	}

}
