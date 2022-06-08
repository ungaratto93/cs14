package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.cripto.ReverseString;

public class TesteReverseString {

	public static void main(String[] args) {
		
		String str = "casa";
		String reversed = ReverseString.toReverse(str);
		System.out.println(reversed);
		System.out.println("reversed == asac");
		System.out.println(reversed.equals("asac"));

	}
	
}
