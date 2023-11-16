package org.java;

public class Main {
	public static void main(String[] args) {
		Cane cane1 = new Cane("Bassotto", "croccantini", "Bau Bau");

		System.out.println(cane1);
		cane1.dormi();
		cane1.verso();
		cane1.mangia();

		System.out.println("---------------------------------------");

		Passerotto passerotto1 = new Passerotto("Passerotto", "semi", "Cip Cip");
		System.out.println(passerotto1);
		passerotto1.dormi();
		passerotto1.verso();
		passerotto1.mangia();
		
		
		System.out.println("---------------------------------------");
	}
}
