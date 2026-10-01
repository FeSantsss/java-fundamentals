package entities;

public class PessoaFisica extends Pessoa{
	private Double gastosSaude;

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double calcularImposto() {
		if (rendaAnual < 20000.0) {
			return rendaAnual * 0.15 - gastosSaude * 0.5;
		} else {
			return rendaAnual * 0.25 - gastosSaude * 0.5;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " (Pessoa Física)";
	}
}
