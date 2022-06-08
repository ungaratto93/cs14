package br.com.caelum.ed.pilhas.cripto;

public class ReverseString {

	private static String str = "";
	private static char c = ' ';
	
	public static String toReverse(String mensagem) {
	
	      for (int i=mensagem.length()-1; i>=0; i--) {
	    	  c = mensagem.charAt(i);
	    	  str += c;
	      }

	      return str;
	
	}
	
}
