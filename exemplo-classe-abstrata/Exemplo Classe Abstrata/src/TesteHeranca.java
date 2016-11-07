/*
 * Programação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	17/10/2016
 * 
 * Descrição: Classe para rodar o projeto
 * 
 */

public class TesteHeranca {

	public static void main(String[] args) {
		
		// Criação de objetos
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Orlewilson");
		aluno1.setCpf("123.123.123-12");
		aluno1.setMatricula("12345");
		aluno1.setTurma("ADS");

		Aluno aluno2 = new Aluno("Maia", 
				"123", "ADS", "1234");
		
		aluno1.imprimirDados();
		aluno2.imprimirDados();

	}

}









