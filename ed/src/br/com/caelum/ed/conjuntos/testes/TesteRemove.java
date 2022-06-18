package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteRemove {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		
		System.out.println("O tamanho do conjunto é 3 ? " + (conjunto.tamanho() == 3));		

		conjunto.remove("apostila");

		System.out.println("O tamanho do conjunto é 2 ? " + (conjunto.tamanho() == 2));		

	}
}
