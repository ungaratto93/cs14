package br.com.caelum.ed.vetores.testes;

import java.util.ArrayList;

import br.com.caelum.ed.alunos.Aluno;

public class TesteGenericsStrings {

	public static void main(String[] args) {
		
		ArrayList<String> vetorComGenerics = new ArrayList<String>();
		
		Aluno aluno = new Aluno();
		
		vetorComGenerics.add("Eduardo");

		String string = vetorComGenerics.get(0);
		boolean removed = vetorComGenerics.remove(string);
		System.out.println("string was removed" + removed);
	}
	
}
