package br.com.caelum.ed.conjuntos.testes;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteContem {
	public static void main(String[] args) {
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		String palavraExistente = "paulo";
		String palavraInexistente = "jose";
		conjunto.adiciona(palavraExistente);
		System.out.println("conjunto.contem(paulo)");
		System.out.println(conjunto.contem(palavraExistente));
		System.out.println("conjunto.contem(jose)");
		System.out.println(conjunto.contem(palavraInexistente));
	}
}
