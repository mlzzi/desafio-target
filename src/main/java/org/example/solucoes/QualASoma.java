package org.example.solucoes;

public class QualASoma {

    public String resultadoSoma() {

        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        return "O resultado é " + soma;
    }
}
