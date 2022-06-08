package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class TesteRemove {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		Peca pecaRemovida = pilha.remove();
		
		System.out.println("peca == pecaRemovida");
		System.out.println(peca == pecaRemovida);
		
		
	}
	
}
