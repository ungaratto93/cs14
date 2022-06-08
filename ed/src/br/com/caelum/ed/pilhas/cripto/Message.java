package br.com.caelum.ed.pilhas.cripto;

public class Message {

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
