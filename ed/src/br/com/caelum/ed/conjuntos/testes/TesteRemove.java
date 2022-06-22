package br.com.caelum.ed.conjuntos.testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteRemove {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		
		System.out.println("O tamanho do conjunto é 3 ? " + (conjunto.tamanho() == 3));		
		System.out.println("Lista de palavras antes de remover :");
		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		conjunto.remove("apostila");

		System.out.println("O tamanho do conjunto é 2 ? " + (conjunto.tamanho() == 2));		
		System.out.println("Lista de palavras apos remover :");
		palavras = conjunto.pegaTodas();
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
