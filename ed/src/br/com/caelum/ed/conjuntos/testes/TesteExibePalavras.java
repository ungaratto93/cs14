package br.com.caelum.ed.conjuntos.testes;

import java.util.List;

import br.com.caelum.ed.conjuntos.ConjuntoEspalhamento;

public class TesteExibePalavras {
	public static void main(String[] args) {
		
		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
		
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		
		List<String> palavras = conjunto.pegaTodas();
		for (String palavra : palavras ) {
			System.out.println(palavra);
		}
	}
}
