package org.java;

public class Cane extends Animale {

	public Cane(String nome, String cibo, String verso) {
		super(nome, cibo, verso);
	}

	@Override
	public void verso() {
		System.out.println(getVerso());

	}

	@Override
	public void mangia() {
		System.out.println("Sto mangiando dei " + getCibo());

	}

	@Override
	public String toString() {

		return super.toString() + "\n" + "Alimento preferito: " + getCibo();
	}

}