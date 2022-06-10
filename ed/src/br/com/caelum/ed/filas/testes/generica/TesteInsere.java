package br.com.caelum.ed.filas.testes.generica;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.FilaGenerica;

public class TesteInsere {

	public static void main(String[] args) {
		FilaGenerica filaDeAlunos = new FilaGenerica();
		Aluno aluno = new Aluno();
		
		filaDeAlunos.insere(aluno);
		System.out.println("filaDeAlunos.vazia() " + filaDeAlunos.vazia());
	}
	
}
