package br.com.caelum.ed.listasligadas;

public class TestePegaPorPosicao {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");

		System.out.println(((Celula) lista.pegaCelula(0)).getElemento());
		System.out.println(((Celula) lista.pegaCelula(1)).getElemento());
	}
	
}
