package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteContem {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		String palavra = "paulo";
		conjunto.adiciona(palavra);
		System.out.println("conjunto.contem(paulo)");
		System.out.println(conjunto.contem(palavra));
	}
}
