package br.com.caelum.ed;

public class Aluno {

	private String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome;
	}
	
	public boolean equals(Object o) {
		Aluno outroAluno = (Aluno)o;
		return this.getNome().equals(outroAluno.getNome());
	}
}
