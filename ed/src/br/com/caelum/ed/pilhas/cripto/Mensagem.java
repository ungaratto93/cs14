package br.com.caelum.ed.pilhas.cripto;

public class Mensagem {

	public String texto = "";
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getText() {
		return this.texto;
	}

	public char getChartAt(int index) {
		return this.texto.charAt(index);
	}
		
}
