package br.com.caelum.ed.mapas;

public class AssociacaoFixa {
	private String placa;
	private Carro carro;

	public AssociacaoFixa(String placa, Carro carro) {
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
