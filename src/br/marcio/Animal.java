package br.marcio;

public class Animal {

	private String nome;
	private String caracteristica;

	public Animal() {

	}

	public Animal(String nome, String caracteristica) {
		super();
		this.nome = nome;
		this.caracteristica = caracteristica;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
}
