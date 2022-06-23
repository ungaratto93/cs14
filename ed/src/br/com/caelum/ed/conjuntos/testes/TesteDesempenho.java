package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteDesempenho {
	public static void main(String[] args) {
		
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

		for (int index = 0; index < 50000; index++) {
			conjunto.adiciona("palavra" + index);
		}
		
		for (int index = 0; index < 50000; index++) {
			conjunto.contem("palavra" + index);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio) / 1000.00 + "ms");

	}
}
