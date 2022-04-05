package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;
import java.util.Vector;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteVetorVsVector {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		System.out.println(vetor.tamanho());

		for (int index = 0; index < 1000; index++) {
			Aluno objetoAluno = new Aluno();
			objetoAluno.setNome("Aluno_" + Integer.toString(index));
			vetor.adiciona(objetoAluno);
		}
		System.out.println(vetor.tamanho());
		
		System.out.println("");
		Vector vector = new Vector();
		System.out.println(vector.size());
		for (int index = 0; index < 1000; index++) {
			Aluno objetoAluno = new Aluno();
			vector.add(objetoAluno);
		}
		System.out.println(vector.size());
		
		System.out.println("");
		ArrayList<Aluno> array = new ArrayList<Aluno>();
		System.out.println(array.size());
		for (int index = 0; index < vector.size(); index++) {
			array.add((Aluno) vector.get(index));
		}
		System.out.println(array.size());

	}
	
}
