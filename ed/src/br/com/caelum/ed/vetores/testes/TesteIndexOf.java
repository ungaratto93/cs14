package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.NotFoundException;
import br.com.caelum.ed.vetores.Vetor;

public class TesteIndexOf {

	public static void main(String[] args) {
		
		Vetor lista = new Vetor();
		
		FactoryAluno factoryAluno = FactoryAluno.getInstanceOf();
		for (int index = 0; index < 1000; index++) {
			Aluno a = factoryAluno.create("aluno_" + Integer.toString(index));
			lista.adiciona(a);
		}

		try {
			Aluno a = (Aluno) lista.pega(0);
			lista.indexOf(a);
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	
	}

}
