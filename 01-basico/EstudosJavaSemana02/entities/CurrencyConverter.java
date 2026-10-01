package entities;

public class CurrencyConverter {
	
	public static double DolarCotacao(double cotacao, double querValor) {
		return cotacao * querValor * (1 + 0.06);
	}
	
	
}
