package br.com.caelum.ed.filas.testes.generica;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.FilaGenerica;

public class TesteRemove {

	public static void main(String[] args) {
		FilaGenerica filaDeAlunos = new FilaGenerica();
		Aluno aluno = new Aluno();
		
		filaDeAlunos.insere(aluno);
		System.out.println("filaDeAlunos.vazia() \n" + filaDeAlunos.vazia());

		Object alunoRemovido = filaDeAlunos.remove();
		System.out.println("aluno == alunoRemovido \n" + ( aluno == (Aluno)alunoRemovido ) );

		System.out.println("filaDeAlunos.vazia() \n" + filaDeAlunos.vazia());
	}

}