package br.com.caelum.ed.filas.testes.parametrizada;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.FilaParametrizada;

public class TesteVazia {
	public static void main(String[] args) {
		FilaParametrizada <Aluno> fila = new FilaParametrizada<Aluno>();
		System.out.println("Fila esta vazia ? " + fila.vazia());
	}
}
