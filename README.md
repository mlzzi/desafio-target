# Desafio de Programação

## Índice

1. [Verificação de Número na Sequência de Fibonacci](#1-verificação-de-número-na-sequência-de-fibonacci)
2. [Verificação da Letra 'A' em uma String](#2-verificação-da-letra-a-em-uma-string)
3. [Cálculo da Soma](#3-cálculo-da-soma)
4. [Completar a Próxima Sequência Lógica](#4-completar-a-próxima-sequência-lógica)
5. [Problema dos Interruptores e Lâmpadas](#5-problema-dos-interruptores-e-lâmpadas)
6. [Estrutura do Projeto Java](#6-estrutura-do-projeto-java)

---

## 1. Verificação de Número na Sequência de Fibonacci

### Descrição
Neste problema, você deve implementar um programa que calcula a sequência de Fibonacci, começando de 0 e 1, e verifica se um determinado número fornecido faz parte dessa sequência.

**Importante:** O número pode ser informado pelo usuário ou previamente definido no código.

### [Ver solução em Fibonacci.java](./java/org/example/solucoes/Fibonacci.java)

---

## 2. Verificação da Letra 'A' em uma String

### Descrição
Este desafio requer um programa que identifique a presença da letra 'a' (maiúscula ou minúscula) em uma string e também conte quantas vezes ela aparece.

**Importante:** A string pode ser fornecida pelo usuário ou previamente definida no código.

### [Ver solução em VerificaLetraA.java](./java/org/example/solucoes/VerificaLetraA.java)

---

## 3. Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
### Ao final do processamento, qual será o valor da variável SOMA?

### Resposta: 77

### [Ver solução em QualASoma.java](./java/org/example/solucoes/QualASoma.java)

---

## 4. Completar a Próxima Sequência Lógica

### Descrição
Neste desafio, você deve identificar a lógica por trás de cada sequência de números e prever o próximo elemento de cada uma delas:

- **a** - 1, 3, 5, 7, **9**
- **b** - 2, 4, 8, 16, 32, 64, **128**
- **c** - 0, 1, 4, 9, 16, 25, 36, **49**
- **d** - 4, 16, 36, 64, **100**
- **e** - 1, 1, 2, 3, 5, 8, **13**
- **f** - 2, 10, 12, 16, 17, 18, 19, **200**

---

## 5. Problema dos Interruptores e Lâmpadas

### Descrição
### Você está em uma sala com três interruptores, cada um controlando uma lâmpada em uma sala diferente. Você pode ligar e desligar os interruptores quantas vezes quiser, mas só pode visitar as salas das lâmpadas duas vezes. O objetivo é descobrir qual interruptor controla qual lâmpada.

### Já vi um problema parecido com esse, mas esse problema determinava que as lâmpadas eram incandescentes e estariam na mesma sala. Neste problema as lâmpadas estão em salas diferentes e não especifica se são lâmpadas incandescentes ou frias (LED).
 ### Portanto respondo com duas hipóteses:

Temos os interruptores 1, 2 e 3 e salas com lâmpadas A, B e C.

- **Hipótese 1:** As lâmpadas são incandescentes, logo posso usar o fato que esquentarem.
   - #### 1.	Ligo por alguns minutos o interruptor 1, depois desligo e ligo o interruptor 2.

     - Vou à sala A. Se a lâmpada estiver acesa, então o Interruptor 2 controla a lâmpada A. Se a lâmpada estiver apagada e quente, 1 Liga B. Se estiver fria, 3 liga A
     - Sabendo um dos resultados, repetimos o processo. Se 1 liga A, ligamos o interruptor 2 e vamos a sala B.
     - Se B está aceso, os interruptores ligam 1A, 2B e 3C. Se estiver apagada, então a resposta é 1A, 2C e 3B.
     - O raciocínio é o mesmo pra qualquer tentativa, começando pela sala A, B ou C.


- **Hipótese 2:** Lâmpadas de LED

  - #### 2.	Primeira possibilidade: Ligue o Interruptor 1 e vá até a sala A.
    - Se a lâmpada estiver acesa, então o Interruptor 1 controla a lâmpada A.
    - Ligue o interruptor 2 e vá a sala B. Se B estiver aceso então 1 liga A, 2 liga B e 3 liga C.
    - Caso B esteja apagado, então 1 liga A, 2 liga C e 3 liga B.

  - #### 3.	Segunda possibilidade: Ligue o Interruptor 1 e vá até a sala A.
    - Se a lâmpada estiver apagada, então o Interruptor 1 controla a lâmpada B ou C.
    - Ligue o interruptor 2 e vá a sala B. Se B estiver aceso então 1 liga C, 2 liga B e 3 liga A.
    - Caso B esteja apagado, então 1 liga B ou C, 2 liga A ou C e 3 liga A ou B.

#### Vemos, portanto, que na hipótese 2 há alguma chance de acerto, porém se nenhuma das vezes o interruptor ligar a lâmpada da sala visitada, não saberemos com exatidão qual interruptor liga qual lâmpada.

---