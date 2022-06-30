package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento {

	private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();
	private int tamanho = 0;

	public MapaEspalhamento() {
		for (int index = 0; index < 100; index++) {
			this.tabela.add(new LinkedList<Associacao>());
		}
	}

	private int calculaIndiceDaTabela(String placa) {
		return Math.abs(placa.hashCode() % this.tabela.size());
	}

	public List<Associacao> pegaTodas() {
		List<Associacao> assocs = new LinkedList<Associacao>();
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
			this.tabela.add(new LinkedList<Associacao>());
		}
	}
	
	private void adicionaTodas(List<Associacao> assocs) {
		for ( Associacao assoc : assocs ) { this.adiciona(assoc.getPlaca(), assoc.getCarro()); }
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<Associacao> assocs = this.pegaTodas();
		this.limparTabela();
		this.adicionaListas(novaCapacidade);
		this.adicionaTodas(assocs);
	}

	private void verificarCargaDaTabela() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho  / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
	public boolean contem(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		for (int index = 0; index < lista.size(); index++) {
			Associacao associacao = lista.get(index);
			if (associacao.getPlaca().equals(placa)) {
				return true;
			}

		}
		return false;
	}

	public void remove(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);

		this.verificarCargaDaTabela();
		for (int index = 0; index < lista.size(); index++) {
			Associacao associacao = lista.get(index);
			if (associacao.getPlaca().equals(placa)) {
				lista.remove(index);
				return;
			}
		}
		throw new IllegalArgumentException("A chave não existe.");
	}

	public void adiciona(String placa, Carro carro) {
		if (this.contem(placa)) {
			this.remove(placa);
		}

		this.verificarCargaDaTabela();
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = tabela.get(indice);
		lista.add(new Associacao(placa, carro));
	}

	public Carro pega(String placa) {
		int indice = this.calculaIndiceDaTabela(placa);
		List<Associacao> lista = this.tabela.get(indice);
		
		for (int index = 0; index < lista.size(); index++) {
			Associacao associacao = lista.get(index);
			if(associacao.getPlaca().equals(placa)) {
				return associacao.getCarro();
			}
		}

		throw new IllegalArgumentException("Chave não existe");
	}

}
