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

## Questão 3

Qual das opções define corretamente um **construtor** em Java?

a. Um método com o mesmo nome da classe, sem tipo de retorno\
b. Um método qualquer com o tipo de retorno `void`\
c. Um atributo privado acessado com `get` e `set`\
d. Um método chamado `main()`\
e. Um método que só pode ser `private`

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

## Questão 6

Em Java, qual das alternativas representa corretamente o uso de **métodos com parâmetros**?

a. `public void exibir() nome {}`\
b. `void exibir(String nome) {}`\
c. `public exibir(nome: String): void {}`\
d. `function exibir(nome)`\
e. `method exibir(String nome)`

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

## Questão 8

Qual das alternativas **melhor expressa o conceito de destrutor** em Java?

a. Java obriga o uso explícito de destrutores\
b. Destrutores são métodos que removem métodos\
c. Java não possui destrutores; utiliza o coletor de lixo (`garbage collector`)\
d. Todo objeto deve ter um destrutor manual\
e. Um destrutor é declarado com `~Classe()`

## Questão 9

Assinale a alternativa que contém uma **boa prática** de encapsulamento em Java:

a. Declarar todos os atributos como públicos\
b. Acessar atributos diretamente fora da classe\
c. Utilizar `public` nos métodos e `private` nos atributos\
d. Fazer todos os métodos `private` para evitar herança\
e. Criar atributos com `default` e métodos com `protected`

## Questão 10

Qual alternativa representa corretamente um **objeto** da classe `Livro` sendo criado e inicializado?

a. `Livro = new Livro("Java", 2020);`\
b. `Livro livro = Livro("Java", 2020);`\
c. `Livro livro = new Livro("Java", 2020);`\
d. `livro -> new Livro("Java", 2020);`\
e. `Livro livro("Java", 2020);`

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
