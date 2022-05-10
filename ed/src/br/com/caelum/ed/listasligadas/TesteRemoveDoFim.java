package br.com.caelum.ed.listasligadas;

public class TesteRemoveDoFim {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoFime();
		
		System.out.println(lista);
	}
}
