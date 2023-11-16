package org.java.pojo.abs;

public abstract class Animale {
	private String nome;
	private String cibo;

	public Animale(String nome, String cibo) {
		setNome(nome);
		setCibo(cibo);

	}

	public String getCibo() {
		return cibo;
	}

	public void setCibo(String cibo) {
		this.cibo = cibo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void dormi() {
		System.out.println("Sto dormendo, Zzz");
	}

	public abstract void verso();

	public abstract void mangia();

	@Override
	public String toString() {
		return "Animale: " + getNome();
	}

}
