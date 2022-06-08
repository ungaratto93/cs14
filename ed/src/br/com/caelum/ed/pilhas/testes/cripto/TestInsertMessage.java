package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.cripto.InsertMessage;
import br.com.caelum.ed.pilhas.cripto.Message;
import br.com.caelum.ed.pilhas.cripto.ReverseMessage;
import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class TestInsertMessage {

	public static void main(String[] args) {

		PilhaParametrizada <Character> pilha = new PilhaParametrizada<Character>();
		Message message = new Message();
		message.setTexto("Teste");
		InsertMessage.onStack(message.getText(), pilha);

		String messageCriptRecovered = "";
		while(!pilha.vazia()) {
			Character character = pilha.remove();
			messageCriptRecovered += character;
		}
		
		System.out.println("etseT.equals(messageRecovered)");
		System.out.println("etseT".equals(messageCriptRecovered));

		System.out.println("");
		
		String messageUncriptRecovered = ReverseMessage.reverse(messageCriptRecovered);
		System.out.println("Teste.equals(uncript)");
		System.out.println("Teste".equals(messageUncriptRecovered));

	}
	
}
