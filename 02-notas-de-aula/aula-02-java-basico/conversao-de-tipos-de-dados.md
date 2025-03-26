# Conversão de Tipos de Dados

**Coerção** ou **conversão de tipos** é o processo de transformação de um valor de um tipo primitivo para outro. Ela pode ocorrer de duas maneiras:

1. **Coerção Implícita (Widening Conversion)**
2. **Coerção Explícita (Narrowing Conversion)**

Vamos usar uma analogia para entender os dois tipos de coerção:

* Imagine que **os dados são sapatos** e **os tipos são caixas**.
* Uma **coerção é o ato de colocar um sapato dentro de uma caixa**.

## :orange\_book: Coerção Implícita

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

## :orange\_book: Coerção Explícita (Casting)

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

## :orange\_book: Hierarquia de Promoção de Tipos Numéricos

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

## :orange\_book: Cuidados com Coerção Explícita

* **Truncamento de ponto flutuante**: perda da parte decimal.
* **Overflow**: valores além do intervalo do tipo-alvo causam erros silenciosos.

```java
int grande = 130;
byte pequeno = (byte) grande; // Valor fora do intervalo de byte
System.out.println(pequeno); // Saída: -126 (comportamento inesperado)
```
