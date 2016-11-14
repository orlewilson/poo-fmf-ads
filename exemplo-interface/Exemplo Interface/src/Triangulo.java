/*
 * Proramação Orientada a Objetos
 * Prof. Orlewilson Maia
 * 
 * Autor: 	Orlewilson Maia
 * Data:	14/11/2016
 * 
 * Descrição: Classe para definir da Figura 
 * 			  Geométrica Triângulo
 * 
 */

public class Triangulo implements FiguraGeometrica {
	
	// Atributos
	private int ladoA;
	private int ladoB;
	private int ladoC;
	private int base;
	private int altura;
	
	// Construtor
	public Triangulo(){
		this.ladoA = 0;
		this.ladoB = 0;
		this.ladoC = 0;
		this.base = 0;
		this.altura = 0;
	}
	
	public Triangulo(int ladoA, int ladoB, int ladoC,
			int base, int altura){
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.base = base;
		this.altura = altura;
	}

	// Métodos
	public int getLadoA() {
		return this.ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return this.ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return this.ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}

	public int getBase() {
		return this.base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return this.altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String getNomeFigura() {
		return "triângulo";
	}

	@Override
	public int getArea() {
		int area = (getBase() * getAltura())/2;
		return area;
	}

	@Override
	public int getPerimetro() {
		int perimetro = getLadoA() + getLadoB() + getLadoC();
		return perimetro;
	}	
}
