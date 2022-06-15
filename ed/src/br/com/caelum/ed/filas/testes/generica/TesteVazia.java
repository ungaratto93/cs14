package br.com.caelum.ed.filas.testes.generica;

import br.com.caelum.ed.filas.FilaGenerica;

public class TesteVazia {

	public static void main(String[] args) {
		FilaGenerica filaDeAlunos = new FilaGenerica();
	
		System.out.println("filaDeAlunos.vazia() \n" + filaDeAlunos.vazia());
	}

}