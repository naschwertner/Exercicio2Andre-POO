package com.teste.livro;

public class Livro {

	//Atributos 
	private String titulo;
	private String autor;
	private int anoLancamento;
	private int valor;
	private int versaoMaisRecente;
	
	//metodo construtor 
	public Livro(String titulo, String autor, int anoLancamento, int valor, int versaoMaisRecente) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoLancamento = anoLancamento;
		this.valor = valor;
		this.versaoMaisRecente = versaoMaisRecente;
	}
	
	//metodo get para retornar dados
	public String GetDados () {
		String aux = "";
		aux += "titulo: " + titulo + "\n";
		aux += "autor: " + autor + "\n";
		aux += "ano de lançamento: " + anoLancamento + "\n";
		aux += "valor: " + valor + "\n";
		aux += "versão mais recente: " + versaoMaisRecente + "\n";
		return aux;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getVersaoMaisRecente() {
		return versaoMaisRecente;
	}

	public void setVersaoMaisRecente(int versaoMaisRecente) {
		this.versaoMaisRecente = versaoMaisRecente;
	}
	
	
	
	
	
	
	
}
