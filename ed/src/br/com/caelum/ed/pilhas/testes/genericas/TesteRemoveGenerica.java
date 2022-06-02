package br.com.caelum.ed.pilhas.testes.genericas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TesteRemoveGenerica {

	public static void main(String[] args) {
		
		PilhaGenerica pilha = new PilhaGenerica();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		Object pecaRemovida = pilha.remove();
		System.out.println(peca == pecaRemovida);
		System.out.println("peça removida, pilha está vazia " + ((pilha.vazia() == true )));
		
	}
	
}
