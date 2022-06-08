package br.com.caelum.ed.pilhas.testes.genericas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TesteEstaVaziaGenerica {

	public static void main(String[] args) {
	
		PilhaGenerica pilha = new PilhaGenerica();
		Peca peca = new Peca();
		peca.setNome("Teste");
		pilha.insere(peca);
		Object pecaRemovida = pilha.remove();
		
		System.out.println("Pilha está vazia ? " + pilha.vazia());
		
	}
	
}
