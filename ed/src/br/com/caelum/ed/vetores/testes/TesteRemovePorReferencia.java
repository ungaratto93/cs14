package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.NotFoundException;
import br.com.caelum.ed.vetores.Vetor;

public class TesteRemovePorReferencia {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");

		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a1);
		lista.adiciona(a2);

		System.out.println(lista);		
		lista.removePorReferencia(a1);
		System.out.println(lista);

	}
	
}
