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
