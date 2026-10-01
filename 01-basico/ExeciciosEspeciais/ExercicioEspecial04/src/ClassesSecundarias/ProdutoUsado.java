package ClassesSecundarias;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import ClassePrimaria.Produto;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabricacao;

	public ProdutoUsado(String nome, Double preco, LocalDate dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	@Override
	public String etiquetaPreco() {
		return nome + " (usado) R$ " + String.format("%.2f", preco) + " (Data de fabricação: " + dataFabricacao.format(fmt) + ")";
	}
	
}
