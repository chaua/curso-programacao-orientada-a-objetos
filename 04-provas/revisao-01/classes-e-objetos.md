# Classes e Objetos

## Questão 1

Considere o seguinte trecho de código Java:

```java
public class Carro {
    String modelo;
    int ano;
}
```

Sobre o código acima, é correto afirmar que:

a. O código define dois objetos dentro da classe\
b. `modelo` e `ano` são métodos da classe\
c. `Carro` é um objeto e `modelo` é seu construtor\
d. `modelo` e `ano` são atributos da classe\
e. A classe está completa pois já inclui herança

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**d. `modelo` e `ano` são atributos da classe**

**Justificativa:** Os elementos declarados dentro da classe, fora de métodos, são atributos (variáveis de instância). As demais alternativas interpretam incorretamente os conceitos.

</details>

## Questão 2

Considere a seguinte classe Java:

```java
public class Pessoa {
    String nome;

    public void dizerOla() {
        System.out.println("Olá, meu nome é " + nome);
    }
}
```

Para instanciar um objeto dessa classe e chamar o método `dizerOla`, a sintaxe correta seria:

a. `Pessoa.dizerOla();`\
b. `Pessoa p = new Pessoa(); p->dizerOla();`\
c. `Pessoa p = new Pessoa(); p.dizerOla();`\
d. `Pessoa p(); p.dizerOla();`\
e. `new Pessoa().dizerOla;`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**c. `Pessoa p = new Pessoa(); p.dizerOla();`**

**Justificativa:** Em Java, cria-se um objeto com `new` e acessa-se métodos com ponto (`.`). As outras sintaxes pertencem a outras linguagens ou estão incorretas.

</details>

## Questão 3

Qual das opções define corretamente um **construtor** em Java?

a. Um método com o mesmo nome da classe, sem tipo de retorno\
b. Um método qualquer com o tipo de retorno `void`\
c. Um atributo privado acessado com `get` e `set`\
d. Um método chamado `main()`\
e. Um método que só pode ser `private`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **a. Um método com o mesmo nome da classe, sem tipo de retorno**

**Justificativa:** O construtor deve ter o mesmo nome da classe e não deve declarar tipo de retorno, nem mesmo `void`.

</details>

## Questão 4

Observe o seguinte código:

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
```

O que ocorre se o construtor acima **não for declarado**?

a. O compilador gera erro obrigatoriamente\
b. O Java usa um construtor padrão sem parâmetros\
c. O Java substitui com um método `main()` automático\
d. O objeto será criado com valores aleatórios\
e. Não é possível instanciar a classe sem construtor

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. O Java usa um construtor padrão sem parâmetros**

**Justificativa:** Se **nenhum** construtor for definido, o Java fornece automaticamente um construtor padrão sem argumentos. No entanto, se **algum** construtor é declarado, o padrão não será mais gerado automaticamente.

</details>

## Questão 5

Dado o código abaixo:

```java
public class Aluno {
    public Aluno() {
        System.out.println("Construtor chamado");
    }
}
```

O que será exibido ao executar `new Aluno();`?

a. Nenhuma saída\
b. Um erro de compilação\
c. A mensagem “Construtor chamado”\
d. A criação do objeto falha por falta de argumentos\
e. Apenas o nome da classe

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. A mensagem “Construtor chamado”**

**Justificativa:** O construtor é chamado automaticamente durante a criação do objeto e imprime a mensagem especificada.

</details>

## Questão 6

Em Java, qual das alternativas representa corretamente o uso de **métodos com parâmetros**?

a. `public void exibir() nome {}`\
b. `void exibir(String nome) {}`\
c. `public exibir(nome: String): void {}`\
d. `function exibir(nome)`\
e. `method exibir(String nome)`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. `void exibir(String nome) {}`**

**Justificativa:** A sintaxe correta em Java para um método com parâmetro inclui o tipo de retorno, nome do método e tipo do parâmetro entre parênteses.

</details>

## Questão 7

Dado o código:

```java
public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
```

Qual é o propósito do método `getSaldo()`?

a. Atualizar o saldo da conta\
b. Criar um novo objeto\
c. Retornar o valor atual do atributo `saldo`\
d. Remover o atributo `saldo`\
e. Aplicar juros ao saldo

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Retornar o valor atual do atributo `saldo`**

**Justificativa:** Métodos `get` são usados para **acesso de leitura** a atributos privados. Ele permite encapsulamento e controle de acesso.

</details>

## Questão 8

Qual das alternativas **melhor expressa o conceito de destrutor** em Java?

a. Java obriga o uso explícito de destrutores\
b. Destrutores são métodos que removem métodos\
c. Java não possui destrutores; utiliza o coletor de lixo (`garbage collector`)\
d. Todo objeto deve ter um destrutor manual\
e. Um destrutor é declarado com `~Classe()`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Java não possui destrutores; utiliza o coletor de lixo (`garbage collector`)**

**Justificativa:** Em Java, o gerenciamento de memória é automático. O método `finalize()` pode ser sobrescrito, mas seu uso é obsoleto nas versões mais recentes.

</details>

## Questão 9

Assinale a alternativa que contém uma **boa prática** de encapsulamento em Java:

a. Declarar todos os atributos como públicos\
b. Acessar atributos diretamente fora da classe\
c. Utilizar `public` nos métodos e `private` nos atributos\
d. Fazer todos os métodos `private` para evitar herança\
e. Criar atributos com `default` e métodos com `protected`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Utilizar `public` nos métodos e `private` nos atributos**

**Justificativa:** Esta prática permite **ocultar os dados** e **expor somente as operações necessárias**, promovendo o encapsulamento e a segurança.

</details>

## Questão 10

Qual alternativa representa corretamente um **objeto** da classe `Livro` sendo criado e inicializado?

a. `Livro = new Livro("Java", 2020);`\
b. `Livro livro = Livro("Java", 2020);`\
c. `Livro livro = new Livro("Java", 2020);`\
d. `livro -> new Livro("Java", 2020);`\
e. `Livro livro("Java", 2020);`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. `Livro livro = new Livro("Java", 2020);`**

**Justificativa:** A criação de objetos em Java usa `new`, seguido do construtor. É necessário especificar o tipo (`Livro`) e a variável (`livro`) corretamente.

***

</details>

## Questão 11

Considere o seguinte trecho de código Java:

```java
public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
```

Dado o código acima, qual das alternativas representa um **princípio de boa prática de encapsulamento e coesão que ainda pode ser melhorado**?

a. Os atributos estão públicos, e isso viola o encapsulamento\
b. O método `depositar` deveria ser privado, pois apenas o objeto pode usá-lo\
c. Falta a validação para saques com valor igual ao saldo\
d. Os métodos `sacar` e `depositar` deveriam lançar exceções para valores inválidos\
e. O construtor deveria chamar `getSaldo()` para inicializar o saldo

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. Os métodos `sacar` e `depositar` deveriam lançar exceções para valores inválidos**

**Justificativa:** Embora o código verifique os valores, ele simplesmente ignora operações inválidas sem feedback.&#x20;

As alternativas a e b estão incorretas (os atributos estão corretamente encapsulados e `depositar()` deve ser público). \
A alternativa c está incorreta, pois a validação `valor <= saldo` cobre o caso. \
A alternativa e não tem propósito funcional.

</details>

## Questão 12

Analise o seguinte código:

```java
public class Item {
    private static int contador = 0;
    private int id;

    public Item() {
        id = ++contador;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }
}
```

Considerando a execução:

```java
Item a = new Item();
Item b = new Item();
Item c = new Item();
System.out.println(b.getId());
System.out.println(Item.getContador());
```

Qual será a saída?

a. 1 e 3\
b. 2 e 3\
c. 3 e 2\
d. 3 e 3\
e. 2 e 2

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. 2 e 3**

**Justificativa:** O atributo `contador` é `static`, ou seja, **compartilhado entre todas as instâncias**. A cada novo objeto, ele é incrementado.

</details>

## Questão 13

Sobre **sobrecarga de construtores**, considere:

```java
public class Livro {
    private String titulo;
    private int ano;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.ano = 0;
    }

    public Livro(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
}
```

Qual afirmativa está correta?

a. O Java impede múltiplos construtores na mesma classe\
b. O construtor com dois parâmetros substitui o de um parâmetro\
c. Os dois construtores são válidos e sobrecarregados\
d. A classe não compila por ambiguidade entre os métodos\
e. Apenas o segundo construtor será executado em tempo de execução

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Os dois construtores são válidos e sobrecarregados**

**Justificativa:** A **sobrecarga** é válida quando os métodos (incluindo construtores) possuem **assinaturas diferentes** (número e/ou tipos de parâmetros). Não há conflito sintático ou semântico entre eles.

</details>

## Questão 14

Analise o seguinte código:

```java
public class Exemplo {
    private int valor;

    public void setValor(int valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public int getValor() {
        return valor;
    }
}
```

Considere que um objeto é criado e recebe os seguintes comandos:

```java
Exemplo ex = new Exemplo();
ex.setValor(-10);
System.out.println(ex.getValor());
```

Qual será a saída?

a. -10\
b. 0\
c. Valor indefinido\
d. Erro de compilação\
e. Exceção de tempo de execução

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. 0**

**Justificativa:** O valor inicial de um `int` em Java é 0. Como `setValor(-10)` não satisfaz a condição `valor > 0`, a atribuição **não ocorre**, mantendo o valor padrão `0`.\
Não há erro nem exceção.

</details>

## Questão 15

Considere o seguinte código:

```java
public class Computador {
    private String marca;
    private int memoria;

    public Computador() {
        this("Genérica", 4);
    }

    public Computador(String marca) {
        this(marca, 8);
    }

    public Computador(String marca, int memoria) {
        this.marca = marca;
        this.memoria = memoria;
    }

    public void exibir() {
        System.out.println(marca + " - " + memoria + "GB");
    }
}
```

Ao executar:

```java
Computador c1 = new Computador();
Computador c2 = new Computador("Dell");
c1.exibir();
c2.exibir();
```

Qual será a saída?

a. Genérica - 4GB\
Dell - 8GB\
b. Genérica - 8GB\
Dell - 4GB\
c. Genérica - 4GB\
Genérica - 4GB\
d. Dell - 4GB\
Dell - 8GB\
e. Erro de compilação por chamada encadeada de construtores

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **a. Genérica - 4GB**\
>   **Dell - 8GB**

**Justificativa:** O construtor `Computador()` chama o construtor `Computador(String, int)` com os parâmetros `"Genérica", 4`. O construtor `Computador(String)` chama o mesmo com `"Dell", 8`. A sobrecarga é válida e o encadeamento com `this()` é permitido e corretamente resolvido em tempo de compilação.

</details>

## Questão 16

Sobre o comportamento de destrutores em Java, considere as afirmações:

I. Em Java, os destrutores são invocados automaticamente após o método `main()` terminar.\
II. O método `finalize()` era utilizado como destrutor, mas foi depreciado nas versões mais recentes do Java.\
III. O coletor de lixo (garbage collector) pode ser chamado diretamente usando `System.gc()`, mas sua execução não é garantida.\
IV. Java exige que cada classe implemente seu próprio destrutor.

Assinale a alternativa correta:

a. Apenas I e III estão corretas\
b. Apenas II e III estão corretas\
c. Apenas II e IV estão corretas\
d. Apenas I, II e III estão corretas\
e. Todas estão corretas

<details>

<summary></summary>

> **b. Apenas II e III estão corretas**

**Justificativa:**

* I está incorreta: o coletor de lixo é assíncrono e não age obrigatoriamente ao fim do `main()`.
* II é correta: `finalize()` existia como método pseudo-destrutor, mas foi **deprecated** a partir do Java 9.
* III é correta: `System.gc()` **solicita** coleta, mas o comportamento é não determinístico.
* IV é incorreta: Java **não exige** destrutores, pois a gestão de memória é automática.

</details>

## Questão 17

Considere o seguinte código:

```java
public class Teste {
    private int x;

    public Teste() {
        this(x); // Linha problemática
    }

    public Teste(int x) {
        this.x = x;
    }
}
```

O que acontece ao tentar compilar o código?

a. Compila normalmente e o objeto é criado com valor padrão\
b. Compila, mas lança exceção de tempo de execução\
c. Gera erro de compilação por uso de variável não inicializada\
d. Gera erro de compilação por sobrecarga de construtores inválida\
e. Gera warning, mas é permitido pela JVM

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Gera erro de compilação por uso de variável não inicializada**

**Justificativa:**\
Na linha `this(x);`, a variável `x` da instância ainda **não foi inicializada**, e está sendo usada como argumento. Isso **viola as regras de inicialização de variáveis locais** em Java, resultando em erro de compilação. Variáveis de instância são inicializadas implicitamente, mas variáveis locais (como nesse caso, o `x` do construtor) **não**.

</details>

## Questão 18

Considere o seguinte código:

```java
public class Circulo {
    private double raio;
    public static final double PI = 3.14159;

    public Circulo(double r) {
        if (r <= 0) {
            this.raio = 1.0;
        } else {
            this.raio = r;
        }
    }

    public double calcularArea() {
        return PI * raio * raio;
    }
}
```

Qual alternativa descreve **corretamente** os efeitos do uso do atributo `PI` como `static final`?

a. O valor de `PI` pode ser modificado em tempo de execução se necessário\
b. Cada instância da classe `Circulo` cria sua própria cópia do valor de `PI`\
c. `PI` pertence à instância e só pode ser acessado com `this.PI`\
d. `PI` é constante e compartilhado entre todas as instâncias da classe\
e. `PI` só pode ser acessado dentro do método `calcularArea`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. `PI` é constante e compartilhado entre todas as instâncias da classe**

**Justificativa:**\
`static` indica que o membro pertence à classe e **não à instância**. O modificador `final` torna o valor **imutável após inicialização**. Assim, `PI` é constante, única, e comum a todas as instâncias da classe `Circulo`. As demais alternativas contradizem o comportamento de `static final`.

</details>

## Questão 19

Considere a classe a seguir:

```java
public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0)
            saldo += valor;
    }

    public String resumo() {
        return "Titular: " + titular + ", Saldo: R$ " + saldo;
    }
}
```

Assinale a alternativa que **representa corretamente o nível de encapsulamento e coesão** da classe apresentada:

a. Atributos públicos favorecem o acesso direto e simplificam a manutenção\
b. O método `resumo()` viola encapsulamento por acessar atributos diretamente\
c. A classe possui alta coesão, pois seus métodos manipulam apenas atributos da própria instância\
d. O método `depositar()` deveria ser `static`, pois não depende da instância\
e. A falta de `final` nos atributos compromete a integridade do objeto

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. A classe possui alta coesão, pois seus métodos manipulam apenas atributos da própria instância**

**Justificativa:**\
**Alta coesão** implica que os métodos de uma classe estão fortemente relacionados aos dados da classe. Os métodos `depositar` e `resumo` lidam exclusivamente com os atributos `titular` e `saldo`, o que caracteriza coesão adequada.&#x20;

As alternativas a e b são incorretas (os atributos são privados e acessados corretamente). \
A alternativa d ignora que `depositar` depende do saldo da **instância**. \
A alternativa e trata do uso de `final`, que não é obrigatório nesse contexto.

</details>

## Questão 20

Analise o seguinte código:

```java
public class Sensor {
    private final int id;
    private double leitura;
    public static final String UNIDADE = "Celsius";

    public Sensor(int id) {
        this.id = id;
    }

    public void atualizarLeitura(double novaLeitura) {
        if (novaLeitura >= -273.15) {
            leitura = novaLeitura;
        }
    }

    public String status() {
        return "Sensor #" + id + ": " + leitura + " " + UNIDADE;
    }
}
```

Qual das alternativas está correta quanto ao comportamento do atributo `id` e da constante `UNIDADE`?

a. `id` pode ser modificado livremente dentro de qualquer método da classe\
b. `UNIDADE` precisa ser inicializado no construtor por ser `final`\
c. `UNIDADE` pode ser alterado em tempo de execução se não for `static`\
d. `id` é um atributo de instância imutável, e `UNIDADE` é uma constante de classe\
e. `UNIDADE` deveria ser removido para evitar dependência de valor fixo

<details>

<summary></summary>

> **d. `id` é um atributo de instância imutável, e `UNIDADE` é uma constante de classe**

**Justificativa:**\
O atributo `id` é `final`, o que significa que **deve ser inicializado exatamente uma vez**, geralmente no construtor, e **não pode ser alterado** posteriormente. Já `UNIDADE` é uma constante, pois é `static final`, e seu valor é compartilhado entre todas as instâncias.&#x20;

As alternativas a, b, c e e violam os princípios de imutabilidade e boas práticas de definição de constantes.

</details>
