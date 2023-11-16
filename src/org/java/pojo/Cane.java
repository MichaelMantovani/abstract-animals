package org.java.pojo;

import org.java.pojo.abs.Animale;

public class Cane extends Animale {

	public Cane(String nome, String cibo) {
		super(nome, cibo);
	}

	@Override
	public void verso() {
		System.out.println("Abbaio");

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