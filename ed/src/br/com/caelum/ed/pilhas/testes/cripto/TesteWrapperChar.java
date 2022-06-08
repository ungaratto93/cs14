package br.com.caelum.ed.pilhas.testes.cripto;

import br.com.caelum.ed.pilhas.cripto.WrapperChar;

public class TesteWrapperChar {

	public static void main(String[] args) {
		
		Character ch = 'c';
		Character r = WrapperChar.fromChar('c');
		System.out.println(r.getClass() == Character.class);

	}
	
}
