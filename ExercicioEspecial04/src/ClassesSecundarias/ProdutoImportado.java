package ClassesSecundarias;

import ClassePrimaria.Produto;

public class ProdutoImportado extends Produto {
	private Double taxaDeImportacao;
	
	public ProdutoImportado(String nome, Double preco, Double taxaDeImportacao) {
		super(nome, preco);
		this.taxaDeImportacao = taxaDeImportacao;
	}
	
	public Double getTaxaDeImportacao() {
		return taxaDeImportacao;
	}
	
	public Double precoTotal(Double taxaDeImportacao) {
		return this.preco = preco + taxaDeImportacao;
	}
	
	@Override
	public String etiquetaPreco() {
		return nome + " R$ " + String.format("%.2f", precoTotal(taxaDeImportacao)) + " (Taxa de importação: " + taxaDeImportacao + ")";
	}

}
