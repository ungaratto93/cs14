package br.com.caelum.ed.pilhas.testes.genericos;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaGenerica;

public class TesteRemoveDaPilhaGenericaVazia {

	public static void main(String[] args) {
		
		PilhaGenerica pilha = new PilhaGenerica();
		try {
			Object removida = pilha.remove();
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
}
