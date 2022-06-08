package br.com.caelum.ed.pilhas.testes.parametrizadas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TesteNaoEstaVaziaParametrizada {

	public static void main(String[] args) {
	
		PilhaParametrizada <Peca> pilha = new PilhaParametrizada<Peca>();
		Peca peca = new Peca();
		peca.setNome("Teste");
		pilha.insere(peca);
		Peca pecaRemovida = pilha.remove();
		pilha.insere(pecaRemovida);
		
		System.out.println("pilha.vazia()");
		System.out.println(pilha.vazia());

	}
	
}
