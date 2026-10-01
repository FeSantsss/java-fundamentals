package entities;

public class Calculator {
	public static final double PI = 3.14;
	public static double circuferencia(double raio) {
		double c;
		c = 2.0 * PI * raio;
		return c;
	}
	
	public static double volume(double raio) {
		double v;
		v = 4.0 * PI * Math.pow(raio, 3)/3.0;
		return v;
	}
}
