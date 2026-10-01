package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public ContaBancaria(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}
	
	public double deposito(double addMoney) {
		return saldo += addMoney;
	}
	public double saque(double removMoney) {
		double taxaSaque = 5.00;
		return saldo -= removMoney + taxaSaque;
	}
	
	public void dados() {
		System.out.println("Conta " 
		+ numeroConta 
		+ ", Titular: " 
		+ nome 
		+ ", Saldo: R$ " 
		+ String.format("%.2f", saldo));
	}
	
}
