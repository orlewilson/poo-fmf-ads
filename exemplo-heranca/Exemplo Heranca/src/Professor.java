/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	04/11/2016
 * 
 * Descrição: Classe para representar dados de um professor com herança
 * 
 */

public class Professor extends Usuario {

	// atributos
	private String disciplinas;
	private String titulacao;

	// construtor
	public Professor(String nome, String cpf, String disciplinas,
			String titulacao) {
		super(nome, cpf);

		this.disciplinas = disciplinas;
		this.titulacao = titulacao;
	}

	// métodos para acessar e manipular dados dos atributos
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getTitulacao() {
		return this.titulacao;
	}

	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getDisciplinas() {
		return this.disciplinas;
	}

	public void imprimirDados() {

		// Primeira forma
		// System.out.println("Nome: " + getNome());
		// System.out.println("CPF: " + getCpf());

		// Segunda forma
		super.imprimirDados();

		System.out.println("Titulação: " + getTitulacao());
		System.out.println("Disciplinas: " + getDisciplinas());
	}
}
