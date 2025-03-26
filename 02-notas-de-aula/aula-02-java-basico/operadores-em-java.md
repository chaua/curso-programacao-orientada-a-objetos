# Operadores em Java

Os **operadores** são símbolos especiais que indicam à linguagem que uma operação deve ser realizada. Eles atuam sobre variáveis e valores, e estão divididos em várias categorias.

## :orange\_book: Operadores Aritméticos

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

## :orange\_book: Operadores Relacionais

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

## :orange\_book: Operadores Lógicos

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

## :orange\_book: Coerção em Expressões com Operadores

Quando utilizamos operadores entre variáveis de tipos diferentes, o compilador promove implicitamente os tipos **menores** para o tipo **maior**. Isso garante a preservação da informação e a precisão da operação.

Exemplo de Coerção Implícita com Operadores:

```java
int x = 10;
double y = 4.5;
double resultado = x * y; // x é promovido para double
System.out.println(resultado); // Saída: 45.0
```

Coerção Explícita pode ser necessária para forçar a operação com perda de precisão:

```java
double a = 7.9;
int b = (int) a * 2; // casting explícito para int (antes da multiplicação)
System.out.println(b); // Saída: 14 (7 * 2)
```
