package com.teste.autor;

public class Autor {

	//Atributos
	private String nome;
	private int anoInicio;

	//metodo construtor
	public Autor(String nome, int anoInicio) {
		super();
		this.nome = nome;
		this.anoInicio = anoInicio;
	}

	//Sobreposição de método
	@Override
	public String toString() {
        String aux = "";
        aux += "nome: " + nome + "\n";
        aux += "Ano inicio: " + anoInicio + "\n";
        return aux;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	
}
