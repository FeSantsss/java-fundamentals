package entities;

public class Carro {
	private String modelo;
	private int ano;
	private String cor;
	
	public static String corPadrao = "Preto";
	
	public Carro() {
		this.modelo = "";
		this.ano = 0;
		this.cor = "";
	}

	//construtor sem cor
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//construtor com cor
	public Carro(String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	//imprimir dados do carro
	public void dados() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
		if (cor == null || cor.isEmpty()) {
			cor = corPadrao; // se a cor não for informada, usa a cor padrão
			System.out.println("Cor: " + corPadrao);
		}else {
		System.out.println("Cor: " + cor);
		}
		System.out.println("-------------------------");
	}
	
}
