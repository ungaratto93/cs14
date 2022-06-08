package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class TesteEstaVazia {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		Peca removida = pilha.remove();
		
		System.out.println("pilha.vazia()");
		System.out.println(pilha.vazia());
		
	}
	
}
