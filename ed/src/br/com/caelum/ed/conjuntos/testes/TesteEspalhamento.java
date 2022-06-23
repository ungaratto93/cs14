package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteEspalhamento {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		for (int index = 0; index < 100; index++) {
			conjunto.adiciona("" + index);
		}
		
		conjunto.imprimeTabela();
		
	}
}
