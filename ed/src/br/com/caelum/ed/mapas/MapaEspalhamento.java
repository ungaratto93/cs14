package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento<C, V> {

	private List<List<Associacao<C, V>>> tabela = new ArrayList<List<Associacao<C, V>>>();
	private int tamanho = 0;

	public MapaEspalhamento() {
		for (int index = 0; index < 100; index++) {
			this.tabela.add(new LinkedList<Associacao<C, V>>());
		}
	}

	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode() % this.tabela.size());
	}

	public List<Associacao<C, V>> pegaTodas() {
		List<Associacao<C, V>> assocs = new LinkedList<Associacao<C, V>>();
		for (int index = 0; index < this.tabela.size(); index++) {
			assocs.addAll(this.tabela.get(index));
		}
		return assocs;
	}

	private void limparTabela() {
		this.tabela.clear();
	}

	private void adicionaListas(int novaCapacidade) {
		for (int index = 0; index < novaCapacidade; index++) {
			this.tabela.add(new LinkedList<Associacao<C, V>>());
		}
	}

	private void adicionaTodas(List<Associacao<C, V>> assocs) {
		for (Associacao<C, V> assoc : assocs) {
			this.adiciona(assoc.getChave(), assoc.getValor());
		}
	}

	private void redimensionaTabela(int novaCapacidade) {
		List<Associacao<C, V>> assocs = this.pegaTodas();
		this.limparTabela();
		this.adicionaListas(novaCapacidade);
		this.adicionaTodas(assocs);
	}

	private void verificarCargaDaTabela() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;

		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}

	public boolean contem(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);

		for (int index = 0; index < lista.size(); index++) {
			Associacao<C, V> associacao = lista.get(index);
			if (associacao.getChave().equals(chave)) {
				return true;
			}

		}
		return false;
	}

	public void remove(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);

		this.verificarCargaDaTabela();
		for (int index = 0; index < lista.size(); index++) {
			Associacao<C, V> associacao = lista.get(index);
			if (associacao.getChave().equals(chave)) {
				lista.remove(index);
				return;
			}
		}
		throw new IllegalArgumentException("A chave não existe.");
	}

	public void adiciona(C chave, V valor) {
		if (this.contem(chave)) {
			this.remove(chave);
		}

		this.verificarCargaDaTabela();
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = tabela.get(indice);
		lista.add(new Associacao<C, V>(chave, valor));
	}

	public V pega(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<C, V>> lista = this.tabela.get(indice);

		for (int index = 0; index < lista.size(); index++) {
			Associacao<C, V> associacao = lista.get(index);
			if (associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}

		throw new IllegalArgumentException("Chave não existe");
	}

}
