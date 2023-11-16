package org.java;

public class Cane extends Animale {
	private String cibo;

	public String getCibo() {
		return cibo;
	}

	public void setCibo(String cibo) {
		this.cibo = cibo;
	}

	public Cane(String nome, String cibo) {
		super(nome);
		setCibo(cibo);

	}

	@Override
	public void verso() {
		System.out.println("Bau Bau");

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
