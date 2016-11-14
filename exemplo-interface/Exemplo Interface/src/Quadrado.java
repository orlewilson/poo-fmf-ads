/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	14/11/2016
 * 
 * Descrição: Classe para definir da Figura 
 * 			  Geométrica Quadrado
 * 
 */

public class Quadrado implements FiguraGeometrica {

	// Atributos
	private int lado;
	
	// Construtor
	public Quadrado(){
		this.lado = 0;
	}
	
	public Quadrado(int lado){
		this.lado = 0;
	}
	
	// Métodos
	public void setLado(int lado){
		this.lado = lado;
	}
	
	public int getLado(){
		return this.lado;
	}

	@Override
	public String getNomeFigura() {
		return "quadrado";
	}

	@Override
	public int getArea() {
		
		int area = getLado() * getLado();
		
		return area;
	}

	@Override
	public int getPerimetro() {
		//int perimetro = getLado() + getLado() + 
		//		getLado() + getLado(); 
		
		int perimetro = 4 * getLado();
		
		return perimetro;
	}
}
