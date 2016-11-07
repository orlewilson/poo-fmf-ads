
/*
 * Programação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	07/11/2016
 * 
 * Descrição: Classe para represetar dados de 
 * 			  um usuário e que não pode ser instanciada
 * 			  (conceito de classe Abstrata)
 * 
 */

public abstract class Usuario {

	// atributos
	private String nome;
	private String cpf;

	// construtor
	public Usuario() {
		this.nome = "";
		this.cpf = "";
	}
	
	public Usuario(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}

	// métodos para acessar e manipular
	// dados dos atributos
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	// Mostrar no console os dados do usuário
	public void imprimirDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("CPF: " + getCpf());
	}
}





