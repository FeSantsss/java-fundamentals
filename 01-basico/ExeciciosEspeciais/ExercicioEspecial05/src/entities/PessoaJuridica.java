package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numeroFuncionarios;

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double calcularImposto() {
		if (numeroFuncionarios > 10) {
			return rendaAnual * 0.14;
		} else {
			return rendaAnual * 0.16;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " (Pessoa Jurídica)";
	}

}
