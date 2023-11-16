package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;

public class Main {
	public static void main(String[] args) {
		Cane cane1 = new Cane("Bassotto", "croccantini");

		System.out.println(cane1);
		cane1.dormi();
		cane1.verso();
		cane1.mangia();

		System.out.println("---------------------------------------");

		Passerotto passerotto1 = new Passerotto("Passerotto", "semi");
		System.out.println(passerotto1);
		passerotto1.dormi();
		passerotto1.verso();
		passerotto1.mangia();
		passerotto1.faiVolare();

		System.out.println("---------------------------------------");

		Aquila aquila1 = new Aquila("Aquila", "pesce");
		System.out.println(aquila1);
		aquila1.dormi();
		aquila1.verso();
		aquila1.mangia();
		aquila1.faiVolare();

		System.out.println("---------------------------------------");

		Delfino delfino = new Delfino("Delfino", "pesce");
		System.out.println(delfino);
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		delfino.faiNuotare();

	}
}
