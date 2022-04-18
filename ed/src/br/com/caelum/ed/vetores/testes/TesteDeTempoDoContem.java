package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteDeTempoDoContem {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor();
		long inicio = System.currentTimeMillis();
		
		// verifica se eles foram adicionados
		for (int index = 1; index < 30000; index++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);

			// vai entrar se o contem for falso
			// nao entra se o contem for true
			// (!) operador de disjuncao logica
			if(!vetor.contem(aluno)) {
				System.out.println("ERRO: Aluno " + aluno + " não foi adicionado");
			}
		}
		

		// verificando se o vetor nao encontra alunos nao adicionados
		// nao e pra entrar no if pois nao foi invocado o adiciona com essa referencia como arg
		for (int index = 1; index < 30000; index++) {
			Aluno aluno = new Aluno();

			// nao entra
			if(vetor.contem(aluno)) {
				System.out.println("ERRO: Aluno "+ aluno + " foi adicionado");
			}
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo = " + tempo);
						
	
	}
	
}
