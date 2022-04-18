package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteEstoura {

	public static void main(String[] args) {
		Vetor vetor = new Vetor();
		// da erro pq nao há espaco
		for (int index = 0; index < 100001; index++) {
			Aluno aluno = new Aluno();
			vetor.adicionaSemGarantirEspaco(aluno);
		}
		
	}
	
}
