# 🤖 Aula 04 - Java Básico

## História do Java

Java foi criado pela Sun Microsystems em meados da década de 1990 com o objetivo de desenvolver uma plataforma para equipamentos eletrônicos simples. É uma linguagem de programação orientada a objetos que se destaca pela independência de plataforma, devido à sua execução na **Java Virtual Machine (JVM)**.

## Estrutura de um Alô, mamãe!

Um programa básico em Java segue a seguinte estrutura:

```java
public class AloMamae {
    public static void main(String[] args) {
        System.out.println("Alô, mamãe!");
    }
}
```

* **`public class AloMamae`**: define uma classe pública com o mesmo nome do arquivo.
* **`public static void main(String[] args)`**: método principal onde a execução começa.
* **`System.out.println("Alô, mamãe!");`**: exibe a mensagem no console.

Claro! A seguir, vou preparar **notas de aula bem detalhadas** sobre a **Seção 3 – Tipos de Dados Primitivos**, com linguagem acadêmica e explicações claras, divididas em partes para facilitar a leitura e assimilação.

## Tipos de Dados Primitivos

Na linguagem Java, os **tipos de dados primitivos** representam os blocos fundamentais de construção para armazenar valores simples. Ao contrário dos objetos, que são instâncias de classes, os primitivos não possuem métodos ou atributos associados — eles são valores literais e ocupam espaço direto na memória.

**Características:**

* Ocupam menos memória.
* São mais rápidos para operações de cálculo.
* Não são instanciáveis.
* Sempre armazenam um único valor.

**São 8 os tipos primitivos em Java:**

| Tipo      | Categoria         | Tamanho | Valor Padrão | Intervalo de Valores    |
| --------- | ----------------- | ------- | ------------ | ----------------------- |
| `boolean` | Lógico            | 1 bit   | `false`      | `true` ou `false`       |
| `char`    | Caractere Unicode | 2 bytes | `'\u0000'`   | `0` a `65535` (Unicode) |
| `byte`    | Numérico inteiro  | 1 byte  | `0`          | `-128` a `127`          |
| `short`   | Numérico inteiro  | 2 bytes | `0`          | `-32.768` a `32.767`    |
| `int`     | Numérico inteiro  | 4 bytes | `0`          | `-2^31` a `2^31-1`      |
| `long`    | Numérico inteiro  | 8 bytes | `0L`         | `-2^63` a `2^63-1`      |
| `float`   | Ponto flutuante   | 4 bytes | `0.0f`       | \~±3.4 × 10^38          |
| `double`  | Ponto flutuante   | 8 bytes | `0.0d`       | \~±1.7 × 10^308         |

## Representação de Literais

Literais são os valores diretamente atribuídos às variáveis. Eles podem ser expressos de diferentes formas, de acordo com o tipo e a base numérica.

### **Literais Numéricos**

| Tipo                  | Exemplo             | Descrição       |
| --------------------- | ------------------- | --------------- |
| Decimal (base 10)     | `int x = 42;`       | Padrão          |
| Octal (base 8)        | `int x = 052;`      | Inicia com `0`  |
| Hexadecimal (base 16) | `int x = 0x2A;`     | Inicia com `0x` |
| Binário (base 2)      | `int x = 0b101010;` | Inicia com `0b` |

### **Literais de Ponto Flutuante**

* Ponto fixo: `double pi = 3.14;`
* Ponto flutuante com notação científica: `double grande = 5.12e3; // 5120.0`
* Literal `float`: deve conter `f` ou `F` ao final → `float x = 3.14f;`

### **Literais Booleanos e Caracteres**

* Booleanos: `true`, `false`
* Caracteres: `'A'`, `'\n'`, `'\u0041'` (Unicode para 'A')

Perfeito! Vamos continuar com as **Notas de Aula – Parte 3**, abordando agora **coerção de tipos**, com explicações didáticas, analogias visuais e exemplos em Java.

## Conversão de Tipos de Dados

**Coerção** ou **conversão de tipos** é o processo de transformação de um valor de um tipo primitivo para outro. Ela pode ocorrer de duas maneiras:

1. **Coerção Implícita (Widening Conversion)**
2. **Coerção Explícita (Narrowing Conversion)**

Vamos usar uma analogia para entender os dois tipos de coerção:

* Imagine que **os dados são sapatos** e **os tipos são caixas**.
* Uma **coerção é o ato de colocar um sapato dentro de uma caixa**.

### Coerção Implícita

> É como colocar um **sapato pequeno em uma caixa grande**. Cabe com folga e segurança, sem risco de perda.

Exemplo: converter `int` para `double`.

```java
int numero = 10;
double resultado = numero; // Conversão implícita
System.out.println(resultado); // Saída: 10.0
```

{% hint style="success" %}
Seguro. Não há perda de informação.
{% endhint %}

### Coerção Explícita (Casting)

> É como tentar colocar **um sapato grande em uma caixa pequena**. Você pode até forçar, mas vai **perder parte do sapato** (informação).

Exemplo: converter `double` para `int`.

```java
double preco = 19.99;
int precoInteiro = (int) preco; // Conversão explícita
System.out.println(precoInteiro); // Saída: 19 (perdeu o .99)
```

{% hint style="warning" %}
Necessita do uso do **cast** (`(tipo) valor`). Pode ocorrer **perda de dados ou truncamento**.
{% endhint %}

### Hierarquia de Promoção de Tipos Numéricos

Java promove automaticamente valores para o **tipo maior** durante operações mistas:

```
byte → short → int → long → float → double
```

Exemplo de coerção implícita em uma operação:

```java
int a = 5;
double b = 2.5;
double resultado = a + b; // a (int) é convertido para double automaticamente
System.out.println(resultado); // Saída: 7.5
```

Mesmo que `a` seja `int`, ele é promovido a `double` para compatibilizar com `b`, preservando a precisão.&#x20;

Agora, se fizermos o contrário:

```java
double d = 9.7;
int i = (int) d;         // Cast explícito necessário
System.out.println(i);     // Saída: 9
```

### Cuidados com Coerção Explícita

* **Truncamento de ponto flutuante**: perda da parte decimal.
* **Overflow**: valores além do intervalo do tipo-alvo causam erros silenciosos.

```java
int grande = 130;
byte pequeno = (byte) grande; // Valor fora do intervalo de byte
System.out.println(pequeno); // Saída: -126 (comportamento inesperado)
```

## Operadores em Java

Os **operadores** são símbolos especiais que indicam à linguagem que uma operação deve ser realizada. Eles atuam sobre variáveis e valores, e estão divididos em várias categorias.

### Operadores Aritméticos

Utilizados para realizar operações matemáticas básicas.

| Operador | Nome           | Exemplo  | Resultado |
| -------- | -------------- | -------- | --------- |
| `+`      | Adição         | `3 + 2`  | `5`       |
| `-`      | Subtração      | `5 - 3`  | `2`       |
| `*`      | Multiplicação  | `4 * 2`  | `8`       |
| `/`      | Divisão        | `10 / 2` | `5`       |
| `%`      | Módulo (resto) | `7 % 3`  | `1`       |

Ótimo! Vamos seguir com a **Parte 4** das notas de aula, abordando de maneira didática os **operadores da linguagem Java**, com explicações, classificações e exemplos práticos. Esta parte é essencial para compreender expressões e estruturas de decisão.

**Observações importantes:**

*   Em divisões entre inteiros, o resultado também é inteiro:

    ```java
    int x = 7;
    int y = 2;
    System.out.println(x / y); // Saída: 3
    ```
*   Para obter resultado decimal:

    ```java
    double r = (double) x / y;
    System.out.println(r); // Saída: 3.5
    ```

### Operadores Relacionais

Usados para comparar valores. Sempre retornam `true` ou `false`.

| Operador | Significado    | Exemplo  |
| -------- | -------------- | -------- |
| `==`     | Igualdade      | `a == b` |
| `!=`     | Diferente      | `a != b` |
| `>`      | Maior que      | `a > b`  |
| `<`      | Menor que      | `a < b`  |
| `>=`     | Maior ou igual | `a >= b` |
| `<=`     | Menor ou igual | `a <= b` |

Exemplo prático:

```java
int idade = 18;
if (idade >= 18) {
    System.out.println("Maior de idade");
}
```

### Operadores Lógicos

Permitem combinar múltiplas expressões booleanas.

| Operador | Nome       | Exemplo          | Significado                      |
| -------- | ---------- | ---------------- | -------------------------------- |
| `&&`     | E lógico   | `a > 0 && b > 0` | `true` se **ambos** forem `true` |
| \`       |            | \`               | OU lógico                        |
| `!`      | NÃO lógico | `!a`             | Inverte o valor booleano         |

Exemplo:

```java
boolean sol = true;
boolean guardaChuva = false;

if (sol || guardaChuva) {
    System.out.println("Vou sair de casa!");
}
```

### Coerção em Expressões com Operadores

Quando utilizamos operadores entre variáveis de tipos diferentes, o compilador promove implicitamente os tipos **menores** para o tipo **maior**. Isso garante a preservação da informação e a precisão da operação.

**Exemplo de Coerção Implícita com Operadores:**

```java
int x = 10;
double y = 4.5;
double resultado = x * y; // x é promovido para double
System.out.println(resultado); // Saída: 45.0
```

**Coerção Explícita pode ser necessária para forçar a operação com perda de precisão:**

```java
double a = 7.9;
int b = (int) a * 2; // casting explícito para int (antes da multiplicação)
System.out.println(b); // Saída: 14 (7 * 2)
```

Perfeito! A seguir, dou continuidade às **notas de aula didáticas** com as seções sobre **Estruturas de Decisão** e **Estruturas de Repetição** em Java. O conteúdo será dividido em partes, com explicações claras, diagramas lógicos, exemplos de código e boas práticas de programação.

## Estruturas de Decisão (Condicionais)

Estruturas de decisão permitem alterar o fluxo de execução do programa com base em condições **booleanas** (`true` ou `false`).

### Comando `if`

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

### Comando `if / else`

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

### Comando `if / else if / else`

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

### Comando `switch`

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

### Boas Práticas com Estruturas Condicionais

* Sempre **usar chaves `{}`**, mesmo em blocos de uma linha.
* **Evite condições complexas** dentro de `if`; prefira quebrar em variáveis auxiliares.
* **Prefira `switch`** quando houver múltiplos valores exatos a serem comparados com a mesma variável.

## Estruturas de Repetição (Laços)

Laços (ou loops) são estruturas de controle que permitem executar um **bloco de código repetidamente**, com base em uma condição **booleana**.

**Principais comandos**

<table><thead><tr><th width="125.5">Estrutura</th><th>Quando usar?</th></tr></thead><tbody><tr><td><code>for</code></td><td>Quando se conhece o número de repetições</td></tr><tr><td><code>while</code></td><td>Quando se quer repetir enquanto uma condição for verdadeira</td></tr><tr><td><code>do / while</code></td><td>Quando se deseja <strong>executar pelo menos uma vez</strong>, independentemente da condição</td></tr></tbody></table>

### Estrutura `for`

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

### Estrutura `while`

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

### Estrutura `do / while`

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

### Comandos de Controle de Laço

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

### Boas Práticas com Laços

* **Evite laços infinitos** (condições que nunca se tornam falsas).
* Prefira o `for` para **contagens bem definidas**.
* Use `while` para **verificações baseadas em estados** (ex: leitura de arquivo).
* Não abuse de `break` e `continue`, pois dificultam a legibilidade.

Excelente! Vamos seguir com a **Parte 3** das notas de aula, abordando agora os **Comandos de Entrada e Saída de Dados** em Java. Este é um tópico fundamental para permitir a **interação com o usuário**, seja via terminal ou interface.

## Entrada e Saída de Dados

### Saída de Dados com `System.out`

O objeto `System.out` permite **exibir informações no console**. Ele é um **objeto de saída padrão**, do tipo `PrintStream`.

**Principais métodos:**

| Método                 | Descrição                         |
| ---------------------- | --------------------------------- |
| `System.out.print()`   | Imprime sem quebrar a linha       |
| `System.out.println()` | Imprime e pula uma linha          |
| `System.out.printf()`  | Imprime formatado (como no C/C++) |

{% code title="Exemplo" %}
```java
System.out.print("Olá ");
System.out.print("mundo!");
// Saída: Olá mundo!

System.out.println("Olá");
System.out.println("mundo!");
// Saída: 
// Olá
// mundo!

double nota = 8.75;
System.out.printf("Nota final: %.2f\n", nota);
// Saída: Nota final: 8.75
```
{% endcode %}

* `%d` → inteiro
* `%f` → ponto flutuante
* `%s` → texto (string)
* `%n` → quebra de linha (alternativa ao )

### Entrada de Dados com `Scanner`

A classe `Scanner` permite **ler dados digitados pelo usuário** no terminal. Está disponível no pacote `java.util`.

**📌 Sintaxe básica:**

```java
import java.util.Scanner;

Scanner entrada = new Scanner(System.in);
```

***

**🧪 Exemplo: Lendo diferentes tipos de dados**

```java
import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("\nResumo:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        sc.close();
    }
}
```

### Cuidados ao Usar o `Scanner`

* **Sempre feche o scanner com `sc.close()`** ao final do uso.
* Quando alternar entre `nextLine()` e `nextInt()`, pode ser necessário **consumir a quebra de linha** com `sc.nextLine()` extra.

Exemplo de erro comum:

```java
int idade = sc.nextInt();
String nome = sc.nextLine(); // Pode ler uma linha vazia!
```

Solução:

```java
int idade = sc.nextInt();
sc.nextLine(); // consome o "Enter"
String nome = sc.nextLine();
```

