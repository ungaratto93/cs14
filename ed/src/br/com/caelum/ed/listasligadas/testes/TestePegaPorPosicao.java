package br.com.caelum.ed.listasligadas.testes;

import br.com.caelum.ed.listasligadas.Celula;
import br.com.caelum.ed.listasligadas.ListaLigada;

public class TestePegaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");

		System.out.println(((Celula) lista.pegaCelula(0)).getElemento());
		System.out.println(((Celula) lista.pegaCelula(1)).getElemento());
	}
	
}
