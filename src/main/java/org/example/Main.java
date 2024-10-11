package org.example;

import org.example.solucoes.Fibonacci;
import org.example.solucoes.QualASoma;
import org.example.solucoes.VerificaLetraA;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.verificarNumeroFibonacci(5));
        System.out.println(fibonacci.verificarNumeroFibonacci(25));
        System.out.println(fibonacci.verificarNumeroFibonacci(987));

        ////////////////////////

        VerificaLetraA verificaLetraA = new VerificaLetraA();

        System.out.println(verificaLetraA.verificarPresencaLetraA("mamao"));
        System.out.println(verificaLetraA.verificarPresencaLetraA("mamão"));
        System.out.println(verificaLetraA.verificarPresencaLetraA("copo"));

        ///////////////////////

        QualASoma qualASoma = new QualASoma();

        System.out.println(qualASoma.resultadoSoma());

        //////////////////////

    }
}