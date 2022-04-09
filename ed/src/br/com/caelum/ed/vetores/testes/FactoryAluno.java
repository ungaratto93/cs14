package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;

public final class FactoryAluno {
	
	private static FactoryAluno factory = null;
	
	private FactoryAluno() {
	}
	
	public static FactoryAluno getInstanceOf() {
		return factory = new FactoryAluno();
	}
	
	
	public Aluno create(String nome) {
		Aluno a = new Aluno();
		a.setNome(nome);
		return a;
	}
}
