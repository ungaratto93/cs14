package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteClear {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Jose");
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria");
		
		Aluno a3 = new Aluno();
		a3.setNome("Paulo");
		Vetor lista = new Vetor();

		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		FactoryAluno factoryAluno = FactoryAluno.getInstanceOf();
		for (int index = 0; index < 1000; index++) {
			Aluno a = factoryAluno.create("aluno_" + Integer.toString(index));
			lista.adiciona(a);
		}

		lista.clear();
	}
}
