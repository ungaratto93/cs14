package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLinearVSConstante {

	public static void main(String[] args) {
		Vetor vetorLinear = new Vetor();
		
		long inicioLinear = System.currentTimeMillis();
		for (int index = 1; index < 100000; index++) {
			Aluno aluno = new Aluno();
			vetorLinear.adicionaDeFormaLinear(aluno);
		}
		long fimLinear = System.currentTimeMillis();
		double tempoLinear = (fimLinear - inicioLinear) / 1000.0;
		
		Vetor vetorConstante = new Vetor();
		long inicioConstante = System.currentTimeMillis();
		for (int index = 1; index < 100000; index++) {
			Aluno aluno = new Aluno();
			vetorConstante.adiciona(aluno);
		}
		long fimConstante = System.currentTimeMillis();
		double tempoConstante = (fimConstante - inicioConstante) / 1000.0;
		
		System.out.println("[FORMA LINEAR ] Tempo em segundos = " + tempoLinear);
		System.out.println("[FORMA CONSTANTE ] Tempo em segundos = " + tempoConstante);

	}
	
}
