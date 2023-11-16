package org.java;

public class Main {
public static void main(String[] args) {
	Cane cane1 = new Cane("Bassotto", "Croccantini");
	
	System.out.println(cane1);
	cane1.dormi();
	cane1.verso();
	cane1.mangia();
}
}
