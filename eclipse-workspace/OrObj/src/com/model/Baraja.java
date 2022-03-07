package com.model;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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
	
	public void barajar() {
		
		for (int i = 0; i <numCartas;i++) {
			int numAleatorio = ThreadLocalRandom.current().nextInt(0,numCartas);
			int[] numAnteriores = new int [48];
			int[] posicionesOcupadas = new int[48];
			for (int j = 0; j<numAnteriores.length;j++) {
				if (numAleatorio!=numAnteriores[j]) {
					int posicionAPoner = ThreadLocalRandom.current().nextInt(0,numCartas);
				}
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
