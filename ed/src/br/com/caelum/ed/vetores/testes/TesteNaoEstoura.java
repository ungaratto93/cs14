package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteNaoEstoura {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		// nao da erro pq garante espaco, duplicando o tamanho 
		for (int index = 0; index < 100001; index++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
	}
	
}
