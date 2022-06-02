package br.com.caelum.ed.pilhas.testes.genericos;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TesteInsereGenerica {

	public static void main(String[] args) {
		
		PilhaGenerica pilha = new PilhaGenerica();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		
		System.out.println("peça inserida, pilha não está vazia " + ((pilha.vazia() == false )));
		
	}
	
}
