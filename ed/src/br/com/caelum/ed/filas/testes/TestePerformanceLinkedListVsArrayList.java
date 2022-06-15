package br.com.caelum.ed.filas.testes;

import br.com.caelum.ed.alunos.Aluno;
import br.com.caelum.ed.filas.FilaOpcional;
import br.com.caelum.ed.filas.FilaParametrizada;

public class TestePerformanceLinkedListVsArrayList {
	public static void main(String[] args) {
		
		FilaOpcional <Aluno> filaOpc = new FilaOpcional<Aluno>();
		FilaParametrizada <Aluno> filaPar = new FilaParametrizada<Aluno>();
		int index = 0;
		int times = 400000000;
		Aluno aluno = new Aluno();
		aluno.setNome("Teste");

		Long start = System.currentTimeMillis();
		while(index < times) {
			filaOpc.insere(aluno);
			index++;
		}
		Long end = System.currentTimeMillis();
		System.out.println("[Fila Usando ArrayList] Performance inserindo -> " + (  end - start )/1000.0 + "ms");
		
		start = System.currentTimeMillis();
		while( times > index) {
			filaOpc.remove();
			times--;
		}
		end = System.currentTimeMillis();
		System.out.println("[Fila Usando ArrayList] Performance removendo -> " + (  end - start )/1000.0 + "ms");


		start = System.currentTimeMillis();
		while(index < times) {
			filaPar.insere(aluno);
			index++;
		}
		end = System.currentTimeMillis();
		System.out.println("[Fila Usando LinkedList] Performance inserindo -> " + ( start - end )/1000.0 + "ms");
		
		start = System.currentTimeMillis();
		while( times > index) {
			filaPar.remove();
			times--;
		}
		end = System.currentTimeMillis();
		System.out.println("[Fila Usando LinkedList] Performance removendo -> " + ( start - end )/1000.0 + "ms");

	}
}
