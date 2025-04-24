# Relacionamento entre classes

## Questão 1

Considere o relacionamento onde **uma classe possui uma referência a outra**, mas **ambas podem existir independentemente**. Este tipo de relacionamento é conhecido como:

a. Composição\
b. Dependência transitiva\
c. Associação\
d. Herança múltipla\
e. Generalização

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**c. Associação**

</details>

## Questão 2

Em qual tipo de relacionamento a **existência do objeto parte depende do todo**, de forma que, se o todo for destruído, a parte também o será?

a. Associação fraca\
b. Agregação\
c. Composição\
d. Delegação\
e. Encapsulamento

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

&#x20;**c. Composição**

</details>

## Questão 3

Considere o código:

```java
public class Motor {
    private int cilindradas;
}

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }
}
```

Esse relacionamento é um exemplo de:

a. Associação bidirecional\
b. Composição, pois o `Motor` é criado e gerenciado internamente por `Carro`\
c. Agregação, pois `Carro` utiliza `Motor` como dependência externa\
d. Dependência temporária\
e. Herança, pois `Motor` herda de `Carro`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Composição, pois o `Motor` é criado e gerenciado internamente por `Carro`**

</details>

## Questão 4

Em um relacionamento de **agregação**, é esperado que:

a. O ciclo de vida do objeto parte seja vinculado rigidamente ao todo\
b. A classe parte seja construída e destruída dentro da classe todo\
c. O objeto todo seja dependente da existência das partes\
d. A classe parte possa existir independentemente da classe todo\
e. O relacionamento implique compartilhamento exclusivo

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. A classe parte possa existir independentemente da classe todo**

</details>

## Questão 5

Considere:

```java
public class Departamento {
    private Professer[] professores;

    public Departamento(Professor[] professores) {
        this.professores = professores;
    }
}
```

Este é um exemplo de:

a. Composição, pois `Departamento` controla a criação de `Professor`\
b. Agregação, pois `Departamento` referencia `Professor` sem gerenciar seu ciclo de vida\
c. Associação fraca, pois `Professor` é temporário\
d. Herança múltipla, pois `Departamento` herda de `Professor`\
e. Acoplamento rígido entre classes

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Agregação, pois `Departamento` referencia `Professor` sem gerenciar seu ciclo de vida**

</details>

## Questão 6

Qual a principal **diferença conceitual** entre **agregação** e **composição**?

a. A agregação permite múltiplos construtores, a composição não\
b. A composição implica existência compartilhada, a agregação não\
c. A composição define uma interface, a agregação não\
d. A agregação utiliza atributos públicos, a composição utiliza privados\
e. A composição implica exclusividade e dependência de ciclo de vida, a agregação não

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **e. A composição implica exclusividade e dependência de ciclo de vida, a agregação não**

</details>

## Questão 7

No relacionamento de **composição**, qual prática é mais adequada para reforçar o encapsulamento da parte?

a. Declarar a parte como `public static`\
b. Criar a parte via injeção de dependência externa\
c. Criar a parte no construtor da classe todo e não fornecer acesso externo direto\
d. Permitir que a parte seja substituída por instâncias externas\
e. Expô-la diretamente via atributo público

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Criar a parte no construtor da classe todo e não fornecer acesso externo direto**

</details>

## Questão 8

Considere as classes:

```java
public class Pedido {
    private Item[] itens;
}

public class Item {
    private Produto produto;
}
```

Assumindo que `Item` possa ser compartilhado entre vários pedidos, mas `Produto` é criado e destruído junto com o `Item`, os relacionamentos são, respectivamente:

a. Pedido–Item: composição; Item–Produto: agregação\
b. Pedido–Item: agregação; Item–Produto: composição\
c. Pedido–Item: herança; Item–Produto: composição\
d. Pedido–Item: associação; Item–Produto: associação\
e. Pedido–Item: composição; Item–Produto: herança

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Pedido–Item: agregação; Item–Produto: composição**

</details>

## Questão 9

Considere:

```java
public class Endereco {
    private String rua;
}

public class Cliente {
    private Endereco endereco;

    public Cliente(String rua) {
        this.endereco = new Endereco(rua);
    }
}
```

O relacionamento entre `Cliente` e `Endereco` pode ser classificado como:

a. Associação simples\
b. Agregação, pois `Endereco` é passado por parâmetro\
c. Composição, pois o `Cliente` controla completamente o ciclo de vida de `Endereco`\
d. Herança, pois `Cliente` estende `Endereco`\
e. Delegação, pois `Cliente` chama métodos de `Endereco`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Composição, pois o `Cliente` controla completamente o ciclo de vida de `Endereco`**

</details>

## Questão 10

Em qual cenário o relacionamento entre duas classes pode ser classificado como **associação bidirecional**?

a. Quando as classes compartilham atributos `static`\
b. Quando uma classe herda atributos da outra\
c. Quando ambas possuem referências mútuas e reconhecem o vínculo entre si\
d. Quando uma classe instancia a outra no método `main`\
e. Quando ambas usam tipos primitivos para se comunicar

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**c. Quando ambas possuem referências mútuas e reconhecem o vínculo entre si**

</details>

## Questão 11

Considere as classes:

```java
public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
```

```java
public class UsuarioView {
    public void exibirDetalhes(String nome, String email) {
        System.out.println("Usuário: " + nome);
        System.out.println("Email: " + email);
    }
}
```

```java
public class UsuarioController {
    private Usuario usuario;
    private UsuarioView view;

    public UsuarioController(Usuario usuario, UsuarioView view) {
        this.usuario = usuario;
        this.view = view;
    }

    public void atualizarTela() {
        view.exibirDetalhes(usuario.getNome(), usuario.getEmail());
    }
}
```

O método `atualizarTela()` executa corretamente porque:

a. A classe `UsuarioView` tem acesso direto aos atributos da classe `Usuario`\
b. O controlador atua como intermediário entre a representação e os dados\
c. A classe `UsuarioController` estende a classe `UsuarioView`\
d. O objeto `Usuario` é modificado diretamente pela visualização\
e. A classe `Usuario` envia comandos para atualizar a exibição

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**b. O controlador atua como intermediário entre a representação e os dados**

</details>

## Questão 12

Dado o seguinte cenário:

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPrecoComDesconto(double percentual) {
        return preco * (1 - percentual / 100);
    }

    public String getNome() {
        return nome;
    }
}
```

```java
public class ProdutoController {
    private Produto produto;

    public ProdutoController(Produto produto) {
        this.produto = produto;
    }

    public void mostrarPrecoPromocional(double desconto) {
        System.out.println("Preço com desconto: R$ " + produto.getPrecoComDesconto(desconto));
    }
}
```

A responsabilidade da classe `Produto` neste design é:

a. Controlar toda a lógica de apresentação do sistema\
b. Armazenar dados e implementar regras de negócio relacionadas ao produto\
c. Estender funcionalidades da classe `ProdutoController`\
d. Gerenciar os dados de exibição da promoção\
e. Comunicar-se diretamente com o usuário final

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Armazenar dados e implementar regras de negócio relacionadas ao produto**

</details>

## Questão 13

Considere:

```java
public class Cliente {
    private String nome;
    private boolean ativo;

    public Cliente(String nome) {
        this.nome = nome;
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void desativar() {
        ativo = false;
    }

    public String getNome() {
        return nome;
    }
}
```

```java
public class ClienteController {
    private Cliente cliente;

    public ClienteController(Cliente cliente) {
        this.cliente = cliente;
    }

    public void desativarCliente() {
        cliente.desativar();
    }

    public void exibirStatus() {
        System.out.println(cliente.getNome() + " está ativo? " + cliente.isAtivo());
    }
}
```

Qual das alternativas expressa corretamente o princípio aplicado nesse design?

a. A lógica de negócios e de apresentação estão fortemente acopladas\
b. A lógica de controle está separada da lógica de domínio\
c. A classe `Cliente` é responsável por exibir seu próprio estado\
d. A camada de controle manipula diretamente os atributos privados\
e. O código viola o princípio de responsabilidade única

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. A lógica de controle está separada da lógica de domínio**

</details>

## Questão 14

Analise:

```java
public class Pedido {
    private String codigo;
    private double valorTotal;

    public Pedido(String codigo, double valorTotal) {
        this.codigo = codigo;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
```

```java
public class TelaPedido {
    public void imprimirResumo(String codigo, double valor) {
        System.out.println("Pedido: " + codigo);
        System.out.println("Valor: R$ " + valor);
    }
}
```

```java
public class PedidoController {
    private Pedido pedido;
    private TelaPedido tela;

    public PedidoController(Pedido pedido, TelaPedido tela) {
        this.pedido = pedido;
        this.tela = tela;
    }

    public void mostrarPedido() {
        tela.imprimirResumo(pedido.getCodigo(), pedido.getValorTotal());
    }
}
```

Qual é a principal vantagem arquitetural desse design?

a. O controlador sabe como o pedido será exibido\
b. O pedido conhece os detalhes da tela\
c. Cada classe tem uma única responsabilidade bem definida\
d. O código não permite reutilização de componentes\
e. A lógica de exibição foi incorporada ao modelo de dados

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Cada classe tem uma única responsabilidade bem definida**

</details>

