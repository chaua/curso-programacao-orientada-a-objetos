# 📦 Aula 03 - Classe e Objetos I

## :orange\_book: Conceito de Classe

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

### Atributos

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

## :orange\_book: Conceito de Objeto

Na **Programação Orientada a Objetos**, um **objeto** é a **instância concreta de uma classe**.

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
