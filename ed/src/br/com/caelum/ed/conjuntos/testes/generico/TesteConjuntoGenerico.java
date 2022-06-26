package br.com.caelum.ed.conjuntos.testes.generico;

import br.com.caelum.ed.conjuntos.generico.ConjuntoEspalhamentoGenerico;

public class TesteConjuntoGenerico {
	public static void main(String[] args) {
		ConjuntoEspalhamentoGenerico conjunto = new ConjuntoEspalhamentoGenerico();

		conjunto.adiciona("Rafael");
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		System.out.println(conjunto.pegaTodas());
		
	}
}
