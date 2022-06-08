package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.cripto.Message;

public class TesteGetCharAt {

	public static void main(String[] args) {
		Message msg = new Message();
		msg.setTexto("Teste");
		char c = msg.getChartAt(1);
		System.out.println('e' == c);
	}
	
}
