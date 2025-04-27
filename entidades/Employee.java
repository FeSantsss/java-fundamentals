package entidades;

public class Employee {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double NetSalary(double impost) {
		imposto = impost;
		salarioBruto -= imposto;
		return salarioBruto;
	}
	
	public void IncreaseSalary(double percentege) {
		double newSalary;
		newSalary = salarioBruto * (1 + percentege/100);
		salarioBruto = newSalary;
	}
	
	public String toString() {
		return "Employee: " + nome + ", $ " + String.format("%.2f", salarioBruto);
	}
}
