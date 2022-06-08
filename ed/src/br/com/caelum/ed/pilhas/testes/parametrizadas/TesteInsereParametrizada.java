package br.com.caelum.ed.pilhas.testes.parametrizadas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TesteInsereParametrizada {

	public static void main(String[] args) {
		
		PilhaParametrizada <Peca> pilha = new PilhaParametrizada<Peca>();
		Peca peca = new Peca();
		peca.setNome("Transistor");

		pilha.insere(peca);
		
		System.out.println("peça inserida, pilha não está vazia " + ((pilha.vazia() == false )));
		
	}
	
}
