package br.com.caelum.ed.mapas.testes;

import br.com.caelum.ed.mapas.Carro;
import br.com.caelum.ed.mapas.MapaLista;

public class TesteTempoMapaLista {

	public static void main(String[] args) {

		MapaLista mapa = new MapaLista();
		int numeroDeElementos = 15000;
		long inicio = System.currentTimeMillis();

		for (int index = 0; index < numeroDeElementos; index++) {
			mapa.adiciona("" + index, new Carro("c" + index));
		}

		for (int index = 0; index < numeroDeElementos; index++) {
			mapa.pega("" + index);
		}

		for (int index = 0; index < numeroDeElementos; index++) {
			mapa.contemChave("" + index);
		}

		for (int index = 0; index < numeroDeElementos; index++) {
			mapa.remove("" + index);
		}

		long fim = System.currentTimeMillis();

		System.out.println("Tempo : " + (fim - inicio) / 1000.0 + " ms");

	}

}
