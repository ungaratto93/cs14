package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class TesteGenerico {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		Peca peca = new Peca();
		peca.setNome("Transistor");
		pilha.insere(peca);

		Peca pecaRemovida = pilha.remove();
		
		// só mostra que o remove funcionou, por que nao entra nesse bloco, o mesmo endereco é comparado no != entre vars
		if( pecaRemovida != peca) {
			System.out.println("Erro: a peça removida não é igual " + 
					" a que foi inserida"
			);
		}
		
		// só mostra que o remove funcionou, por que nao entra nesse bloco, pq nega o true do vazia
		if (!pilha.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		}
		
	}
	
}
