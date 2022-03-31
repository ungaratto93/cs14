package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
	
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);

		lista.adiciona(0, a2);
		
		lista.adiciona(1, a3);

		System.out.println(lista);
	}
	
}
