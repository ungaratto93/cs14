package br.com.caelum.ed.pilhas.cripto;

public class ReverseMessage {

	private static String str = "";
	private static char c = ' ';
	
	public static String reverse(String mensagem) {
	
	      for (int i=mensagem.length()-1; i>=0; i--) {
	    	  c = mensagem.charAt(i);
	    	  str += c;
	      }

	      return str;
	
	}
	
}
