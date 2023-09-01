package org.example;

import org.example.Exception.ParametrosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParametrosException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        Integer primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo nummero: ");
        Integer segundoNumero = scanner.nextInt();

        try {
            Contador(primeiroNumero, segundoNumero);
        } catch (Exception e) {
           throw e;
        }


    }

    static void Contador(Integer a, Integer b) throws ParametrosException {
        if (a > b) {
            throw new ParametrosException();
        }
        int contagem = b - a;
        for (Integer i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número" + (i + 1));
        }
    }
}