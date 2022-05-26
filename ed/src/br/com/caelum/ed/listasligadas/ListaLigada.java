package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	// encapsula as celulas de forma privada para nenhum cliente ter conhecimento
	// dessa estrutura interna

	/*Nota sobre posição:
	 * posicao == índice
	 * sempre -1 em relacao a quantidade total de elementos (nodos) fisicamentes na lista
	 * ou seja, 10 nodos, como índices de 0 a 9
	 * */
	
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
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public Object pegaCelula(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe!");
		}
		
		Celula atual = this.primeira;
		
		for ( int index = 0; index < posicao; index++ ) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
		
	// sobrecarga do metodo adiciona
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = (Celula) this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProxima();

			Celula nova = new Celula(anterior.getProxima(), elemento);

			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);

			this.totalDeElementos++;
		}

	}
		
	public void remove(int posicao) {
		if(!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao não existe");
		}
		
		if (posicao == 0) {
			this.removeDoComeco();
		} else if (posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		} else {
			Celula anterior = ((Celula) this.pegaCelula(posicao - 1));
			Celula atual = anterior.getProxima();
			Celula proxima = atual.getProxima();
			
			anterior.setProxima(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public Object pega(int posicao) {
		return ( (Celula) this.pegaCelula(posicao) ).getElemento();
	}

	public boolean contem(Object objeto) {
		return false;
	}

	public void removeDoComeco() {
		if(!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posicao invalida!");
		}
		
		this.primeira = primeira.getProxima();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim() {
		if(!this.posicaoOcupada(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}		
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