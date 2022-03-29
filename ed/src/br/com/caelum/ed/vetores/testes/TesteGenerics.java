package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;

import br.com.caelum.ed.Aluno;

public class TesteGenerics {

	public static void main(String[] args) {
		
		ArrayList vetorSemGenerics = new ArrayList();
		ArrayList<Aluno> vetorComGenerics = new ArrayList<Aluno>();
		
		Aluno aluno = new Aluno();
		
		vetorSemGenerics.add(aluno);
		vetorComGenerics.add(aluno);
		
		// com uso de generics nao tem necessidade de fazer casting
		Aluno a1 = (Aluno) vetorSemGenerics.get(0);
		Aluno a2 = vetorComGenerics.get(0);
	}
	
}
