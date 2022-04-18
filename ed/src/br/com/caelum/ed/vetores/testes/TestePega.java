package br.com.caelum.ed.vetores.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.vetores.NotFoundException;
import br.com.caelum.ed.vetores.Vetor;

public class TestePega {
	public static void main(String[] args) throws NotFoundException {
		Aluno a1 = new Aluno();
		a1.setNome("Eduardo");

		Aluno a2 = new Aluno();
		a2.setNome("Camila");
	
		
		Vetor lista = new Vetor();
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		lista.pega(0);
		lista.pega(1);
		
		// erro pq o vetor criado internamente nao e desse tamanho
		lista.pega(100000000);

	
	}
}
