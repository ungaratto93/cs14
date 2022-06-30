package br.com.caelum.ed.mapas;

public class Associacao<C, V> {

	private C chave;
	private V valor;
	
	public Associacao(C chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public C getChave() {
		return this.chave;
	}

	public V getValor() {
		return this.valor;
	}
	
}
