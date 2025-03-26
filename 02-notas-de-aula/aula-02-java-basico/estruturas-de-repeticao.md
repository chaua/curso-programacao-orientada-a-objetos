# Estruturas de Repetição

Laços (ou loops) são estruturas de controle que permitem executar um **bloco de código repetidamente**, com base em uma condição **booleana**.

## :orange\_book: Estrutura `for`

{% code title="📌 Sintaxe" %}
```java
for (inicialização; condição; incremento) {
    // bloco de repetição
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Repetição nº " + i);
}
```
{% endcode %}

* `int i = 0`: inicialização
* `i < 5`: condição
* `i++`: incremento ao final de cada iteração

## :orange\_book: Estrutura `while`

Executa o bloco **enquanto a condição for verdadeira**. A condição é testada **antes** da execução.

{% code title="📌 Sintaxe" %}
```java
while (condicao) {
    // bloco de repetição
}
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int i = 0;
while (i < 5) {
    System.out.println("Contador: " + i);
    i++;
}
```
{% endcode %}

## :orange\_book: Estrutura `do / while`

Semelhante ao `while`, **mas a condição é avaliada ao final**, garantindo **pelo menos uma execução** do bloco.

{% code title="📌 Sintaxe" %}
```java
do {
    // bloco de repetição
} while (condicao);
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
int i = 0;
do {
    System.out.println("Valor: " + i);
    i++;
} while (i < 5);
```
{% endcode %}

## :orange\_book: Comandos de Controle de Laço

Java fornece comandos para **alterar o fluxo** dentro de um laço:

| Comando    | Função                                   |
| ---------- | ---------------------------------------- |
| `break`    | Interrompe imediatamente o laço atual    |
| `continue` | Pula para a **próxima iteração** do laço |

{% code title="🧪 Exemplo com break" %}
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) break;
    System.out.println(i);
}
// Saída: 1 2 3 4
```
{% endcode %}

{% code title="🧪 Exemplo com continue" %}
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
// Saída: 1 2 4 5
```
{% endcode %}

## :orange\_book: Boas Práticas&#x20;

* **Evite laços infinitos** (condições que nunca se tornam falsas).
* Prefira o `for` para **contagens bem definidas**.
* Use `while` para **verificações baseadas em estados** (ex: leitura de arquivo).
* Não abuse de `break` e `continue`, pois dificultam a legibilidade.
