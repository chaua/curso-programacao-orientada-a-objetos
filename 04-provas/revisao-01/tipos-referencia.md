# Tipos referência

## Questão 1

Considere o seguinte trecho de código Java:

```java
public class Produto {
    String nome;
    double preco;
}

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        p1.nome = "Café";
        p2.nome = "Café";

        System.out.println(p1 == p2);
        System.out.println(p1.nome == p2.nome);
    }
}
```

Qual será a saída?

a. `true` e `true`\
b. `true` e `false`\
c. `false` e `false`\
d. `false` e `true`\
e. `true` e erro de compilação

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. `false` e `true`**

**Justificativa:** `p1 == p2` compara **referências** e retorna `false` porque `p1` e `p2` apontam para objetos diferentes. Já `p1.nome == p2.nome` compara **referências de `String`**, que neste caso são **iguais**, pois `"Café"` é uma **string literal** e o Java reaproveita a mesma instância na pool de strings. Isso ocorre devido à **internação de literais de string** em Java.

</details>

## Questão 2

Analise o código:

```java
public class Caixa {
    int valor;
}

public class Programa {
    public static void altera(Caixa c) {
        c.valor = 99;
    }

    public static void main(String[] args) {
        Caixa cx = new Caixa();
        cx.valor = 10;
        altera(cx);
        System.out.println(cx.valor);
    }
}
```

O que será impresso?

a. 10\
b. 0\
c. 99\
d. Erro de compilação\
e. Valor indefinido

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. 99**

**Justificativa:** `Caixa` é um tipo por referência. A função `altera()` modifica o conteúdo do objeto passado como argumento. Como `cx` e `c` referenciam o **mesmo objeto** na memória, a modificação `c.valor = 99` afeta diretamente o objeto referenciado por `cx`.

</details>

## Questão 3

Considere:

```java
public class Objeto {
    int x;
}

public class Teste {
    public static void modificar(Objeto o) {
        o = new Objeto();
        o.x = 50;
    }

    public static void main(String[] args) {
        Objeto obj = new Objeto();
        obj.x = 10;
        modificar(obj);
        System.out.println(obj.x);
    }
}
```

Qual será o valor impresso?

a. 10\
b. 50\
c. 0\
d. Erro de compilação\
e. Valor indefinido

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **Resposta: a. 10**

**Justificativa:** Embora `Objeto` seja um tipo por referência, dentro do método `modificar()`, a variável `o` é uma **cópia da referência**. Quando ela recebe `new Objeto()`, essa cópia aponta para um novo objeto, **sem alterar a referência original** de `obj` em `main()`. Assim, `obj.x` permanece com valor 10.

</details>

## Questão 4

Dado o código:

```java
public class Aluno {
    String nome;
    int idade;
}

public class Main {
    public static void copiar(Aluno a1, Aluno a2) {
        a2 = a1;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.idade = 20;

        Aluno b = new Aluno();
        b.nome = "João";
        b.idade = 30;

        copiar(a, b);
        System.out.println(b.nome);
    }
}
```

O que será exibido?

a. "Ana"\
b. "João"\
c. null\
d. Erro de compilação\
e. Valor indefinido

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. "João"**

**Justificativa:**\
O método `copiar(a1, a2)` atribui a `a2 = a1`, mas **essa atribuição é local** ao escopo do método. Não há efeito sobre a variável `b` em `main()`, que continua referenciando o objeto original. Assim, `b.nome` ainda é `"João"`.

</details>

## Questão 5

Sobre os tipos por referência em Java, considere as afirmações:

I. Quando uma variável de tipo por referência é atribuída a outra, ambas passam a apontar para o mesmo objeto.\
II. Métodos que recebem objetos como parâmetros podem alterar o estado interno desses objetos.\
III. É possível trocar objetos entre duas variáveis dentro de um método passando-as como parâmetros.\
IV. Objetos sempre são copiados por valor, mesmo sendo tipos por referência.

Assinale a alternativa correta:

a. Apenas I e II estão corretas\
b. Apenas I, II e III estão corretas\
c. Apenas II e IV estão corretas\
d. Apenas I e IV estão corretas\
e. Todas estão corretas

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **a. Apenas I e II estão corretas**

**Justificativa:**\
I: Correta — atribuir uma referência a outra faz com que ambas apontem para o mesmo objeto.\
II: Correta — métodos podem alterar os atributos do objeto passado.\
III: Incorreta — **a troca de referências** dentro de um método **não afeta o escopo externo**, pois as referências são passadas **por valor**.\
IV: Incorreta — a **referência é passada por valor**, mas o **objeto não é copiado**.

</details>

## Questão 6

Considere o seguinte trecho de código:

```java
public class Livro {
    String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }
}
```

E o código de teste:

```java
Livro a = new Livro("Java");
Livro b = a;
b.titulo = "Python";
System.out.println(a.titulo);
```

Qual será a saída?

a. `Java`\
b. `Python`\
c. `null`\
d. Erro de compilação\
e. Depende da JVM

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**b. `Python`**

**Justificativa:** Em Java, objetos são manipulados por **referência**. As variáveis `a` e `b` **apontam para o mesmo objeto** na memória. Assim, qualquer alteração em `b.titulo` reflete diretamente em `a.titulo`.

</details>

## Questão 7

Considere o seguinte código:

```java
public class Caixa {
    int valor;
}

public class Teste {
    public static void alterar(Caixa c) {
        c.valor += 10;
        c = new Caixa();  // linha crítica
        c.valor = 100;
    }

    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        caixa.valor = 5;
        alterar(caixa);
        System.out.println(caixa.valor);
    }
}
```

Qual será a saída?

a. `5`\
b. `15`\
c. `100`\
d. `10`\
e. Erro de compilação

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. `15`**

**Justificativa:** Embora `c = new Caixa();` crie um novo objeto, **essa nova referência não afeta a variável original `caixa`** do `main`, pois o parâmetro foi passado por **valor da referência**. O incremento `c.valor += 10` é aplicado ao objeto original antes da reatribuição local de `c`.

</details>

## Questão 8

Assinale a alternativa que descreve corretamente uma **implicação técnica** de se trabalhar com tipos por referência em Java:

a. O operador `==` compara sempre o conteúdo de objetos, não suas referências\
b. A atribuição de uma referência a outra cria uma cópia profunda (deep copy)\
c. Ao passar um objeto para um método, uma cópia independente do objeto é criada\
d. Modificações em atributos via uma referência afetam o mesmo objeto referenciado por outras variáveis\
e. Objetos são sempre passados por referência real, permitindo substituição da variável original

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. Modificações em atributos via uma referência afetam o mesmo objeto referenciado por outras variáveis**

**Justificativa:** Quando múltiplas variáveis apontam para o mesmo objeto, qualquer alteração no conteúdo **reflete para todas as variáveis que compartilham aquela referência**.&#x20;

As alternativas a, b, c e e contêm erros conceituais comuns sobre igualdade, cópia e passagem de parâmetros.

</details>

## Questão 9

Dado o código:

```java
public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public boolean mesmoObjeto(Pessoa outra) {
        return this == outra;
    }
}
```

Assinale a alternativa correta sobre a comparação feita no método `mesmoObjeto`:

a. O método verifica se os objetos têm os mesmos atributos\
b. O método compara os valores dos atributos `nome` de ambas as instâncias\
c. O método verifica se os dois objetos apontam para o mesmo endereço de memória\
d. O método retorna `true` apenas se os nomes forem iguais\
e. O método lança exceção se `outra` for `null`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. O método verifica se os dois objetos apontam para o mesmo endereço de memória**

**Justificativa:**\
O operador `==` em Java, quando aplicado a objetos, compara **identidade**, ou seja, verifica se ambas as variáveis referenciam exatamente **o mesmo objeto na memória**.

</details>

## Questão 10

Sobre o comportamento de tipos por referência, considere o seguinte código:

```java
public class Container {
    int[] dados;

    public Container() {
        dados = new int[]{1, 2, 3};
    }

    public void modificar() {
        dados[0] = 99;
    }

    public int[] getDados() {
        return dados;
    }
}

public class Teste {
    public static void main(String[] args) {
        Container c = new Container();
        int[] copia = c.getDados();
        c.modificar();
        System.out.println(copia[0]);
    }
}
```

Qual será a saída?

a. `1`\
b. `2`\
c. `3`\
d. `99`\
e. Erro de tempo de execução

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. `99`**

**Justificativa:** Arrays em Java também são **objetos**, e a atribuição `copia = c.getDados();` copia a **referência**, não o conteúdo. Assim, qualquer modificação feita no array interno (`dados[0] = 99`) afeta o array `copia`, pois ambos apontam para o **mesmo array na memória**.

</details>

## Questão 11

Considere o seguinte trecho de código Java:

```java
public class Exemplo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b += 5;
        System.out.println(a);
    }
}
```

O valor impresso será:

a. 10\
b. 15\
c. 0\
d. Erro de compilação\
e. Valor indefinido, pois `a` foi modificado indiretamente

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>



</details>

## Questão 12

Sobre o gerenciamento de memória em Java, considere as afirmativas:

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>



</details>

I. Objetos instanciados com `new` são armazenados na memória heap.\
II. Variáveis locais e referências são armazenadas na stack.\
III. A memória heap é liberada automaticamente pelo coletor de lixo.\
IV. Tipos primitivos são sempre armazenados na heap.

Assinale a alternativa correta:

a. Apenas I e II\
b. Apenas I, II e III\
c. Apenas II, III e IV\
d. Apenas I e IV\
e. Todas as afirmativas estão corretas

## Questão 13

Considere:

```java
public class Caixa {
    int valor;
}

public class Teste {
    public static void main(String[] args) {
        Caixa c1 = new Caixa();
        Caixa c2 = c1;
        c2.valor = 50;
        System.out.println(c1.valor);
    }
}
```

O valor impresso será:

a. 0\
b. 50\
c. null\
d. Erro de tempo de execução\
e. Valor indefinido, pois `c1` foi sobrescrito

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>



</details>

## Questão 14

Sobre variáveis e gerenciamento de memória, assinale a alternativa correta:

a. A stack é usada para armazenar todos os objetos instanciados com `new`\
b. Objetos em Java são automaticamente desalocados ao sair do escopo do método\
c. O coletor de lixo (garbage collector) remove objetos da stack após cada chamada de método\
d. Referências locais a objetos são armazenadas na stack, mas os objetos em si ficam na heap\
e. O coletor de lixo atua na stack para liberar variáveis primitivas

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>



</details>

