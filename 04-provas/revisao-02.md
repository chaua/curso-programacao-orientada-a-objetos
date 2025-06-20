# 📓 Revisão 02

### Questão 1

Considere o seguinte código Java:

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Latido");
    }
}
```

Qual das opções representa corretamente o conceito de polimorfismo?

A. Criar várias classes com o mesmo nome.\
B. Criar um método com o mesmo nome em classes diferentes, com comportamentos distintos.\
C. Evitar o uso de construtores para não sobrecarregar o sistema.\
D. Utilizar herança múltipla para evitar duplicação de código.\
E. Criar métodos com o mesmo nome e mesma assinatura.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O polimorfismo permite que classes derivadas implementem métodos com o mesmo nome da superclasse, mas com comportamentos específicos.

</details>

### Questão 2

Sobre interfaces em Java, considere as afirmações abaixo:

I. Uma interface pode conter métodos com corpo.\
II. Uma classe pode implementar mais de uma interface.\
III. Interfaces permitem herança múltipla de tipo.

Assinale a alternativa correta:

A. I e III\
B. I, II e III\
C. II e III\
D. Apenas I\
E. Apenas II

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Interfaces suportam herança múltipla de tipo e uma classe pode implementar múltiplas interfaces. Métodos com corpo só são permitidos se forem `default` ou `static`.

</details>

### Questão 3

Considere a hierarquia de classes:

```java
abstract class Forma {
    abstract double calcularArea();
}

class Circulo extends Forma {
    double raio;
    Circulo(double r) { raio = r; }

    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
```

Qual é a principal justificativa para se usar a classe `Forma` como abstrata?

A. Para que os métodos possam ter várias implementações.\
B. Para permitir herança múltipla.\
C. Para evitar a criação de objetos dessa classe.\
D. Para utilizar apenas atributos estáticos.\
E. Para impor a implementação de `calcularArea` nas subclasses.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Classes abstratas servem como modelo e forçam as subclasses a implementarem métodos definidos como abstratos.

</details>

### Questão 4

Qual é o efeito da seguinte sobrecarga de métodos em Java?

```java
class Soma {
    int somar(int a, int b) { return a + b; }
    double somar(double a, double b) { return a + b; }
}
```

A. Substitui implicitamente o método `toString`.\
B. Permite somar inteiros e números de ponto flutuante usando o mesmo nome de método.\
C. Provoca erro de compilação devido à ambiguidade.\
D. Impede que a classe `Soma` seja instanciada.\
E. Implementa herança múltipla.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** A sobrecarga permite a coexistência de métodos com o mesmo nome, desde que as assinaturas sejam diferentes (tipos e número de parâmetros).

</details>

### Questão 5

Analise o seguinte trecho de código:

```java
interface A {
    void metodo();
}

interface B {
    void metodo();
}

class C implements A, B {
    public void metodo() {
        System.out.println("Implementação de A e B");
    }
}
```

Este código exemplifica:

A. Sobrecarga de construtores.\
B. Sobrescrita de atributos.\
C. Herança múltipla de implementação.\
D. Herança múltipla de interfaces.\
E. Polimorfismo ad hoc.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Java não permite herança múltipla de classes, mas permite herança múltipla de interfaces. A classe `C` implementa `A` e `B` com um único método.

</details>

### Questão 6

Considere a seguinte estrutura:

```java
interface Operacao {
    int executar(int a, int b);
}

class Soma implements Operacao {
    public int executar(int a, int b) {
        return a + b;
    }
}
```

Qual das alternativas representa corretamente o propósito da interface `Operacao`?

A. Garantir que todas as classes filhas herdem um atributo comum.\
B. Forçar a implementação do método `executar`.\
C. Permitir que a classe herde de múltiplas superclasses.\
D. Criar objetos com atributos encapsulados.\
E. Usar o mesmo nome de método em várias classes sem restrições.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Interfaces definem um contrato. Toda classe que implementa a interface deve obrigatoriamente implementar os métodos definidos.

</details>

### Questão 7

Em relação ao encapsulamento, analise o trecho de código:

```java
class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
```

O uso do modificador `private` para o atributo `saldo` indica:

A. Que o atributo pode ser acessado diretamente fora da classe.\
B. Que o atributo não pode ser alterado após ser definido.\
C. Que o atributo é acessível apenas por métodos públicos.\
D. Que o atributo é compartilhado com todas as subclasses.\
E. Que o atributo será inicializado automaticamente com zero.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O encapsulamento visa proteger os dados, restringindo o acesso direto e obrigando o uso de métodos públicos (`get` e `set`) para manipulação controlada.

</details>

### Questão 8

Sobre classes abstratas, considere:

```java
abstract class Veiculo {
    abstract void mover();
}

class Carro extends Veiculo {
    void mover() {
        System.out.println("Carro em movimento");
    }
}
```

Qual das afirmações é verdadeira?

A. A classe `Carro` não pode herdar de `Veiculo`.\
B. A classe `Carro` é abstrata por herança.\
C. O método `mover` pode ter múltiplas implementações na mesma classe.\
D. O método `mover` deve ser sobrescrito pela subclasse.\
E. A classe `Veiculo` pode ser instanciada diretamente.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Métodos abstratos não possuem implementação e exigem que as subclasses forneçam sua própria definição.

</details>

### Questão 9

Assinale a alternativa que apresenta um exemplo de polimorfismo por sobrescrita (override):

A. Substituir um método da superclasse com uma nova implementação na subclasse.\
B. Criar dois métodos com o mesmo nome e parâmetros diferentes.\
C. Utilizar uma interface em vez de uma classe abstrata.\
D. Criar uma variável com o mesmo nome da superclasse.\
E. Criar dois métodos com o mesmo nome em classes distintas e sem relação de herança.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** A sobrescrita ocorre quando uma subclasse redefine um método herdado da superclasse com uma nova implementação.

</details>

### Questão 10

Considere a classe:

```java
class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
```

Qual o papel do construtor nesta classe?

A. Garantir a herança dos atributos.\
B. Inicializar os atributos da classe no momento da criação do objeto.\
C. Realizar validações em tempo de compilação.\
D. Criar atributos privados automaticamente.\
E. Impedir que a classe seja instanciada.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O construtor é utilizado para inicializar os atributos da classe com os valores fornecidos na criação do objeto.

</details>

### Questão 11

Em Java, qual das alternativas descreve corretamente o polimorfismo?

A. Capacidade de uma classe herdar várias superclasses.\
B. Uso exclusivo de métodos `static`.\
C. Instanciação de interfaces diretamente.\
D. Capacidade de objetos de diferentes classes responderem ao mesmo método.\
E. Criação de múltiplos construtores na mesma classe.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Polimorfismo permite que objetos de diferentes classes que compartilham uma superclasse ou interface respondam a uma mesma chamada de método de formas distintas.

</details>

### Questão 12

Considere:

```java
class Animal {
    void falar() { System.out.println("Animal emite som"); }
}

class Gato extends Animal {
    void falar() { System.out.println("Miau"); }
}
```

Ao executar:

```java
Animal a = new Gato();
```

A. Gato\
B. Erro de compilação\
C. Miau\
D. Nenhuma saída\
E. Animal emite som

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Apesar do tipo da variável ser `Animal`, o objeto é do tipo `Gato`, então a versão sobrescrita do método será chamada (polimorfismo em tempo de execução).

</details>

### Questão 13

Polimorfismo em Java é possível principalmente por meio de:

A. Herança e sobrescrita de métodos.\
B. Interfaces e métodos estáticos.\
C. Modificadores `final`.\
D. Atributos privados.\
E. Construtores com parâmetros diferentes.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** A herança permite que uma subclasse sobrescreva métodos da superclasse, o que é essencial para o polimorfismo em tempo de execução.

</details>

### Questão 14

Sobre o polimorfismo por sobrecarga (ad hoc), é correto afirmar:

A. Ocorre quando uma subclasse sobrescreve um método da superclasse.\
B. Não é permitido em Java.\
C. Ocorre quando métodos têm o mesmo nome, mas diferem em tipo ou quantidade de parâmetros.\
D. É exclusivo de interfaces.\
E. É incompatível com herança.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O polimorfismo por sobrecarga acontece quando há múltiplos métodos com o mesmo nome, mas com assinaturas diferentes (parâmetros distintos).

</details>

### Questão 15

Analise:

```java
interface Operacao {
    int executar(int a, int b);
}

class Soma implements Operacao {
    public int executar(int a, int b) {
        return a + b;
    }
}

class Multiplicacao implements Operacao {
    public int executar(int a, int b) {
        return a * b;
    }
}
```

Qual das opções reflete o uso de polimorfismo neste exemplo?

A. O método `executar` é estático.\
B. A classe `Soma` herda de `Multiplicacao`.\
C. As classes `Soma` e `Multiplicacao` implementam o mesmo método de maneiras distintas.\
D. O método `executar` é sobrecarregado.\
E. A interface define atributos comuns.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** As classes `Soma` e `Multiplicacao` implementam a interface `Operacao`, fornecendo diferentes comportamentos para o método `executar`. Isso caracteriza polimorfismo em tempo de execução.

</details>

### Questão 16

Considere o seguinte código:

```java
class Util {
    static int quadrado(int x) {
        return x * x;
    }
}
```

Como o método `quadrado` deve ser chamado corretamente?

A. Util.quadrado(5);\
B. new Util().quadrado(5);\
C. static.quadrado(5);\
D. Util u = new Util(); u.quadrado(5);\
E. quadrado(5);

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Métodos `static` pertencem à classe e devem ser acessados diretamente através do nome da classe, sem necessidade de instância.

</details>

### Questão 17

Sobre o uso do modificador `final` em Java, assinale a alternativa correta:

A. Um método `final` pode ser sobrescrito por subclasses.\
B. Um construtor pode ser declarado como `final`.\
C. Um atributo `final` pode ser alterado após sua inicialização.\
D. Uma classe `final` não pode ser herdada.\
E. O modificador `final` permite múltiplas instâncias simultâneas.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Classes marcadas como `final` não podem ser estendidas. Isso é utilizado para garantir segurança ou evitar alterações de comportamento.

</details>

### Questão 18

Considere:

```java
class Configuracao {
    final static String VERSAO = "1.0";
}
```

Qual das afirmações é verdadeira?

A. A declaração está incorreta por usar `final` e `static` juntos.\
B. `VERSAO` é um atributo mutável, acessado por instância.\
C. O valor de `VERSAO` pode ser alterado em tempo de execução.\
D. `VERSAO` pode ser acessado como `Configuracao.VERSAO`.\
E. O compilador ignora a palavra-chave `final`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O uso conjunto de `final` e `static` é comum para definir constantes. `VERSAO` é uma constante de classe e deve ser acessada diretamente via nome da classe.

</details>

### Questão 19

Dado:

```java
class Exemplo {
    final int numero;

    Exemplo(int valor) {
        numero = valor;
    }
}
```

O que acontece se tentarmos alterar `numero` após o construtor?

A. O código funcionará apenas em tempo de execução.\
B. Ocorrerá erro de compilação.\
C. O valor será alterado apenas na instância local.\
D. A alteração será ignorada pelo compilador.\
E. O valor será atualizado sem erro.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** A variável `final` só pode ser atribuída uma vez. Qualquer tentativa de reatribuição após sua inicialização causará erro de compilação.

</details>

### Questão 20

Sobre o modificador `static` em atributos:

A. Permite o compartilhamento do atributo entre todas as instâncias da classe.\
B. Cria uma constante com valor imutável.\
C. Define que o atributo deve ser final.\
D. Impede o uso do atributo fora da classe.\
E. Define que o atributo pertence à instância.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Atributos `static` pertencem à classe, não a instâncias individuais, e são compartilhados entre todas as instâncias da classe.

</details>

### Questão 21

Qual das alternativas representa corretamente o propósito do bloco `try-catch` em Java?

A. Inicializar variáveis `static`.\
B. Tratar exceções que podem ocorrer durante a execução.\
C. Controlar a visibilidade de atributos.\
D. Definir constantes que não podem ser modificadas.\
E. Substituir herança múltipla.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O bloco `try-catch` é usado para capturar e tratar exceções durante a execução, permitindo que o programa continue de maneira controlada.

</details>

### Questão 22

Analise o código:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro de divisão por zero.");
}
```

Qual será a saída?

A. Erro de compilação.\
B. Exceção não capturada.\
C. Erro de divisão por zero.\
D. O programa será finalizado abruptamente.\
E. Nenhuma, pois não há exceção.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** A exceção `ArithmeticException` ocorre devido à divisão por zero e é corretamente capturada pelo bloco `catch`.

</details>

### Questão 23

Assinale a alternativa correta sobre exceções verificadas (checked) em Java:

A. São causadas por erros de sintaxe.\
B. São subclasses de `RuntimeException`.\
C. Precisam ser tratadas com `try-catch` ou declaradas com `throws`.\
D. Nunca ocorrem em tempo de execução.\
E. São ignoradas pelo compilador.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Exceções verificadas devem obrigatoriamente ser tratadas ou declaradas, conforme exigência do compilador.

</details>

### Questão 24

Considere:

```java
public void abrirArquivo() throws IOException {
    FileReader fr = new FileReader("arquivo.txt");
}
```

O que significa a cláusula `throws IOException`?

A. Garante que a exceção será lançada sempre.\
B. O método delega ao chamador a responsabilidade de tratar a exceção.\
C. O compilador ignora essa instrução.\
D. O método nunca lançará exceções.\
E. A exceção será automaticamente tratada.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** A cláusula `throws` indica que o método pode lançar a exceção e que o tratamento deve ser feito por quem chama o método.

</details>

### Questão 25

Sobre o bloco `finally` em Java, é correto afirmar:

A. Sempre é executado, independentemente da ocorrência de exceção.\
B. Não pode ser usado com `try-catch`.\
C. É executado apenas quando ocorre exceção.\
D. É ignorado se não houver exceção.\
E. É executado somente se o `catch` for acionado.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** O bloco `finally` é utilizado para executar ações finais, como liberação de recursos, e será executado sempre, com ou sem exceção.

</details>

### Questão 26

No padrão de arquitetura MVC, qual é a principal responsabilidade do componente "Model"?

A. Armazenar e manipular os dados da aplicação.\
B. Definir a lógica de apresentação e interface gráfica.\
C. Renderizar componentes visuais.\
D. Gerenciar eventos do usuário.\
E. Coordenar as requisições entre os módulos.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** O Model representa a camada de dados da aplicação e é responsável pela lógica de negócios e persistência de dados.

</details>

### Questão 27

Em uma aplicação Java que implementa o padrão MVC, o que normalmente pertence à camada View?

A. Métodos que acessam arquivos de configuração.\
B. Métodos que realizam cálculos de negócio.\
C. Classes de conexão com banco de dados.\
D. Interfaces gráficas construídas com Swing ou JavaFX.\
E. Lógicas de controle de fluxo da aplicação.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** A View é responsável pela apresentação e interação com o usuário, geralmente implementada com bibliotecas de interface gráfica.

</details>

### Questão 28

Qual das opções representa a principal função do Controller em MVC?

A. Renderizar os dados na tela.\
B. Atualizar diretamente o banco de dados.\
C. Garantir o encapsulamento dos atributos privados.\
D. Armazenar os dados da aplicação.\
E. Receber entradas do usuário, processá-las e coordenar as atualizações no Model e na View.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** O Controller atua como intermediário entre o Model e a View, tratando os eventos e controlando o fluxo da aplicação.

</details>

### Questão 29

Qual benefício é proporcionado pela separação entre Model, View e Controller?

A. Manutenção facilitada e maior modularidade.\
B. Redução do uso de memória.\
C. Velocidade de execução.\
D. Compatibilidade com múltiplos compiladores.\
E. Criação automática de testes.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** A separação de responsabilidades facilita a manutenção, permite o reaproveitamento de código e melhora a testabilidade da aplicação.

</details>

### Questão 30

No contexto de Java e padrão MVC, considere:

```java
public class ProdutoController {
    private Produto model;
    private ProdutoView view;

    public ProdutoController(Produto model, ProdutoView view) {
        this.model = model;
        this.view = view;
    }

    public void atualizarNomeProduto(String nome) {
        model.setNome(nome);
        view.exibirProduto(model);
    }
}
```

Qual das funções abaixo é desempenhada pelo Controller?

A. Somente armazenar o nome do produto.\
B. Intermediar a atualização dos dados do produto e sua visualização.\
C. Criar instâncias do produto.\
D. Apenas exibir dados na tela.\
E. Salvar os dados no banco de dados.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O Controller recebe uma entrada (nome), atualiza o modelo e aciona a view para exibir os dados atualizados.

</details>

### Questão 31

No padrão MVC com DAO e VO, qual a principal responsabilidade de uma classe DAO (Data Access Object)?

A. Armazenar o estado da interface.\
B. Controlar as regras de negócio da aplicação.\
C. Gerar interfaces gráficas dinâmicas.\
D. Exibir os dados ao usuário final.\
E. Intermediar o acesso aos dados de forma encapsulada.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** DAO encapsula o acesso a fontes de dados (como bancos de dados), permitindo a separação entre lógica de negócios e persistência.

</details>

### Questão 32

Considere a classe:

```java
public class ProdutoVO {
    private String nome;
    private double preco;

    // Getters e Setters
}
```

O que caracteriza esta classe como um VO (Value Object)?

A. A presença de métodos estáticos.\
B. O encapsulamento de regras de negócio.\
C. A ausência de métodos de persistência.\
D. A implementação de uma interface gráfica.\
E. O uso exclusivo de atributos públicos.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Classes VO são usadas para representar dados de forma simples, com atributos e métodos de acesso, sem conter lógica de persistência ou regras de negócio.

</details>

### Questão 33

Na arquitetura MVC utilizando DAO e VO, onde deve ocorrer a validação de regras de negócio?

A. No banco de dados.\
B. No construtor da classe VO.\
C. Na classe DAO.\
D. No Controller ou em classes de serviço associadas ao Model.\
E. Na interface gráfica (View).

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** A lógica de negócio é normalmente gerenciada pelo Controller ou classes de serviço, garantindo que o DAO mantenha responsabilidade apenas sobre a persistência.

</details>

### Questão 34

Qual é a principal vantagem de utilizar VO em conjunto com DAO no padrão MVC?

A. Substitui o uso de interfaces.\
B. Facilita a serialização de objetos para transporte de dados.\
C. Reduz a necessidade de usar construtores.\
D. Permite a execução de código em tempo de compilação.\
E. Elimina a necessidade de banco de dados.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** VOs são usados para transferir dados entre camadas de forma eficiente, inclusive para transporte remoto e serialização.

</details>

### Questão 35

Em uma aplicação Java com MVC + DAO + VO, qual seria o fluxo correto para exibir um produto ao usuário?

A. DAO → VO → Controller → View\
B. View → DAO → Controller → VO\
C. Controller → View → DAO → VO\
D. View → Controller → DAO → VO → View\
E. VO → DAO → View → Controller

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O fluxo típico consiste em a View solicitar dados ao Controller, que interage com o DAO para obter dados encapsulados em VO e retorna à View para exibição.

</details>

### Questão 36

O que é necessário para estabelecer uma conexão com um banco de dados usando JDBC?

A. Usar um framework como Hibernate obrigatoriamente.\
B. Inicializar a interface `Statement`.\
C. Instanciar diretamente a classe `ResultSet`.\
D. Importar apenas a classe `java.sql.Connection`.\
E. Utilizar o driver JDBC adequado e fornecer URL, usuário e senha.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Para se conectar a um banco de dados via JDBC, é necessário carregar o driver e fornecer os parâmetros de conexão: URL, nome de usuário e senha.

</details>

### Questão 37

Considere o trecho de código:

```java
Connection conn = DriverManager.getConnection(url, user, password);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM produtos");
```

Qual a finalidade da classe `ResultSet`?

A. Armazenar os resultados retornados por uma consulta SQL.\
B. Representar um driver JDBC.\
C. Realizar commit automático da transação.\
D. Armazenar configurações de conexão.\
E. Encapsular a consulta SQL em tempo de compilação.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** `ResultSet` representa o conjunto de resultados retornado por uma instrução SQL executada com `executeQuery`.

</details>

### Questão 38

Qual é o método mais adequado para executar uma instrução SQL de inserção com JDBC?

A. executeBatch()\
B. executeInsert()\
C. executeQuery()\
D. executeUpdate()\
E. executeSelect()

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O método `executeUpdate()` é utilizado para executar comandos SQL que modificam dados (INSERT, UPDATE, DELETE), retornando o número de linhas afetadas.

</details>

### Questão 39

Ao utilizar `PreparedStatement` em JDBC, qual é a principal vantagem?

A. Garante que apenas comandos SELECT sejam executados.\
B. Elimina a necessidade de usar `try-catch`.\
C. Previne ataques de injeção de SQL e melhora performance.\
D. Permite múltiplas conexões simultâneas.\
E. Gera relatórios automaticamente.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** `PreparedStatement` permite o uso de parâmetros, protegendo contra injeções de SQL e otimizando o desempenho por meio de pré-compilação.

</details>

### Questão 40

Considere o código:

```java
PreparedStatement ps = conn.prepareStatement("INSERT INTO produtos (nome, preco) VALUES (?, ?)");
ps.setString(1, "Teclado");
ps.setDouble(2, 99.90);
ps.executeUpdate();
```

O que representam os símbolos `?`?

A. Campos obrigatórios da tabela.\
B. Comentários SQL.\
C. Parâmetros posicionais a serem substituídos em tempo de execução.\
D. Referência a variáveis locais.\
E. Nomes de colunas.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Os símbolos `?` são placeholders para parâmetros, substituídos pelos métodos `setXXX()` correspondentes em tempo de execução.

</details>

### Questão 41

Sobre o uso de `try-with-resources` em Java para manipulação de arquivos, é correto afirmar:

A. Serve apenas para leitura de arquivos CSV.\
B. Elimina a necessidade de usar `throws`.\
C. Funciona apenas com arquivos binários.\
D. Garante o fechamento automático dos recursos após o uso.\
E. Substitui a necessidade de `catch`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O `try-with-resources` é usado com classes que implementam `AutoCloseable`, garantindo o fechamento automático de arquivos, mesmo em caso de exceção.

</details>

### Questão 42

Em Java, por que a herança múltipla de classes não é permitida?

A. Porque Java não suporta orientação a objetos.\
B. Porque todas as classes são abstratas.\
C. Para garantir compatibilidade com C++.\
D. Para evitar conflitos de tipo em tempo de execução.\
E. Porque herança múltipla causa lentidão.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Java evita herança múltipla de classes para prevenir o "problema do diamante", que ocorre quando duas superclasses implementam o mesmo método e há ambiguidade na herança.

</details>

### Questão 43

Qual alternativa representa uma maneira válida de simular herança múltipla em Java?

A. Composição de objetos apenas.\
B. Implementação de múltiplas interfaces.\
C. Definição de atributos `static`.\
D. Uso de `super()` em mais de uma classe.\
E. Herança múltipla usando múltiplos `extends`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Java permite herança múltipla de tipo por meio da implementação de várias interfaces, possibilitando reutilização de comportamento com flexibilidade.

</details>

### Questão 44

Considere:

```java
interface A {
    void metodo();
}

interface B {
    void metodo();
}

class C implements A, B {
    public void metodo() {
        System.out.println("Implementação");
    }
}
```

O que esse exemplo demonstra?

A. Herança múltipla de implementação.\
B. Herança simples de classes abstratas.\
C. Conflito de nomes em tempo de compilação.\
D. Sobrecarga de métodos em interfaces.\
E. Herança múltipla via interfaces.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** A classe `C` implementa duas interfaces com o mesmo método, caracterizando herança múltipla de tipo, resolvida por sobrescrever o método uma única vez.

</details>

### Questão 45

O que caracteriza o problema do diamante da morte na herança múltipla?

A. Quando atributos privados causam conflitos entre classes filhas.\
B. Quando uma subclasse herda métodos e não pode sobrescrevê-los.\
C. Quando métodos são sobrecarregados em interfaces.\
D. Quando uma classe herda métodos com implementações ambíguas de duas superclasses.\
E. Quando uma interface possui métodos `static`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O problema do diamante ocorre quando uma subclasse herda métodos com implementações diferentes de duas superclasses, resultando em ambiguidade na resolução do método.

</details>

### Questão 46

Java evita o problema do diamante da morte por:

A. Impor o uso de `throws` em métodos herdados.\
B. Utilizar anotação `@Override` obrigatória.\
C. Proibir herança de interfaces com métodos `default`.\
D. Exigir métodos `abstract` em interfaces.\
E. Impedir herança múltipla de classes.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Java proíbe herança múltipla de classes, evitando conflitos diretos de implementação que caracterizam o problema do diamante da morte.

</details>

### Questão 47

Por que o problema do diamante é menos crítico em Java do que em C++?

A. Porque Java não possui herança.\
B. Porque Java não possui polimorfismo.\
C. Porque Java não possui métodos sobrecarregados.\
D. Porque Java não permite a criação de múltiplas instâncias.\
E. Porque Java usa herança única para classes.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Java evita o diamante da morte com herança única para classes .

</details>

### Questão 48

Qual das alternativas representa corretamente o conceito de polimorfismo de sobrecarga (ad hoc)?

A. Estender múltiplas classes abstratas.\
B. Implementar um método com comportamento diferente na subclasse.\
C. Utilizar interfaces genéricas.\
D. Executar um método sem saber sua implementação em tempo de execução.\
E. Criar vários métodos com o mesmo nome, mas diferentes assinaturas.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** O polimorfismo por sobrecarga (ad hoc) ocorre quando métodos possuem o mesmo nome, mas diferem no número ou tipo de parâmetros.

</details>

### Questão 49

Considere:

```java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }
}
```

Este exemplo representa:

A. Polimorfismo de subtipos.\
B. Polimorfismo paramétrico.\
C. Polimorfismo de sobrecarga.\
D. Polimorfismo de sobrescrita.\
E. Herança múltipla.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** A classe `Calculadora` possui dois métodos com o mesmo nome, mas com tipos diferentes de parâmetros, caracterizando polimorfismo de sobrecarga.

</details>

### Questão 50

Sobre o polimorfismo de sobrescrita (override), assinale a alternativa correta:

A. Permite que uma subclasse forneça sua própria implementação de um método da superclasse.\
B. Exige uso exclusivo de interfaces.\
C. Ocorre apenas com métodos `final`.\
D. Só pode ocorrer em métodos `static`.\
E. É equivalente à criação de construtores.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** A sobrescrita permite que uma subclasse reimplemente um método da superclasse, respeitando a mesma assinatura.

</details>

### Questão 51

Em qual das situações a seguir ocorre polimorfismo paramétrico?

A. Quando um atributo é declarado como `static`.\
B. Quando usamos `instanceof` para comparar tipos.\
C. Quando um método aceita um tipo genérico como parâmetro.\
D. Quando há múltiplas implementações de um método.\
E. Quando classes implementam interfaces diferentes.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O polimorfismo paramétrico ocorre quando métodos ou classes utilizam tipos genéricos (como `T`), permitindo reutilização independente do tipo concreto.

</details>

### Questão 52

Qual das alternativas representa polimorfismo de subtipo?

A. Quando se sobrecarrega um método dentro da mesma classe.\
B. Quando diferentes classes herdam de uma mesma superclasse e substituem seus métodos.\
C. Quando métodos possuem comportamento assíncrono.\
D. Quando um método é chamado estaticamente.\
E. Quando um método usa reflexão para decidir seu comportamento.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Polimorfismo de subtipo refere-se à capacidade de usar um objeto de uma subclasse onde um objeto da superclasse é esperado, com comportamento dinâmico em tempo de execução.

</details>

### Questão 53

Considere o seguinte código:

```java
class Pessoa {
    private String nome;

    public void Pessoa(String nome) {
        this.nome = nome;
    }
}
```

Qual é o erro conceitual?

A. O construtor está declarado com `void`, o que o torna um método comum.\
B. A variável `nome` não está inicializada.\
C. O atributo `nome` não é acessível.\
D. O método `Pessoa` não pode ter o mesmo nome da classe.\
E. O uso de `this` é inválido.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Construtores não devem ter tipo de retorno. Com `void`, o método `Pessoa` se torna um método comum, não um construtor.

</details>

### Questão 54

Considere:

```java
abstract class Veiculo {
    abstract void mover();
}

class Bicicleta extends Veiculo {
    // Nenhuma implementação
}
```

O que está incorreto no código?

A. A classe `Bicicleta` deveria ser abstrata ou implementar `mover()`.\
B. O uso de `abstract` em `mover` é desnecessário.\
C. O método `mover` deveria ser `static`.\
D. A classe `Veiculo` não pode ser herdada.\
E. Classes abstratas não podem ter métodos abstratos.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Uma classe concreta que herda de uma classe abstrata com métodos abstratos deve obrigatoriamente implementar esses métodos, ou ela mesma deve ser declarada como abstrata.

</details>

### Questão 55

Considere:

```java
class Conta {
    static double saldo;

    public void sacar(double valor) {
        saldo -= valor;
    }
}
```

Qual o problema conceitual desse trecho?

A. A variável `valor` não é inicializada.\
B. `saldo` precisa ser `final`.\
C. A variável `saldo` não pode ser `static`.\
D. O método `sacar` deveria ser `static`.\
E. O saldo será compartilhado por todas as instâncias.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Como `saldo` é `static`, ele pertence à classe e será compartilhado por todas as instâncias de `Conta`, o que pode não ser o comportamento desejado em contextos bancários.

</details>

### Questão 56

Analise:

```java
final class Produto {
    private double preco;
}

class Eletronico extends Produto {
}
```

Qual o erro conceitual?

A. Classes `final` podem ter subclasses.\
B. `Eletronico` está herdando de uma classe `final`, o que não é permitido.\
C. `preco` deveria ser `public`.\
D. O modificador `final` só pode ser usado em métodos.\
E. A classe `Produto` deveria ter um construtor.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Uma classe `final` não pode ser estendida. Tentativas de herança a partir dela resultam em erro de compilação.

</details>

### Questão 57

Considere o seguinte código:

```java
public class Teste {
    public static void main(String[] args) {
        Teste.metodo();
    }

    public void metodo() {
        System.out.println("Chamado");
    }
}
```

Qual o erro conceitual?

A. O método `metodo` está estático sem necessidade.\
B. `metodo` deveria estar dentro de uma interface.\
C. `main` não pode chamar outros métodos.\
D. O método `metodo` não pode ser chamado dentro de `main`.\
E. O método `metodo` precisa ser `static` para ser chamado no contexto estático de `main`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** O método `main` é estático e não pode acessar diretamente métodos de instância. O método `metodo` deveria ser `static` ou invocado a partir de uma instância.

</details>

### Questão 58

Analise o código:

```java
class Base {
    private void mostrar() {
        System.out.println("Base");
    }
}

class Derivada extends Base {
    public void mostrar() {
        System.out.println("Derivada");
    }
}
```

Qual o erro de conceito?

A. `mostrar` não pode ser redefinido.\
B. `mostrar` deveria ser `final`.\
C. `Derivada` está sobrescrevendo `mostrar` da superclasse.\
D. `mostrar` em `Base` deveria ser `public`.\
E. `mostrar` em `Derivada` está criando um novo método e não sobrescrevendo.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** Métodos `private` não são herdados. O método `mostrar` em `Derivada` é um novo método, não uma sobrescrita.

</details>

### Questão 59

Considere:

```java
abstract class Figura {
    abstract void desenhar();
    void mover() {
        System.out.println("Movendo...");
    }
}

Figura f = new Figura();
```

Qual o erro conceitual?

A. Não se pode instanciar uma classe abstrata.\
B. O método `mover` não é válido em classes abstratas.\
C. O método `desenhar` deveria ser `final`.\
D. A classe `Figura` deveria ser concreta.\
E. O método `desenhar` deveria ser `static`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Classes abstratas não podem ser instanciadas diretamente. Elas devem ser estendidas por uma subclasse concreta.

</details>

### Questão 60

Considere o código:

```java
public class Exemplo {
    public static void main(String[] args) {
        System.out.println(somar(2, 3));
    }

    public int somar(int a, int b) {
        return a + b;
    }
}
```

Qual é o erro conceitual?

A. O método `somar` está sobrescrevendo `toString`.\
B. O método `somar` está com a assinatura incorreta.\
C. `main` não pode chamar métodos com parâmetros.\
D. O método `somar` deve ser `static` para ser chamado de `main`.\
E. O método `somar` deveria ser privado.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O método `main` é `static` e só pode acessar diretamente métodos também estáticos. `somar` precisa ser `static` para ser chamado nesse contexto.

</details>

### Questão 61

Analise:

```java
class Produto {
    String nome;
    double preco = 10;

    Produto(String nome) {
        this.nome = nome;
    }

    Produto() {
        preco = 20;
    }
}
```

Qual o problema conceitual neste código?

A. Os construtores devem se diferenciar apenas pela quantidade ou tipo de parâmetros, o que é feito corretamente.\
B. A classe `Produto` não pode ter dois construtores.\
C. O construtor sem parâmetros sobrescreve o com parâmetro.\
D. O construtor com parâmetro deve vir depois do sem parâmetro.\
E. O compilador não permite sobrecarga de construtores.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Não há erro conceitual. A classe possui dois construtores sobrecarregados, o que é perfeitamente válido em Java.

</details>

### Questão 62

Considere o seguinte código:

```java
interface Operavel {
    void operar();
}

abstract class Maquina implements Operavel {
    void desligar() {
        System.out.println("Desligando...");
    }
}
```

Qual o erro conceitual?

A. A classe `Maquina` precisa declarar `operar()` como `static`.\
B. A classe `Maquina` deve implementar `operar()` ou ser abstrata.\
C. Não há erro; o código é válido.\
D. `desligar()` não pode ser chamado em classes abstratas.\
E. Interfaces não podem ser implementadas por classes abstratas.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O código é válido. Uma classe abstrata pode implementar uma interface sem necessariamente implementar todos os métodos, desde que permaneça abstrata.

</details>

### Questão 63

Analise o código:

```java
class Exemplo {
    static int contador = 0;

    public void incrementar() {
        contador++;
    }
}
```

Qual o possível problema conceitual ao usar esta classe em múltiplas instâncias?

A. O atributo `contador` será compartilhado entre todas as instâncias.\
B. O atributo `contador` será independente em cada instância.\
C. A variável `contador` não é visível fora da classe.\
D. O método `incrementar` não pode ser `void`.\
E. A variável `contador` deveria ser `final`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Como o atributo `contador` é `static`, ele pertence à classe, sendo compartilhado por todas as instâncias, o que pode causar efeitos colaterais se isso não for desejado.

</details>

### Questão 64

Considere:

```java
public class Animal {
    protected String nome;
}

public class Cachorro extends Animal {
    private void nome() {
        System.out.println("Nome: " + nome);
    }
}
```

Qual o erro conceitual?

A. A variável `nome` está sendo acessada incorretamente.\
B. Métodos não podem ter o mesmo nome de atributos.\
C. O método `nome()` deve ser `static`.\
D. O método `nome()` pode causar confusão com o atributo `nome`.\
E. `Cachorro` não pode herdar de `Animal`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Apesar de válido, usar um método com o mesmo nome de um atributo pode confundir a leitura e manutenção do código. É uma prática desaconselhada.

</details>

### Questão 65

Veja o código:

```java
class Cliente {
    public void setNome(String nome) {
        nome = nome;
    }
}
```

Qual o problema conceitual?

A. O parâmetro `nome` precisa ser `final`.\
B. A atribuição `nome = nome` não altera o estado do objeto.\
C. O método está sobrescrevendo `toString`.\
D. `setNome` precisa ser `static`.\
E. O atributo `nome` não foi declarado.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** A instrução `nome = nome` apenas reatribui o parâmetro a ele mesmo. Para alterar o atributo da classe, seria necessário `this.nome = nome`.

</details>

### Questão 66

Analise:

```java
class Produto {
    final double preco;

    Produto() {
        preco = 10.0;
    }

    void alterarPreco(double novoPreco) {
        preco = novoPreco;
    }
}
```

Qual o erro conceitual?

A. `preco` deve ser `static`.\
B. O valor de `preco` é sempre zero.\
C. A variável `preco` não pode ser alterada após ser inicializada.\
D. `preco` deve ser inicializado fora do construtor.\
E. O método `alterarPreco` deveria ser `final`.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Como `preco` é `final`, ele só pode ser atribuído uma vez. Qualquer tentativa de reatribuição, como em `alterarPreco`, resulta em erro de compilação.

</details>

### Questão 67

Complete o código abaixo para que a classe `Pessoa` possua um construtor que inicializa o nome:

```java
class Pessoa {
    private String nome;

    // Construtor aqui
}
```

A. `nome = nome;`\
B. `Pessoa() { nome = "padrão"; }`\
C. `Pessoa(String nome) { this.nome = nome; }`\
D. `String Pessoa(String nome) { nome = nome; }`\
E. `public void Pessoa(String nome) { this.nome = nome; }`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** A alternativa correta define um construtor sem tipo de retorno e utiliza `this.nome = nome` para inicializar o atributo da instância.

</details>

### Questão 68

Complete o código para implementar corretamente a interface:

```java
interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    // método aqui
}
```

A. `void imprimir() { System.out.println("Relatório"); }`\
B. `int imprimir() { return 0; }`\
C. `public imprimir() { System.out.println("Relatório"); }`\
D. `void imprimir(String texto) { System.out.println(texto); }`\
E. `static void imprimir() { System.out.println("Relatório"); }`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** O método sobrescrito deve manter a mesma assinatura da interface, e precisa ser público para manter o contrato.

</details>

### Questão 69

Complete o código para aplicar corretamente polimorfismo de subtipo:

```java
class Animal {
    void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Gato extends Animal {
    void emitirSom() {
        System.out.println("Miau");
    }
}

// Na função main
Animal a = ________;
```

A. `new Animal().emitirSom();`\
B. `new Gato();`\
C. `new Animal();`\
D. `new Object();`\
E. `Animal.emitirSom();`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Criar `Animal a = new Gato();` aplica polimorfismo de subtipo, onde a referência é do tipo da superclasse, mas o comportamento é da subclasse.

</details>

### Questão 70

Complete a declaração da classe abaixo para evitar que seja estendida:

```java
_______ class Utilidade {
    public static void ajuda() {
        System.out.println("Ajuda do sistema.");
    }
}
```

A. `abstract`\
B. `private`\
C. `public final static`\
D. `final`\
E. `static`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O modificador `final` aplicado à classe impede que ela seja estendida, o que é útil para utilitários que não devem ser herdados.

</details>

### Questão 71

Complete o código para declarar corretamente uma classe abstrata com um método abstrato:

```java
________ class Forma {
    public abstract double calcularArea();
}
```

A. `private`\
B. `final`\
C. `abstract`\
D. `static`\
E. `interface`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Classes que contêm métodos abstratos devem ser declaradas com o modificador `abstract`.

</details>

### Questão 72

Complete o código abaixo para criar uma instância de `ArrayList` e adicionar um elemento:

```java
List<String> nomes = ________;
nomes.add("Carlos");
```

A. `new ArrayList<String>();`\
B. `new LinkedList();`\
C. `ArrayList<String> nomes = new ArrayList();`\
D. `new List<String>();`\
E. `new ArrayList();`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** `ArrayList` implementa `List`, e a criação correta exige a parametrização com tipo genérico.

</details>

### Questão 73

Complete a declaração para garantir que o atributo `cpf` nunca será modificado após a construção do objeto:

```java
class Pessoa {
    private _______ String cpf;

    public Pessoa(String cpf) {
        this.cpf = cpf;
    }
}
```

A. `synchronized`\
B. `abstract`\
C. `protected`\
D. `final`\
E. `static`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O modificador `final` garante que o valor do atributo não poderá ser alterado após sua inicialização.

</details>

### Questão 74

Complete o código para evitar repetição e promover reutilização de código com herança:

```java
class Funcionario {
    String nome;
    double salario;
}

class Gerente _______ Funcionario {
    int numeroDeFuncionarios;
}
```

A. `inherits`\
B. `extends`\
C. `herda`\
D. `super`\
E. `implementa`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** A palavra-chave `extends` é usada em Java para indicar herança entre classes.

</details>

### Questão 75

Complete a implementação da interface `Runnable`:

```java
class MinhaTarefa implements Runnable {
    public void _______ {
        System.out.println("Executando em thread");
    }
}
```

A. `processar()`\
B. `run()`\
C. `main()`\
D. `executar()`\
E. `start()`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O método `run()` é exigido pela interface `Runnable` e é executado quando a thread é iniciada.

</details>

### Questão 76

Complete o código para sobrescrever corretamente o método `toString` em uma classe:

```java
class Produto {
    String nome;
    double preco;

    @Override
    public String toString() {
        return ________;
    }
}
```

A. `System.out.println(nome);`\
B. `super.toString();`\
C. `return preco;`\
D. `nome.toString();`\
E. `"Produto: " + nome + ", R$" + preco`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** E

**Justificativa:** O método `toString` deve retornar uma `String` representando o objeto. Concatenar os atributos como string é uma prática comum.

</details>

### Questão 77

Complete o código para lançar manualmente uma exceção:

```java
if (valor < 0) {
    ________ new IllegalArgumentException("Valor não pode ser negativo");
}
```

A. `break`\
B. `return`\
C. `throw`\
D. `throws`\
E. `raise`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** A instrução `throw` é usada para lançar uma exceção manualmente em tempo de execução.

</details>

### Questão 78

Complete o código para implementar uma classe singleton corretamente:

```java
class Config {
    private static Config instancia;

    private Config() {}

    public static Config getInstancia() {
        if (instancia == null) {
            instancia = ________;
        }
        return instancia;
    }
}
```

A. `Config.instancia();`\
B. `Config();`\
C. `instancia.Config();`\
D. `new Config();`\
E. `new instancia();`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Para instanciar um objeto de uma classe, usa-se `new` seguido do nome da classe e parênteses.

</details>

### Questão 79

Qual é a principal diferença entre exceções verificadas (checked) e não verificadas (unchecked) em Java?

A. Checked precisam ser tratadas ou declaradas, unchecked não.\
B. Checked são lançadas em tempo de execução, unchecked em tempo de compilação.\
C. Checked só ocorrem com entrada de dados.\
D. Checked podem ser ignoradas, unchecked não.\
E. Unchecked não causam falhas, checked causam erro fatal.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** A

**Justificativa:** Exceções verificadas (checked) devem ser obrigatoriamente tratadas ou declaradas com `throws`. As não verificadas (unchecked), derivadas de `RuntimeException`, não possuem essa obrigatoriedade.

</details>

### Questão 80

Em Java, o bloco `finally` é executado:

A. Somente se o bloco `try` lançar uma exceção.\
B. Nunca, se não houver `catch`.\
C. Apenas em exceções verificadas.\
D. Sempre, independentemente da ocorrência de exceção.\
E. Apenas quando o bloco `catch` não captura a exceção.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** O bloco `finally` é sempre executado após o `try`/`catch`, servindo para liberar recursos como arquivos e conexões.

</details>

### Questão 81

É possível utilizar múltiplos blocos `catch` para tratar diferentes tipos de exceção?

A. Não, o Java não permite mais de um `catch`.\
B. Sim, desde que os tipos de exceção sejam incompatíveis.\
C. Não, deve-se usar apenas `finally`.\
D. Apenas se os `catch` forem colocados em classes diferentes.\
E. Sim, mas apenas em exceções não verificadas.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** É possível usar múltiplos `catch`, mas eles devem tratar tipos distintos e não relacionados hierarquicamente diretamente.

</details>

### Questão 82

Sobre a cláusula `throws` em métodos Java, é correto afirmar:

A. Substitui o bloco `try-catch`.\
B. Garante o tratamento automático da exceção.\
C. Indica que o método pode lançar uma exceção e transfere a responsabilidade para quem chama.\
D. Lança uma exceção automaticamente.\
E. Evita que a exceção seja executada.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** A cláusula `throws` serve para indicar que um método pode lançar uma exceção, delegando ao chamador a responsabilidade pelo tratamento.

</details>

### Questão 83

Qual padrão de projeto garante que apenas uma instância de uma classe seja criada durante toda a execução do programa?

A. Factory\
B. Observer\
C. Singleton\
D. Decorator\
E. Strategy

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O padrão Singleton assegura que apenas uma instância da classe exista, fornecendo um ponto global de acesso a ela.

</details>

### Questão 84

Qual é a principal característica do padrão Strategy?

A. Cria uma única instância global da classe.\
B. Permite modificar dinamicamente o comportamento de um objeto.\
C. Fornece uma interface para criar famílias de objetos.\
D. Observa alterações de estado e notifica dependentes.\
E. Evita a herança múltipla.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Strategy define uma família de algoritmos encapsulados, permitindo sua substituição dinâmica conforme a necessidade do contexto.

</details>

### Questão 85

O padrão Observer é mais indicado para qual tipo de situação?

A. Substituir atributos públicos por métodos.\
B. Reagir a mudanças de estado em tempo real em sistemas desacoplados.\
C. Implementar filas de processamento.\
D. Criar objetos complexos a partir de partes independentes.\
E. Eliminar dependência de banco de dados.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** O Observer permite que múltiplos objetos sejam notificados quando o estado de outro objeto muda, promovendo baixo acoplamento.

</details>

### Questão 86

O padrão Factory é usado para:

A. Substituir operadores ternários.\
B. Eliminar o uso de construtores privados.\
C. Centralizar a criação de objetos, ocultando a lógica de instanciação.\
D. Reduzir o número de instâncias criadas.\
E. Compartilhar atributos entre objetos.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O padrão Factory encapsula a lógica de criação de objetos, promovendo flexibilidade e desacoplamento no código.

</details>

### Questão 87

Em qual das opções abaixo o padrão Decorator é aplicável?

A. Quando é necessário herdar comportamentos de várias classes.\
B. Quando se quer implementar múltiplas interfaces em tempo de execução.\
C. Quando se deseja adicionar responsabilidades a um objeto de forma dinâmica.\
D. Quando se quer substituir um singleton por uma fábrica.\
E. Quando objetos precisam ser notificados de eventos.

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** O padrão Decorator permite estender funcionalidades de objetos em tempo de execução, sem alterar sua estrutura original.

</details>

### Questão 88

Analise as sentenças abaixo sobre orientação a objetos em Java:

I. Interfaces podem conter métodos `default` e `static`.\
II. Um método `final` pode ser sobrescrito por uma subclasse.\
III. Classes abstratas não podem ser instanciadas.\
IV. A palavra-chave `super` permite acesso ao construtor da superclasse.

Quais estão corretas?

A. Apenas I e II\
B. Apenas I e III\
C. I, III e IV\
D. II, III e IV\
E. Todas estão corretas

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** C

**Justificativa:** Apenas a sentença II está incorreta. Métodos `final` não podem ser sobrescritos.

</details>

### Questão 89

Considere as afirmações sobre o uso de `static` em Java:

I. Um método `static` pode acessar diretamente variáveis de instância.\
II. A palavra-chave `static` indica que um membro pertence à classe e não à instância.\
III. Métodos `static` podem ser chamados sem instanciar a classe.\
IV. Atribuir `static` a um método permite que ele seja sobrescrito.

Quais estão corretas?

A. II, III e IV\
B. Apenas II e III\
C. I e IV\
D. Apenas III\
E. I, II e III

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** B

**Justificativa:** Sentença I está incorreta, pois métodos `static` não acessam variáveis de instância diretamente. Sentença IV também está incorreta, pois métodos `static` não são sobrescritos.

</details>

### Questão 90

Avalie as sentenças sobre encapsulamento:

I. Atributos devem ser privados para garantir encapsulamento.\
II. Métodos `get` e `set` permitem controlar o acesso a atributos privados.\
III. Encapsulamento reduz a coesão da classe.\
IV. Encapsulamento aumenta a segurança e manutenção do código.

Quais estão corretas?

A. Apenas I e III\
B. Todas estão corretas\
C. Apenas II e IV\
D. I, II e IV\
E. II e III

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

**Resposta:** D

**Justificativa:** Sentença III está incorreta. Encapsulamento aumenta a coesão, ao manter os dados protegidos e controlados.

</details>
