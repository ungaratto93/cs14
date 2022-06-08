package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.cripto.ReverseMessage ;

public class TesteReverseMessage {

	public static void main(String[] args) {
		
		String str = "casa";
		String reversed = ReverseMessage.reverse(str);
		System.out.println(reversed);
		System.out.println("reversed == asac");
		System.out.println(reversed.equals("asac"));

	}
	
}
