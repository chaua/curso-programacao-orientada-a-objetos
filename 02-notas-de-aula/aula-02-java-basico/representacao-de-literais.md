# Representação de Literais

Literais são os valores diretamente atribuídos às variáveis. Eles podem ser expressos de diferentes formas, de acordo com o tipo e a base numérica.

## :orange\_book: Literais Numéricos

| Tipo                  | Exemplo             | Descrição       |
| --------------------- | ------------------- | --------------- |
| Decimal (base 10)     | `int x = 42;`       | Padrão          |
| Octal (base 8)        | `int x = 052;`      | Inicia com `0`  |
| Hexadecimal (base 16) | `int x = 0x2A;`     | Inicia com `0x` |
| Binário (base 2)      | `int x = 0b101010;` | Inicia com `0b` |

## :orange\_book: **Literais de Ponto Flutuante**

* Ponto fixo: `double pi = 3.14;`
* Ponto flutuante com notação científica: `double grande = 5.12e3; // 5120.0`
* Literal `float`: deve conter `f` ou `F` ao final → `float x = 3.14f;`

## :orange\_book: **Literais Booleanos e Caracteres**

* Booleanos: `true`, `false`
* Caracteres: `'A'`, `'\n'`, `'\u0041'` (Unicode para 'A')
