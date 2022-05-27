package br.com.caelum.ed.listasligadas.testes;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestePerfomance {

	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		LinkedList<String> lista = new LinkedList<String>();
		int numeroDeElementos = 40000;
		
		// ADICIONA NO COMECO
		long inicio = System.currentTimeMillis();
		for (int index = 0; index < numeroDeElementos; index++ ) {
			vetor.add(0, "" + index);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Vetor adiciona no começo: " + (fim - inicio) / 1000.0 + " ms ");
		
		inicio = System.currentTimeMillis();
		for (int index = 0; index < numeroDeElementos; index++) {
			lista.add(0, "" + index);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada adiciona no começo: " + (fim - inicio) / 1000.0 + " ms ");
		
		
		System.out.println(" ");
		
		
		// PERCORRENDO
		inicio = System.currentTimeMillis();
		for (int index = 0; index < numeroDeElementos; index++) {
			vetor.get(index);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor percorrendo: " + (fim - inicio) / 1000.0 + " ms ");
		
		inicio = System.currentTimeMillis();
		for ( int index = 0; index < numeroDeElementos; index++) {
			lista.get(index);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada percorrendo: " +  (fim - inicio) / 1000.0 + " ms ");
		
		System.out.println("");
		
		//REMOVE DO COMECO
		inicio = System.currentTimeMillis();
		for (int index = 0; index < numeroDeElementos; index++) {
			vetor.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Vetor remove do começo: " + (fim - inicio) / 1000.0 + " ms ");
		
		inicio = System.currentTimeMillis();
		for (int index = 0; index < numeroDeElementos; index++) {
			lista.remove(0);
		}
		fim = System.currentTimeMillis();
		System.out.println("Lista Ligada remove do comeco: " + (fim - inicio) / 1000.0 + " ms ");
		
	}
	
}
