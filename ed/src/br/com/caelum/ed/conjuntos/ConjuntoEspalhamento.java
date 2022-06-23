package br.com.caelum.ed.conjuntos;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	private static int COLUNAS = 26;
	private List<List<String>> tabela = new ArrayList<List<String>>(COLUNAS);
	
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int index = 0; index < COLUNAS; index++) {
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}

	public void remove(String palavra) {
		if(this.contem(palavra)) {
			int indice = this.calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
		}
	}

	public Boolean contem(String palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}

	public List<String> pegaTodas() {
		List<String> palavras = new ArrayList<String>();
		for (int index = 0; index < this.tabela.size(); index++) {
			palavras.addAll(this.tabela.get(index));
		}
		return palavras;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	public void imprimeTabela() {
		for (List<String> lista : this.tabela) {
			System.out.print("[");
			for(int index = 0; index < lista.size(); index++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
	
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for (int index = 0; index < palavra.length(); index++) {
			/* numeric promotion
			 * https://stackoverflow.com/questions/54402612/java-implicit-conversion-between-int-and-char
			 neste caso de opperacao entre inteiros e chars, o char e promovido para inteiro,
			 entao a operacao de soma é realizada
			 Exemplo = 31 * 1 + 48 (valor ascii do char ʽ0ʽ)
			 */
			codigo = 31 * codigo + palavra.charAt(index);
		}
		return codigo;
	}
	
	private int calculaIndiceDaTabela(String palavra) {
		int codigoDeEspalhamento = Math.abs(this.calculaCodigoDeEspalhamento(palavra));
		return codigoDeEspalhamento % tabela.size();
	}
	
}
