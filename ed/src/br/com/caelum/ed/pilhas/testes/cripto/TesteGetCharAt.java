package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.Mensagem;

public class TesteGetCharAt {

	public static void main(String[] args) {
		Mensagem msg = new Mensagem();
		msg.setTexto("Teste");
		char c = msg.getChartAt(1);
		System.out.println('e' == c);
	}
	
}
