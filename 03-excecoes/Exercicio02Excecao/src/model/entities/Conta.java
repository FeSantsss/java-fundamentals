package model.entities;

import model.exception.ExececaoCustom;

public class Conta {
	private Integer NumeroConta;
	private String NomeTitular;
	private Double Saldo;
	private Double LimiteSaque;
	
	public Conta(Integer numeroConta, String nomeTitular, Double saldo, Double limiteSaque) {
		NumeroConta = numeroConta;
		NomeTitular = nomeTitular;
		Saldo = saldo;
		LimiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return NumeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		NumeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return NomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		NomeTitular = nomeTitular;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public Double getLimiteSaque() {
		return LimiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		LimiteSaque = limiteSaque;
	}
	
	public void Depositar(Double valor) {
		if (valor > 0) {
			Saldo += valor;
		} else {
			throw new ExececaoCustom("Valor de depósito maior");
		}
	}
	
	public void Sacar(Double valor) {
		if (valor > 0 && valor <= Saldo && valor <= LimiteSaque) {
			Saldo -= valor;
		}else {
			throw new ExececaoCustom("Valor de saque inválido ou excede o limite de saque");
		}
	}
	
}
