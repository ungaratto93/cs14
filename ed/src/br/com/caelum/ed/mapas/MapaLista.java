package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {

	private List<Associacao> associacoes = new ArrayList<Associacao>();

	public void adiciona(String placa, Carro carro) {
		if (!this.contemChave(placa)) {
			Associacao associacao = new Associacao(placa, carro);
			this.associacoes.add(associacao);
		}
	}

	public Carro pega(String placa) {
		Carro carro = null;
		int indice = 0;
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				carro = associacao.getCarro();
				break;
			}
			if (indice >= this.associacoes.size()) {
				throw new IllegalArgumentException("Chave não existe");
			}
			indice++;
		}
		return carro;
	}

	public void remove(String placa) {
		if (this.contemChave(placa)) {
			for (int index = 0; index < this.associacoes.size();) {
				Associacao associacao = this.associacoes.get(index);

				if (placa.equals(associacao.getPlaca())) {
					this.associacoes.remove(index);
					break;
				} else {
					throw new IllegalArgumentException("Chave não existe");
				}

			}
		}
	}

	public boolean contemChave(String placa) {
		Boolean contem = Boolean.FALSE;
		for (Associacao associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				contem = Boolean.TRUE;
			}
		}
		return contem;
	}

}
