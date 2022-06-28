package br.com.caelum.ed.mapas;

public class Associacao {

	private String placa;
	private Carro carro;
	
	public Associacao(String placa, Carro carro) {
		this.placa = placa;
		this.carro = carro;
	}
	
	public String getPlaca() {
		return this.placa;
	}

	public Carro getCarro() {
		return this.carro;
	}
	
}
