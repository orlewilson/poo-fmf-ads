package br.com.fmf.dados;

/*
 * Disciplina: 	Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		03/10/2016
 * 
 * Autor:		Orlewilson B. Maia
 * Descrição:	Classe para representar um smartphone
 * 				
 */

public class Smartphone {

	// Atributos
	private String cor;
	private String marca;
	private String sistemaOperacional;
	private String resolucao;
	private boolean memoriaExpansivel;
	
	// Construtor
	public Smartphone(){
		this.cor = "";
		this.marca = "";
		this.sistemaOperacional = "";
		this.resolucao = "";
		this.memoriaExpansivel = false;
	}
	
	public Smartphone(String cor, String marca, 
			String sistemaOperacional,
			String resolucao,
			boolean memoriaExpansivel){
		this.cor = cor;
		this.marca = marca;
		this.sistemaOperacional = sistemaOperacional;
		this.resolucao = resolucao;
		this.memoriaExpansivel = memoriaExpansivel;
	}
	
	
	// Métodos para acesso aos atributos
	public void setCor(String cor){
		this.cor = cor;
	}

	public String getCor(){
		return this.cor;
	}
	
	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return this.marca;
	}

	public void setSistemaOperacional(String sistemaOperacional){
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getSistemaOperacional(){
		return this.sistemaOperacional;
	}
	
	public void setResolucao(String resolucao){
		this.resolucao = resolucao;
	}

	public String getResolucao(){
		return this.resolucao;
	}
	
	public void setMemoriaExpansivel(boolean memoriaExpansivel){
		this.memoriaExpansivel = memoriaExpansivel;
	}

	public boolean getMemoriaExpansivel(){
		return this.memoriaExpansivel;
	}
}






