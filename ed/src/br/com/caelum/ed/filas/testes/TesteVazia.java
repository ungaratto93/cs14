package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.Fila;

public class TesteVazia {

	public static void main(String[] args) {
		Fila fila = new Fila();
	
		Aluno aluno = new Aluno();
		
		fila.insere(aluno);
		
		System.out.println("fila não está vazia?" + fila.vazia());
	
		Aluno alunoRemovido = fila.remove();
		System.out.println("alunoRemovido == aluno");
		System.out.println(alunoRemovido == aluno);

		System.out.println("fila está vazia?" + fila.vazia());

	}
	
}
