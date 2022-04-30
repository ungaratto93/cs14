package br.com.caelum.ed.listasligadas;

public class ListaLigada {

	// encapsula as celulas de forma privada para nenhum cliente ter conhecimento
	// dessa estrutura interna
	
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		
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
		
	}
	
	public void removeDoComeco() {
		
	}
	
	public void removeDoFime() {
		
	}
	
}