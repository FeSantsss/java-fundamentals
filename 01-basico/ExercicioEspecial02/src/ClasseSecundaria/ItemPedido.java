package ClasseSecundaria;

public class ItemPedido {
	private Integer quantidade;
	private Double preco;
	private Produto produto;

	public Integer getQuantidade() {
		return quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public ItemPedido(Integer quantidade, Double preco, Produto produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Double subTotal() {
		return preco * quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + produto.getNome() + "\n");
		sb.append("Quantidade: " + quantidade + "\n");
		sb.append("Preco: " + preco + "\n");
		sb.append("Subtotal: " + subTotal() + "\n");
		sb.append("---------------------------------------\n");

		return sb.toString();
	}
}