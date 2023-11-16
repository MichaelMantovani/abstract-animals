package org.java;

public class Aquila extends Animale {

	public Aquila(String nome, String cibo, String verso) {
		super(nome, cibo, verso);
	}

	@Override
	public void verso() {
		System.out.println(getVerso());

	}

	@Override
	public void mangia() {
		System.out.println("Sto mangiando del " + getCibo());

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
