package entidades;

public class Retangulo {
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
	}
	public double Perimetro() {
		return largura * 2 + altura * 2;
	}
	public double Diagonal() {
		double diagonal;
		diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		return diagonal;
	}
	
	public String toString() {
		return "Área: " + String.format("%.2f", Area()) + String.format("%n") +
				"Perimetro: " + String.format("%.2f", Perimetro()) + String.format("%n") +
				"Diagonal: " + String.format("%.2f", Diagonal()) + String.format("%n");
	}
	
}
