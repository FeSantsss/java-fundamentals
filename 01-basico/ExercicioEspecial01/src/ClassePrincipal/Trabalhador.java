package ClassePrincipal;

import java.util.ArrayList;
import java.util.List;

import entities.Enum.LvlTrabalhador;
import ClassesSecundarias.Departamento;
import ClassesSecundarias.HoraContrato;

public class Trabalhador {
	private String name;
	private LvlTrabalhador nivel;
	private Double salarioBase;
	private Departamento department;
	private List<HoraContrato> contratos = new ArrayList<>();
	
	public Trabalhador(String name, LvlTrabalhador nivel, Double salarioBase, Departamento department) {
		this.name = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LvlTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(LvlTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public List<HoraContrato> getContratos() {
		return contratos;
	}
	
	public Departamento getDepartment() {
		return department;
	}
	
	public void addContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}
	
	public Double rendaMensal (Integer mes, Integer ano) {
		double renda = salarioBase;
		for (HoraContrato lista : contratos) {
			if(lista.getData().getMonthValue() == mes && lista.getData().getYear() == ano) {
				renda += lista.valorTotal();
			}
		}
		return renda;
	}
	
	
}
