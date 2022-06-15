package br.com.caelum.ed.filas;

import java.util.ArrayList;

public class FilaOpcional<T> {

	private ArrayList<T> objetos = new ArrayList<T>();
	
	public void insere(T t) {
		this.objetos.add(t);
	}
	
	public T remove() {
		return this.objetos.remove(0);
	}
	
	public Boolean vazia() {
		return this.objetos.size() == 0;
	}

}
