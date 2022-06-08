package br.com.caelum.ed.pilhas.cripto;

import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class InsertMessage {

	public static void onStack(String message, PilhaParametrizada<Character> pilha) {

		//String reverseMessage = ReverseMessage.reverse(message);

		for (int i = 0; i < message.length(); i++) {
			Character character = WrapperChar.fromChar(message.charAt(i));
			pilha.insere(character);
		}

	}

}
