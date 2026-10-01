package model.entities;

import model.enums.Cargos;

public class FuncionarioRemoto extends Funcionario {

	public FuncionarioRemoto(String nome, Cargos cargo, Integer numero, Double salario) {
		super(nome, cargo, numero, salario);
	}
}
