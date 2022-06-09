package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.Fila;

public class TesteAdiciona {

	public static void main(String[] args) {
		Fila fila = new Fila();
	
		Aluno aluno = new Aluno();
		
		fila.insere(aluno);
		
		System.out.println("fila vazia?" + fila.vazia());
	}
	
}
