package br.com.caelum.ed.vetores;

public class NotFoundException extends Exception { 
    public NotFoundException(String errorMessage) {
        System.out.println(errorMessage);
    }
}
