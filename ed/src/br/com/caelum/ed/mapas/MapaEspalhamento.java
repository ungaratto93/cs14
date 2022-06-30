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
			if(associacao.getPlaca().equals(placa)) {
				return true; 
			}

		}
		return false; 		
	}

}
