package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Aquila extends Animale {

	public Aquila(String nome, String cibo) {
		super(nome, cibo);
	}

	@Override
	public void verso() {
		System.out.println("Strido");

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
