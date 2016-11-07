/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	04/11/2016
 * 
 * Descrição: Classe para represetar dados de um aluno com herança
 * 
 */

public class Aluno extends Usuario {

	// atributos
	private String turma;
	private String matricula;

	// construtor
	public Aluno() {

		// Primeira forma
		// setNome("");
		// setCpf("");

		// Segunda forma
		// chama o construtor sem argumentos da
		// superclasse (Usuario)
		super();

		// chama o construtor com argumentos da
		// superclasse (Usuario)
		// super("", "");

		this.turma = "";
		this.matricula = "";
	}

	public Aluno(String nome, String cpf, String turma, String matricula) {
		// Primeira forma
		// setNome(nome);
		// setCpf(cpf);

		// Segunda forma
		// chama o construtor sem argumentos da
		// superclasse (Usuario)
		// super();

		// chama o construtor com argumentos da
		// superclasse (Usuario)
		super(nome, cpf);

		this.turma = turma;
		this.matricula = matricula;
	}

	// métodos para acessar e manipular
	// dados dos atributos

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return this.matricula;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getTurma() {
		return this.turma;
	}

	// Mostrar no console os dados do usuário
	public void imprimirDados() {
		
		// Primeira forma
		//System.out.println("Nome: " + getNome());
		//System.out.println("CPF: " + getCpf());

		// Segunda forma
		super.imprimirDados();
		
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Turma: " + getTurma());
	}
	

}








