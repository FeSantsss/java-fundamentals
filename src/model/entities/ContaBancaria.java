package model.entities;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
	private Integer numeroDaConta;
	private String titular;
	private double saldo;
	private LocalDateTime dataDeCriacao;
	
	String dataFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now());
	
	public ContaBancaria() {
	}

	public ContaBancaria(Integer numeroDaConta, String titular, double saldo, LocalDateTime dataDeCriacao) {
		this.numeroDaConta = numeroDaConta;
		this.titular = titular;
		this.saldo = saldo;
		this.dataDeCriacao = dataDeCriacao;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public LocalDateTime getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
		}else {
			System.out.println("Depósito inválido! Adicione um valor válido.");
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
		} else {
			System.out.println("Saque inválido! Verifique o saldo disponível.");
		}
	}

	
	public String toString() {
		return "Conta Bancária [Número: " 
	+ numeroDaConta 
	+ ", Titular: " 
	+ titular 
	+ ", Data de Criação: "
	+ dataDeCriacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
	+ ", Saldo: R$ " 
	+ String.format("%.2f", saldo) 
	+ "]";
	}
	
}
