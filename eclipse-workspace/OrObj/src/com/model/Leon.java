package com.model;

public class Leon extends Animal implements Sonido{

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Estoy comiendo");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Estoy durmiendo");
	}
	
	public String emitirSonido() {
		return "pene";
	}
	
	public void nutrirse() {
		System.out.println("El leon es carnivoro");
	}
	
	public void procrear() {
		System.out.println("El leon es mamifero");
	}
	
	public void relacionarse() {
		System.out.println("Los leones viven en manadas, con jerarquia entre machos");
	}
	
	public void moverse() {
		System.out.println("Los leones son territoriales y se desplazan en busca de alimento");
	}

}
