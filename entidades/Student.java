package entidades;

public class Student {
	public String nome;
	public double n1, n2, n3;
	public String res;
	
	public double NotaFinal() {
		double notaTotal = n1 + n2 + n3;
		double notaMin = 60.00;
		
		if (notaTotal >= 60.00 && notaTotal <= 100.00) {
			res = "PASS";
			
		}else {
			double faltando;
			faltando = notaMin - notaTotal;
			res = "FAILED, MISSING: " + faltando;
			
		}
		
		return notaTotal;
		
	}
	public String toString() {
		return "Nota Final: " + String.format("%.2f", (NotaFinal())) + ", " + res;
	}
	
}
