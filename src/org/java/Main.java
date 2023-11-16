package org.java;

public class Main {
	public static void main(String[] args) {
		Cane cane1 = new Cane("Bassotto", "croccantini", "Abbaio");

		System.out.println(cane1);
		cane1.dormi();
		cane1.verso();
		cane1.mangia();

		System.out.println("---------------------------------------");

		Passerotto passerotto1 = new Passerotto("Passerotto", "semi", "Cinguetto");
		System.out.println(passerotto1);
		passerotto1.dormi();
		passerotto1.verso();
		passerotto1.mangia();

		System.out.println("---------------------------------------");

		Aquila aquila1 = new Aquila("Aquila", "pesce", "Strido");
		System.out.println(aquila1);
		aquila1.dormi();
		aquila1.verso();
		aquila1.mangia();

		System.out.println("---------------------------------------");

	}
}
