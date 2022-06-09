package br.com.caelum.ed.filas;

import java.util.LinkedList;
import java.util.List;

import br.com.caelum.ed.alunos.Aluno;

public class Fila {

	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	public void insere(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public Aluno remove() {
		return this.alunos.remove(0);
	}
	
	public Boolean vazia() {
		return this.alunos.size() == 0;
	}
		
}
