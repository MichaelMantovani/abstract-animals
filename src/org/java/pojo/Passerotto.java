package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Passerotto extends Animale {

	public Passerotto(String nome, String cibo) {
		super(nome, cibo);
	}

	@Override
	public void verso() {
		System.out.println("Cinguetto");

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
