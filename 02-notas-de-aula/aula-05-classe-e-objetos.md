# 🤖 Aula 05 - Classe e Objetos

## TAD – Tipo Abstrato de Dados

**TAD** significa **Tipo Abstrato de Dados**. Trata-se de um **modelo teórico** que define um **conjunto de dados** e as **operações válidas** que podem ser realizadas sobre esses dados, **sem revelar como essas operações são implementadas** internamente.

Ou seja, quando falamos de TAD, estamos preocupados apenas com:

* **O que** pode ser feito com os dados;
* **Quais operações** estão disponíveis;
* E **quais regras** essas operações devem obedecer.

{% hint style="info" %}
Importante: **não nos importamos ainda com a linguagem de programação ou detalhes de implementação**.
{% endhint %}

### Componentes de um TAD

Um TAD é composto basicamente por dois elementos:

* **Modelo matemático (estrutura de dados)**: define como os dados são organizados logicamente. Pode ser um vetor, uma matriz, um ponto no plano cartesiano, uma pilha, uma fila, entre outros.
* **Conjunto de operações válidas (funções)**: determina as ações que podem ser realizadas com os dados, como inserir, remover, somar, buscar, calcular distância, etc.

### Exemplo: TAD `Ponto` (em C)

Vamos analisar um TAD definido no arquivo `exemplo.h`:

```c
typedef struct {
    double x;
    double y;
} Ponto;
```

Essa estrutura representa um **modelo matemático** de um ponto no plano cartesiano 2D, com duas coordenadas: `x` e `y`.

Agora vejamos as **operações associadas** a esse TAD:

```c
Ponto pontoSoma(Ponto p1, Ponto p2);
Ponto pontoSubt(Ponto p1, Ponto p2);
float pontoCalculaDistancia(Ponto p1, Ponto p2);
```

Cada função define uma **ação que pode ser feita com um Ponto**:

* `pontoSoma`: soma as coordenadas de dois pontos.
* `pontoSubt`: subtrai dois pontos.
* `pontoCalculaDistancia`: calcula a distância entre dois pontos no plano cartesiano.

Essas operações, quando bem definidas, permitem que o **usuário utilize o TAD sem saber como essas funções são implementadas por dentro** — esse é o princípio da **abstração**.

#### Objetivos principais do TAD

* **Modularização**: divide o programa em partes lógicas e independentes.
* **Reutilização**: podemos usar o TAD em diferentes programas.
* **Manutenção**: alterações internas não afetam o código do usuário, desde que a interface (operações disponíveis) permaneça a mesma.
* **Encapsulamento**: os dados ficam protegidos e só são manipulados por meio das operações definidas.

Perfeito! Vamos agora aprofundar a **Parte 2: Conceito de Classe**, com uma explicação **bem detalhada**, técnica e didática, adequada ao contexto acadêmico de cursos como **Ciência da Computação** e **Análise e Desenvolvimento de Sistemas**.

## Conceito de Classe

Na **Programação Orientada a Objetos (POO)**, uma **classe** é uma **estrutura que define um novo tipo de dado**, baseada na abstração de um **Tipo Abstrato de Dados (TAD)**. Ela combina, em uma única unidade:

* **Atributos**: que representam o **estado** (ou propriedades) dos objetos.
* **Métodos**: que representam o **comportamento** (ou operações) dos objetos.

> Em termos técnicos: uma classe é uma **fábrica** ou **molde** a partir da qual objetos são criados.

### Estrutura de uma Classe

Vamos analisar a estrutura da classe `Pessoa`, presente no arquivo `Pessoa.java`:

```java
public class Pessoa {

    // Atributos
    String nome;
    int idade;
    String genero;
    int altura;
    float peso;
    String cpf;

    // Construtor
    Pessoa(String nome, int idade, String genero, int altura, float peso, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    // Métodos
    void andar() {
        System.out.println("Andando...");
    }
}
```

### Atributos (ou Campos)

Os **atributos** são variáveis que pertencem à classe. Eles representam as **características** de cada objeto que será criado.

No caso da classe `Pessoa`, os atributos são:

```java
String nome;
int idade;
String genero;
int altura;
float peso;
String cpf;
```

Cada objeto da classe `Pessoa` terá **sua própria cópia desses atributos**, ou seja, seu próprio estado.

### Construtor

O **construtor** é um método especial da classe, utilizado para **criar** e **inicializar** os objetos. Ele sempre tem o **mesmo nome da classe** e **não possui tipo de retorno**.

Exemplo:

```java
Pessoa(String nome, int idade, String genero, int altura, float peso, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.genero = genero;
    this.altura = altura;
    this.peso = peso;
    this.cpf = cpf;
}
```

Neste exemplo:

* Quando um objeto `Pessoa` é criado com `new Pessoa(...)`, o construtor é executado.
* A palavra-chave `this` diferencia os atributos da classe dos parâmetros do método.

Também podemos ter **sobrecarga de construtores**:

```java
Pessoa(String nome) {
    this.nome = nome;
    this.idade = 0;
    this.genero = "Não informado";
    this.altura = 0;
    this.peso = 0;
    this.cpf = "Não informado";
}
```

### Métodos

Os **métodos** são funções que definem os **comportamentos** dos objetos. Eles podem:

* Executar ações (como `andar()`, `comer()`).
* Modificar atributos.
* Retornar informações sobre o estado interno.

Exemplos extraídos da classe `Pessoa`:

```java
void andar() {
    System.out.println("Andando...");
}

void mudarDeNome(String nome) {
    this.nome = nome;
}

float calcularIMC() {
    return peso / (altura * altura);
}
```

**Observações:**

* Os métodos podem ser `void` (sem retorno) ou retornar valores (`float`, `String`, etc.).
* Um método pode receber **parâmetros** para realizar operações com dados externos.
* Métodos podem **acessar livremente os atributos** da classe.

## Conceito de Objeto



Na **Programação Orientada a Objetos (POO)**, um **objeto** é a **instância concreta de uma classe**.

Podemos entender um objeto como uma **entidade individual** que possui:

* **Identidade**
* **Estado**
* **Comportamento**

A classe define o **molde** (ou plano de construção), e o objeto é a **concretização desse molde na memória** do computador.

### Características Fundamentais de um Objeto

#### **Identidade**

Todo objeto tem uma **identidade única**, ou seja, é distinguível dos demais, mesmo que possua os mesmos valores nos atributos.

Exemplo:

```java
Pessoa a = new Pessoa("João");
Pessoa b = new Pessoa("João");
```

Embora `a` e `b` tenham os mesmos valores, são **dois objetos diferentes na memória**. A identidade é garantida pelo endereço de memória da instância.

#### **Estado**

O **estado** de um objeto é representado pelos **valores atuais de seus atributos**.

Exemplo:

```java
Pessoa maria = new Pessoa("Maria", 30, "Feminino", 160, 60f, "000.000.000-00");
```

O estado de `maria` pode ser descrito por:

* `nome = "Maria"`
* `idade = 30`
* `genero = "Feminino"`
* `altura = 160`
* `peso = 60`
* `cpf = "000.000.000-00"`

Esse estado **pode ser modificado** ao longo do tempo pelos métodos da classe:

```java
maria.mudarDeNome("Maria Silva");
```

#### **Comportamento**

O **comportamento** de um objeto é definido pelos **métodos da classe** à qual ele pertence.

Os métodos determinam o que o objeto **pode fazer**, como:

```java
maria.andar();
maria.comer();
maria.dormir();
```

Além disso, métodos podem modificar o próprio estado do objeto ou interagir com outros objetos:

```java
maria.conversar(outroObjetoPessoa);
```

### Criação de objetos

Em Java, usamos o operador `new` para **instanciar** uma classe e criar um objeto:

```java
Pessoa homerSimpson = new Pessoa("Homer Simpson");
```

Isso significa:

1. A JVM aloca memória para o novo objeto.
2. O construtor `Pessoa(String nome)` é executado para inicializar os atributos.
3. A variável `homerSimpson` passa a referenciar esse objeto na memória.

Exemplo de criação de objetos:

```java
Pessoa homerSimpson = new Pessoa("Homer Simpson");
Pessoa margeSimpson = new Pessoa("Marge Simpson", 35, "Feminino", 170, 70f, "123.456.789-00");
```

Cada um desses objetos tem seu próprio:

* **estado** (valores dos atributos como nome, idade, peso, etc.),
* e **comportamento** (andar, comer, dormir, conversar...).

**Exemplo de chamada de método:**

```java
homerSimpson.dormir(); // imprime "Dormindo..."
```

**Modificando o estado:**

```java
homerSimpson.mudarDeNome("Máximo Poder");
```

**Interação entre objetos:**

```java
margeSimpson.conversar(homerSimpson); // marge conversa com homer
```
