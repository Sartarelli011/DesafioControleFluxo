package org.example.Exception;

public class ParametrosException extends Exception {

    public ParametrosException() {
        super("O parametro 1 deve ser menor que o parametro 2");
    }
}
