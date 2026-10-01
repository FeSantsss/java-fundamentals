package model.entities;

import model.enums.Cargos;

public abstract class Funcionario {
	protected String nome;
	protected Cargos cargo;
	protected Integer numero;
	protected Double salario;
	
	public Funcionario(String nome, Cargos cargo, Integer numero, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.numero = numero;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}

	public Integer getNumero() {
		return numero;
	}

	public Double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return getNome()
				+ " - "
				+ getCargo()
				+ " | Salário: $"
				+ getSalario();
		
	}
	
	
	
}
