package ClassePrincipal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Enum.StatusPedido;
import ClasseSecundaria.Cliente;
import ClasseSecundaria.ItemPedido;

public class Pedido {
	 private LocalDateTime momento = LocalDateTime.now();
	 private StatusPedido status;
	 List<ItemPedido> itens = new ArrayList<>();
	 Cliente cliente;
	 
	public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	 
	public void addItem (ItemPedido item) {
		itens.add(item);
	}
	public void removeItem (ItemPedido item) {
		itens.remove(item);
	}
	public Double  totalPedido() {
		Double total = 0.0;
		for (ItemPedido item : itens) {
			total += item.getPreco() * item.getQuantidade();
		}
		return total;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: " + momento.format(fmt) + "\n");
		sb.append("Status do pedido: " + status + "\n");
		sb.append("Cliente: " + cliente.getNome() + " ");
		sb.append("(" + cliente.getDataNascimento().format(fmt2) + ") - ");
		sb.append(cliente.getEmail() + "\n");
		sb.append("Itens: \n");
		for (ItemPedido item : itens) {
			sb.append(item.toString());
		}
		return sb.toString();
	}
	 
	 
}
