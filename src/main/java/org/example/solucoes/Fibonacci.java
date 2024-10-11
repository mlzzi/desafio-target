package org.example.solucoes;

//1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
// escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
// ou não a sequência.

public class Fibonacci {

    // Método que verifica se número é Fibonacci
    public String verificarNumeroFibonacci(int n) {

        String resultado = "Número não é Fibonacci";

        int a = 0;
        int b = 1;

        if (n == 0 || n == 1) {
            resultado = "Número é Fibonacci";
        }

        int c = a + b;

        // Loop para verificar se é da sequência. O Loop itera até encontrar o número procurado, senão for a variavel resultado não é atualizada.
        while (c <= n) {
            if (c == n) {
                resultado = "Número é Fibonacci";
            }
            a = b;
            b = c;
            c = a + b;
        }

        return resultado;
    }
}
