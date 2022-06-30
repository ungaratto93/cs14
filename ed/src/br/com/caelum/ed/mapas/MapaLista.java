package br.com.caelum.ed.mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaLista {

	private List<AssociacaoFixa> associacoes = new ArrayList<AssociacaoFixa>();

	public void adiciona(String placa, Carro carro) {
		if (!this.contemChave(placa)) {
			AssociacaoFixa AssociacaoFixa = new AssociacaoFixa(placa, carro);
			this.associacoes.add(AssociacaoFixa);
		}
	}

	public Carro pega(String placa) {
		Carro carro = null;
		int indice = 0;
		for (AssociacaoFixa AssociacaoFixa : this.associacoes) {
			if (placa.equals(AssociacaoFixa.getPlaca())) {
				carro = AssociacaoFixa.getCarro();
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
				AssociacaoFixa AssociacaoFixa = this.associacoes.get(index);

				if (placa.equals(AssociacaoFixa.getPlaca())) {
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
		for (AssociacaoFixa associacao : this.associacoes) {
			if (placa.equals(associacao.getPlaca())) {
				contem = Boolean.TRUE;
			}
		}
		return contem;
	}

}
