package br.com.caelum.ed.pilhas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.pilhas.Peca;

public class Pilha {

	// generics aqui aplcado
	private List<Peca> pecas = new LinkedList<Peca>();
	
	public void insere(Peca peca) {
		this.pecas.add(peca);
	}

	// lembre-se indices comecam em 0, entao é sempre tamanhoFisico - 1
	public Peca remove() {
		if (this.vazia()) {
			throw new IndexOutOfBoundsException("Pilha vazia");
		}
		return this.pecas.remove(this.pecas.size() - 1);
	}
	
	public boolean vazia() {
		return this.pecas.size() == 0;
	}
	
}
/*
*	5) (opcional) É possível implementar a nossa Pilha utilizando internamente uma ArrayList em vez de
*	LinkedList ? Teremos algum ganho ou perda no consumo de tempo de alguma das operações?
*
*	R: Se trocar para arraylist teriamos perda de performance em inserção e remocao dos elementos.
*	No caso o cenario de maior ganho do arraylist sob a linked list e ao percorrer a lista, 
*	e na pilha o acesso e dado sempre pelo ultimo elemento, entao nao sendo aplicado essa operacao nesse cenario.
*
*
*
*/