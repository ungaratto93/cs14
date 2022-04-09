package br.com.caelum.ed.vetores;

import java.util.Vector;

import br.com.caelum.ed.alunos.Aluno;

public class Vetor {

	// controladores de posicao
	private int tamanhoAtual = 0;
	
	// declarando e inicializando um array encapsulado de Aluno
	// com capacidade 100
	
	// declara um array (vetor) do tipo alunos, 
	// apos asscia uma instancia de array do tipo aluno, 
	// com tamanho fixo de 100
	//private Aluno[] alunos = new Aluno[];
	
	// cria um objeto generico
	private Object[] objetos = new Object[100000];
	
	private void garanteEspaco() {
		if(this.tamanhoAtual == this.objetos.length ) {
			Object[] novoArray = new Object[this.objetos.length * 2];
			// faz a copia
			for (int index = 0; index < this.objetos.length; index++) {
				novoArray[index] = this.objetos[index];
			}
			// sobreescreve a referencia com o novo array
			this.objetos = novoArray;
		}
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.tamanhoAtual;
	}
	
	// funcao para demonstra a forma lenta (linear)
	public void adicionaDeFormaLinear(Aluno aluno) {
		for (int index = 0; index < this.objetos.length; index++) {
			if(this.objetos[index] == null) {
				this.objetos[index] = aluno;
				break;
			}
		}
	}
	
	public void adicionaSemGarantirEspaco(Aluno novoAluno) {
		this.objetos[this.tamanhoAtual] = novoAluno;
		this.tamanhoAtual++;
	}
	
	public void adiciona(Aluno novoAluno) {
		this.garanteEspaco();
		this.objetos[this.tamanhoAtual] = novoAluno;
		this.tamanhoAtual++;
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int index = this.tamanhoAtual - 1; index >= posicao; index-=1) {
			this.objetos[index + 1] = this.objetos[index];
		}
		
		this.objetos[posicao] = aluno;
		this.tamanhoAtual++;
	}
	
	public Object pega(int posicao) throws NotFoundException {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		if (objetos[posicao] == null) {
			throw new NotFoundException("Posição vazia");
		}
		
		return objetos[posicao];
	}

	public void removePorReferencia(Object objeto) {
		try {
			Vector posicoes = encontrarPosicoes(objeto);
			boolean firstRemove = true;
			for (int index = 0; index < posicoes.size(); index++) {
				int it = (int) posicoes.remove(index);
				remove(it);

				firstRemove = false;
				if (!firstRemove && index < posicoes.size()) {
					it = (int)posicoes.get(index)-1;
					remove(it);
				}
			}

		} catch (IsEmptyException ex) {
			System.out.println(ex);
		} catch (NotFoundException ex) {
			System.out.println(ex);
		}

	}
	
	private Vector<Integer> encontrarPosicoes(Object objeto) throws IsEmptyException {
		Vector<Integer> posicoes = new Vector<Integer>();
		
		for (int index = 0; index < this.objetos.length; index++) {
			if (this.objetos[index] != null) {
				if( ((Aluno)objeto).getNome() == ((Aluno) this.objetos[index]).getNome()) {
					posicoes.add(index);
				}
			}
		}

		if (posicoes.isEmpty()) {
			throw new IsEmptyException("Is Empty");
		}
		return posicoes;
	}

	public void remove(int posicao) throws NotFoundException {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		if (objetos[posicao] == null) {
			throw new NotFoundException("Nao encontrei isso");
		}
		
		for (int index = posicao; index < this.tamanhoAtual - 1; index++) {
			this.objetos[index] = this.objetos[index + 1];
		}
		this.tamanhoAtual--;
	}

	public void clear() {
		int posicao = this.tamanhoAtual - 1;
		for(int index = posicao; index >= 0; index--) {
			this.removePorReferencia(this.objetos[index]);
		}
	}

	public boolean contemFormaLinear(Aluno aluno) {
		for (int index = 0; index < this.objetos.length; index++) {
			if(aluno == this.objetos[index]) {
				return true;
			}
		}
		return false;
	}

	public boolean contem(Aluno aluno) {
		int indexadorLocal = 0;
		boolean procurar = true;
		boolean encontrado = false;
		
		while (procurar) {

			if (indexadorLocal > this.objetos.length) {
				procurar = false;
			}

			if (aluno == this.objetos[indexadorLocal] ) {
				procurar = false;
				encontrado = true;
			}

			indexadorLocal = indexadorLocal + 1;

		}

		return encontrado;
	}

	public int tamanho() {
		return this.tamanhoAtual;
	}
	
	public String toString() {
		if (this.tamanhoAtual == 0) {
			return "[]";
		}
	
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int index = 0; index < this.tamanhoAtual - 1; index++) {
			builder.append(this.objetos[index]);
			builder.append(",");
		}
		builder.append(this.objetos[this.tamanhoAtual - 1]);
		builder.append("]");

		return builder.toString();
	}
	
}
