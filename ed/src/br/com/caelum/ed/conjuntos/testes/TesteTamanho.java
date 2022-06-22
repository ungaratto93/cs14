package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteTamanho {
	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		System.out.println("O tamanho do conjunto é 0 ? " + (conjunto.tamanho() == 0));		

		conjunto.adiciona("jose");
		conjunto.adiciona("jose");
		conjunto.adiciona("jose");
		System.out.println("O tamanho do conjunto é 1 ? " + (conjunto.tamanho() == 1));		

		
	}
}
