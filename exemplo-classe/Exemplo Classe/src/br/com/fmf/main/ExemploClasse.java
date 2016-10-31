package br.com.fmf.main;

/*
 * Disciplina: 	Programação Orientada a Objetos
 * Professor:	Orlewilson Bentes Maia
 * Data:		03/10/2016
 * 
 * Autor:		Orlewilson B. Maia
 * Descrição:	Testar objetos a partir da classe 
 * 				smartphone
 * 				
 */

// importar classes de outros pacotes
import br.com.fmf.dados.Smartphone;

public class ExemploClasse {

	// método para executar o projeto
	public static void main(String[] args) {
		
		// Criando objetos
		//Smartphone galaxyS6 = new Smartphone();
		Smartphone galaxyS6 = 
				new Smartphone("Dourado",
						"Samsung",
						"Android",
						"3600x1800",
						true);
		
		// Alterando o conteúdo de cada atributo
//		galaxyS6.setSistemaOperacional("Android");
//		galaxyS6.setCor("Dourado");
//		galaxyS6.setMarca("Samsung");
//		galaxyS6.setMemoriaExpansivel(true);
//		galaxyS6.setResolucao("3600x1800");
		
		// Recuperando o conteúdo de cada atributo
		System.out.println("Marca: " + 
				galaxyS6.getMarca());
		System.out.println("Cor: " + 
				galaxyS6.getCor());
		System.out.println("S.O.: " + 
				galaxyS6.getSistemaOperacional());
		System.out.println("Resolução: " + 
				galaxyS6.getResolucao());
		System.out.println("Memória Expansível?: " + 
				galaxyS6.getMemoriaExpansivel());
		
	}
}


