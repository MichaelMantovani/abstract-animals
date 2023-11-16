package org.java;

public class Passerotto extends Animale {

	public Passerotto(String nome, String cibo, String verso) {
		super(nome, cibo, verso);
	}

	@Override
	public void verso() {
		System.out.println("Cip Cip");

	}

	@Override
	public void mangia() {
		System.out.println("Sto mangiando dei " + getCibo());

	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
