package br.com.caelum.ed.pilhas.testes;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.Pilha;

public class TesteRemoveDaPilhaVazia {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		try {
			Peca removida = pilha.remove();
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
}
