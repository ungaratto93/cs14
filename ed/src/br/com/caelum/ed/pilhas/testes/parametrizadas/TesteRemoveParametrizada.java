package br.com.caelum.ed.pilhas.testes.parametrizadas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TesteRemoveParametrizada {

	public static void main(String[] args) {
		
		PilhaParametrizada <Peca> pilha = new PilhaParametrizada<Peca>();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		Peca pecaRemovida = pilha.remove();
		System.out.println(peca == pecaRemovida);
		System.out.println("peça removida, pilha está vazia " + ((pilha.vazia() == true )));

	}
	
}
