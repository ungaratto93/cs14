package br.com.caelum.ed.pilhas.testes.parametrizadas;

import br.com.caelum.ed.pilhas.Peca;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TesteRemoveDaPilhaParametrizadaVazia {

	public static void main(String[] args) {
		
		PilhaParametrizada <Peca> pilha = new PilhaParametrizada<Peca>();
		try {
			Peca removida = pilha.remove();
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	
}
