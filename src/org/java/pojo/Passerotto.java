package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Passerotto extends Animale implements IVolante {

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

	public void vola() {
		System.out.println("Sto volando");
	}

	
}
