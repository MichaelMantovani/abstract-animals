package org.java;

import org.java.pojo.Aquila;
import org.java.pojo.Cane;
import org.java.pojo.Delfino;
import org.java.pojo.Passerotto;
import org.java.pojo.abs.Animale;
import org.java.pojo.inter.INuotante;
import org.java.pojo.inter.IVolante;

public class Main {
	public static void main(String[] args) {
		Cane cane = new Cane("Bassotto", "croccantini");

		Passerotto passerotto = new Passerotto("Passerotto", "semi");

		Aquila aquila = new Aquila("Aquila", "pesce");

		Delfino delfino = new Delfino("Delfino", "pesce");

		Animale[] animali = new Animale[4];

		animali[0] = cane;
		animali[1] = passerotto;
		animali[2] = aquila;
		animali[3] = delfino;

		for (int x = 0; x < animali.length; x++) {
			animali[x].dormi();
			animali[x].verso();
			animali[x].mangia();
			System.out.println("------------------------------");
		}
		
		
		
		Animale[] volante = new Animale[2];
		
		volante[0] = aquila;
		volante[1] = passerotto;
		 
		for(int x=0 ; x < volante.length; x++) {
			faiVolare((IVolante) volante[x]);
		}
		
		
		faiNuotare(delfino);
	}
	
	public static void faiVolare (IVolante volante) {
		volante.vola();
	}
	
	public static void faiNuotare(INuotante nuotante) {
		nuotante.nuota();
	}
	
	
}
