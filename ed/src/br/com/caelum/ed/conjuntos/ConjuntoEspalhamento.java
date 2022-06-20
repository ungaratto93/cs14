package br.com.caelum.ed.conjuntos;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	private static int COLUNAS = 26;
	private List<List<String>> tabela = new ArrayList<List<String>>(COLUNAS);
	
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
		//implementação
	}
	
	public void remove(String palavra) {
		//implementação
	}

	public Boolean contem(String palavra) {
		//implementação
		return false;
	}

	public List<String> pegaTodas() {
		//implementação
		return new ArrayList<String>();
	}
	
	public int tamanho() {
		return 0;
	}
}
