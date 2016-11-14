/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	14/11/2016
 * 
 * Descrição: Classe utilizada para criar objetos 
 * 			  do tipo Quadrado e Triângulo 
 * 
 */

public class TesteExemploInterface {
	
	public static void main(String[] args) {
		
		Quadrado obj1 = new Quadrado();
		Triangulo obj2 = new Triangulo();
		
		obj1.setLado(7);
		obj2.setLadoA(3);
		obj2.setLadoB(4);
		obj2.setLadoC(5);
		obj2.setBase(3);
		obj2.setAltura(4);
				
		System.out.println("Área do Quadrado é: " 
				+ obj1.getArea());
		
		System.out.println("Perímetro do Quadrado é: " 
				+ obj1.getPerimetro());
		
		System.out.println("Área do Triângulo é: " 
				+ obj2.getArea());
		
		System.out.println("Perímetro do Triângulo é: " 
				+ obj2.getPerimetro());
			
	}
}
