package org.example.solucoes;

//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
//IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

public class VerificaLetraA {

    // Método verifica presença e ocorrência da letra A
    public String verificarPresencaLetraA(String palavra) {

        int count = 0;

        String resposta = "";

        if (palavra.toLowerCase().contains("a")) {

            for (char c : palavra.toCharArray()) {
                if (Character.isLetter('a')) {
                    count++;
                }
            }
            if (count == 1) {
                resposta = "A palavra " + palavra + " contém a letra 'a', e ela ocorre " + count + " vezes.";
            } else if (count > 1) {
                resposta = "A palavra " + palavra + " contém a letra 'a', e ela ocorre " + count + " vez.";
            }
        } else {
            resposta = "A palavra " + palavra + " não possui a letra 'a'.";
        }

        return resposta;
    }
}
