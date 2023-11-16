package org.java.pojo;

import org.java.pojo.abs.Animale;
import org.java.pojo.inter.IVolante;

public class Aquila extends Animale implements IVolante {

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
	
	public void vola() {
		System.out.println("Sto volando");
	}

	@Override
	public void faiVolare() {
		vola();
		
	}

}
