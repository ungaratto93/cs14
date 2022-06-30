package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento {

	private List<List<Associacao>> tabela = new ArrayList<List<Associacao>>();

	public MapaEspalhamento() {
		for (int index = 0; index < 100; index++) {
			this.tabela.add(new LinkedList<Associacao>());
		}
	}

	private int calculaIndiceDaTabela(String placa) {
		return Math.abs(placa.hashCode() % this.tabela.size());
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
