package br.com.caelum.ed.listasligadas;

public class Celula {

	private Celula anterior;
	private Object elemento;
	private Celula proxima;

	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Celula(Object elemento) {
		this.elemento = elemento;
	}
	
	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}
	
	public Celula getProxima() {
		return this.proxima;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getAnterior() {
		return this.anterior;
	}

	public Object getElemento() {
		return this.elemento;
	}
	
}
