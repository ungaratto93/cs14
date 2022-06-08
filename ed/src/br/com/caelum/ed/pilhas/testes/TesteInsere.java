package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class TesteInsere {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		
		System.out.println("peça inserida, pilha não está vazia " + ((pilha.vazia() == false )));
		
	}
	
}
