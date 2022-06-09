package br.com.caelum.ed.pilhas.cripto;

import br.com.caelum.ed.pilhas.PilhaParametrizada;

public class InsertMessage {

	public static void onStack(String message, PilhaParametrizada<Character> pilha) {

		//String reverseMessage = ReverseMessage.reverse(message);

		for (int index = 0; index < message.length(); index++) {
			Character character = WrapperChar.toCharacter(message.charAt(index));
			pilha.insere(character);
		}

	}

}
