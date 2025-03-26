# Estruturas de Decisão

Estruturas de decisão permitem alterar o fluxo de execução do programa com base em condições **booleanas** (`true` ou `false`).

## :orange\_book: Comando `if`

A estrutura `if` executa um **bloco de código** apenas se a condição for verdadeira.

{% code title="📌 Sintaxe" %}
```java
if (condicao) {
    // Bloco A (executado se a condição for verdadeira)
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int idade = 20;

if (idade >= 18) {
    System.out.println("Você é maior de idade.");
}
```
{% endcode %}

## :orange\_book: Comando `if / else`

Adiciona um **bloco alternativo** para o caso da condição ser falsa.

{% code title="📌 Sintaxe" %}
```java
if (condicao) {
    // Bloco A (se verdadeiro)
} else {
    // Bloco B (se falso)
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int nota = 60;

if (nota >= 70) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```
{% endcode %}

## :orange\_book: Comando `if / else if / else`

Permite testar múltiplas condições de forma sequencial.&#x20;

{% code title="📌 Sintaxe" %}
```java
if (cond1) {
    // Bloco A
} else if (cond2) {
    // Bloco B
} else {
    // Bloco C (nenhuma condição anterior foi satisfeita)
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int nota = 85;

if (nota >= 90) {
    System.out.println("Aprovado com excelência");
} else if (nota >= 70) {
    System.out.println("Aprovado");
} else if (nota >= 50) {
    System.out.println("Recuperação");
} else {
    System.out.println("Reprovado");
}
```
{% endcode %}

## :orange\_book: Comando `switch`

O `switch` é usado para comparar o valor de uma variável com **vários casos possíveis**.

{% code title="📌 Sintaxe" %}
```java
switch (variavel) {
    case valor1:
        // Bloco A
        break;
    case valor2:
        // Bloco B
        break;
    default:
        // Bloco C (caso nenhum valor seja igual)
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int dia = 3;

switch (dia) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Dia inválido");
}
```
{% endcode %}

## :orange\_book: Boas Práticas&#x20;

* Sempre **usar chaves `{}`**, mesmo em blocos de uma linha.
* **Evite condições complexas** dentro de `if`; prefira quebrar em variáveis auxiliares.
* **Prefira `switch`** quando houver múltiplos valores exatos a serem comparados com a mesma variável.
