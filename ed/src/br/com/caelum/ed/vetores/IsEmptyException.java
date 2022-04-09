package br.com.caelum.ed.vetores;

public class IsEmptyException extends Exception { 
    public IsEmptyException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
