package br.com.caelum.ed.conjuntos;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	private static int COLUNAS = 26;
	private List<List<String>> tabela = new ArrayList<List<String>>(COLUNAS);
	
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int index = 0; index < COLUNAS; index++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % COLUNAS;
	}
	
	public void adiciona(String palavra) {
		if(!contemPalavra(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}
	
	private boolean contemPalavra(String palavra) {
		// TODO Auto-generated method stub
		return false;
	}

	public void remove(String palavra) {
		//implementação
	}

	public Boolean contem(String palavra) {
		//implementação
		return false;
	}

	public List<String> pegaTodas() {
		List<String> palavras = new ArrayList<String>();
		for (int index = 0; index < this.tabela.size(); index++) {
			palavras.addAll(this.tabela.get(index));
		}
		return palavras;
	}
	
	public int tamanho() {
		return 0;
	}
}
