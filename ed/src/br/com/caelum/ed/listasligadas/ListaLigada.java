package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	// encapsula as celulas de forma privada para nenhum cliente ter conhecimento
	// dessa estrutura interna
	
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula celula = new Celula(elemento);
			this.ultima.setProxima(celula);
			celula.setAnterior(this.ultima);
			this.ultima = celula;
			this.totalDeElementos++;
		}
		
	}
	
	// sobrecarga do metodo adiciona
	public void adiciona(int posicao, Object elemento) {
		
	}

	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		
	}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object objeto) {
		return false;
	}
	
	public void adicionaNoComeco(Object elemento) {
		if(this.totalDeElementos == 0) {
			Celula celula = new Celula(elemento);
			this.primeira = celula;
			this.ultima = celula;
		} else {
			Celula celula = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(celula);
			this.primeira = celula;
		}
		this.totalDeElementos++;
	}
	
	public void removeDoComeco() {
		
	}
	
	public void removeDoFime() {
		
	}
	
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		for(int index = 0; index < this.totalDeElementos - 1; index++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProxima();
		}
	
		builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}
}