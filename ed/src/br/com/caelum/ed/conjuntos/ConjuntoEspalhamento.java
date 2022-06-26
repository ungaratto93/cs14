package br.com.caelum.ed.conjuntos;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ConjuntoEspalhamento {
	private static int COLUNAS = 26;
	private List<List<Object>> tabela = new ArrayList<List<Object>>(COLUNAS);
	
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int index = 0; index < COLUNAS; index++) {
			LinkedList<Object> lista = new LinkedList<Object>();
			tabela.add(lista);
		}
	}
	
	public void adiciona(Object palavra) {
		if(!contem(palavra)) {
			this.verificarCargaDaTabela();
			int indice = this.calculaIndiceDaTabela(palavra);
			List<Object> lista = this.tabela.get(indice);
			lista.add(palavra);
			this.tamanho++;
		}
	}

	public void remove(Object palavra) {
		if(this.contem(palavra)) {
			this.verificarCargaDaTabela();
			int indice = this.calculaIndiceDaTabela(palavra);
			List<Object> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanho--;
		}
	}

	public Boolean contem(Object palavra) {
		int indice = this.calculaIndiceDaTabela(palavra);
		List<Object> lista = this.tabela.get(indice);
		return lista.contains(palavra);
	}

	public List<Object> pegaTodas() {
		List<Object> palavras = new ArrayList<Object>();
		for (int index = 0; index < this.tabela.size(); index++) {
			palavras.addAll(this.tabela.get(index));
		}
		return palavras;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	public void imprimeTabela() {
		for (List<Object> lista : this.tabela) {
			System.out.print("[");
			for(int index = 0; index < lista.size(); index++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
	
	@Deprecated
	@SuppressWarnings("unused")
	private int calculaCodigoDeEspalhamento(String palavra) {
		int codigo = 1;
		for (int index = 0; index < palavra.length(); index++) {
			/* numeric promotion
			 * https://stackoverflow.com/questions/54402612/java-implicit-conversion-between-int-and-char
			 * neste caso de opperacao entre inteiros e chars, o char e promovido para inteiro,
			 * entao a operacao de soma é realizada
			 * Exemplo = 31 * 1 + 48 (valor ascii do char ʽ0ʽ)
			 * 
			 * Manterei para fins de estudo, porem poderia ser removido por nao ser mais utilizado
			 */
			codigo = 31 * codigo + palavra.charAt(index);
		}
		return codigo;
	}
	
	private int calculaIndiceDaTabela(Object palavra) {
		int codigoDeEspalhamento = Math.abs(palavra.hashCode());
		return codigoDeEspalhamento % tabela.size();
	}
	
	private void limparTabela() {
		this.tabela.clear();
	}
	
	private void adicionaListas(int novaCapacidade) {
		for (int index = 0; index < novaCapacidade; index++) {
			this.tabela.add(new LinkedList<Object>());
		}
	}
	
	private void adicionaTodas(List<Object> palavras) {
		for ( Object palavra : palavras ) { this.adiciona(palavra); }
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<Object> palavras = this.pegaTodas();
		this.limparTabela();
		this.adicionaListas(novaCapacidade);
		this.adicionaTodas(palavras);
	}
	
	private void verificarCargaDaTabela() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
	
}
