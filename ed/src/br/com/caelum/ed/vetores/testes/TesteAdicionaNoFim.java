package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Joao");
		a2.setNome("Jose");
	
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista);
	}
	
}
