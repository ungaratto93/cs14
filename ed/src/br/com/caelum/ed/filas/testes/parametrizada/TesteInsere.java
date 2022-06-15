package br.com.caelum.ed.filas.testes.parametrizada;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.FilaParametrizada;

public class TesteInsere {

	public static void main(String[] args) {
		
		FilaParametrizada<Aluno> fila = new FilaParametrizada<Aluno>();
		Aluno aluno = new Aluno();
		fila.insere(aluno);
		System.out.println("Fila está vazia?" + fila.vazia());

	}
}
