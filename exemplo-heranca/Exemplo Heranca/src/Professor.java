/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	10/10/2016
 * 
 * Descrição: Classe para represetar dados de um professor
 * 
 */

public class Professor {

	// atributos
	private String nome;
	private String cpf;
	private String disciplinas;
	private String titulacao;
	
	// construtor
	public Professor(String nome, String cpf, String disciplinas, String titulacao){
		this.nome = nome;
		this.cpf = cpf;
		this.disciplinas = disciplinas;
		this.titulacao = titulacao;
	}
	
	// métodos para acessar e manipular dados dos atributos
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setTitulacao(String titulacao){
		this.titulacao = titulacao;
	}
	
	public String getTitulacao(){
		return this.titulacao;
	}
	
	public void setDisciplinas(String disciplinas){
		this.disciplinas = disciplinas;
	}
	
	public String getDisciplinas(){
		return this.disciplinas;
	}
}
