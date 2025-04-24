# Encapsulamento

## Questão 1

O que o princípio do **encapsulamento** preconiza na programação orientada a objetos?

a. Compartilhar atributos diretamente entre todas as classes\
b. Esconder detalhes internos de implementação e expor apenas interfaces controladas\
c. Utilizar herança para acessar membros privados\
d. Tornar todos os atributos públicos para facilitar a manipulação\
e. Atribuir visibilidade `protected` a todos os métodos

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Esconder detalhes internos de implementação e expor apenas interfaces controladas**

</details>

## Questão 2

Considere a seguinte declaração de classe:

```java
public class Produto {
    public String nome;
    public double preco;
}
```

Este projeto **viola** o princípio de encapsulamento porque:

a. A classe está pública\
b. Os atributos podem ser modificados diretamente de qualquer parte do código\
c. A classe não possui construtor\
d. A classe não possui métodos abstratos\
e. Os atributos não são `static`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **b. Os atributos podem ser modificados diretamente de qualquer parte do código**

</details>

## Questão 3

Qual é a forma correta de aplicar **encapsulamento** aos atributos da classe `Pessoa`?

a. Declarar os atributos como `protected`\
b. Tornar os atributos `public` e criar métodos `get`\
c. Declarar os atributos como `private` e fornecer métodos `get` e `set` públicos\
d. Tornar os atributos `default` e utilizar interfaces\
e. Usar variáveis globais em outra classe

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Declarar os atributos como `private` e fornecer métodos `get` e `set` públicos**

</details>

## Questão 4

Qual alternativa apresenta uma **boa prática** de encapsulamento?

a. Permitir acesso direto aos atributos\
b. Expor métodos `get` e `set` apenas quando necessário\
c. Exigir que todo atributo tenha um `set`\
d. Usar `public` para facilitar testes\
e. Criar `get` e `set` automaticamente para todos os campos, sem exceção

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**b. Expor métodos `get` e `set` apenas quando necessário**

</details>

## Questão 5

Considere:

```java
public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
}
```

Qual aspecto do encapsulamento é bem representado no código acima?

a. Ocultação de herança\
b. Restrição de criação de objetos\
c. Controle de acesso aos atributos com validação\
d. Uso obrigatório de constantes\
e. Delegação de instâncias

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**c. Controle de acesso aos atributos com validação**

</details>

## Questão 6

Encapsulamento contribui para:

a. Aumento da visibilidade de dados internos\
b. Redução de reusabilidade\
c. Aumento da coesão e manutenção da integridade do objeto\
d. Implementação compulsória de interfaces\
e. Evitar o uso de classes abstratas

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Aumento da coesão e manutenção da integridade do objeto**

</details>

## Questão 7

Qual das alternativas descreve um **risco** ao se violar o encapsulamento?

a. Maior desempenho de execução\
b. Acesso restrito entre pacotes\
c. Perda de modularidade e dificuldade de manutenção\
d. Compilação mais rápida\
e. Uso obrigatório de `this`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Perda de modularidade e dificuldade de manutenção**

</details>

## Questão 8

Observe o trecho:

```java
public class Usuario {
    private String senha;

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        }
    }

    public String getSenha() {
        return "****";
    }
}
```

Qual das afirmativas é verdadeira?

a. O método `getSenha()` viola o encapsulamento\
b. O método `setSenha()` compromete a segurança da senha\
c. O encapsulamento é aplicado com controle de leitura e escrita\
d. O atributo deveria ser `protected` para permitir herança\
e. A senha não pode ser usada internamente na classe

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. O encapsulamento é aplicado com controle de leitura e escrita**

</details>

## Questão 9

Dado o código:

```java
public class Sensor {
    private int leitura;

    public void atualizar(int novaLeitura) {
        if (novaLeitura >= 0) {
            leitura = novaLeitura;
        }
    }

    public int ler() {
        return leitura;
    }
}
```

Esse padrão:

a. Evita o uso de atributos internos\
b. Demonstra violação de encapsulamento\
c. Implementa encapsulamento com validação\
d. Exige uso de herança para leitura\
e. Usa valores fixos, ignorando entrada do usuário

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Implementa encapsulamento com validação**

</details>

## Questão 10

Sobre modificadores de acesso em Java, assinale a alternativa que favorece **fortemente o encapsulamento**:

a. `public`\
b. `protected`\
c. `private`\
d. `default`\
e. `final`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. `private`**

**Justificativa:**\
O modificador `private` **restringe o acesso ao escopo interno da classe**, forçando o uso de métodos de acesso controlado (get/set) e promovendo o encapsulamento.

</details>

## Questão 11

Considere a classe a seguir:

```java
public class Conta {
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
```

Qual das alternativas representa corretamente uma **limitação de encapsulamento** nesse código?

a. A classe não impede a criação de instâncias com saldo negativo\
b. O método `consultarSaldo` expõe a lógica de cálculo do saldo\
c. O atributo `saldo` está público e pode ser modificado diretamente\
d. A classe deveria usar `final` nos métodos para preservar o estado\
e. O encapsulamento é quebrado por permitir alterações externas diretas no atributo `saldo`

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **a. A classe não impede a criação de instâncias com saldo negativo**

**Justificativa:** Embora `saldo` seja `private`, como **não há construtor**, é possível instanciar a classe e deixar `saldo` no valor padrão (0.0), o que pode ser interpretado como aceitável. No entanto, em cenários mais críticos, seria necessário garantir que o objeto seja **inicializado com um estado válido** (por exemplo, via construtor com verificação).

</details>

## Questão 12

Analise o código:

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
}
```

Em relação ao encapsulamento e à integridade do objeto, é correto afirmar:

a. O uso de `set` no construtor é desnecessário e prejudica encapsulamento\
b. A classe está mal encapsulada, pois `get` permite acesso aos atributos\
c. A invocação dos `setters` no construtor reforça o encapsulamento e validação centralizada\
d. A utilização de métodos públicos no construtor impede a criação de objetos\
e. O método `setPreco` deve lançar exceção para invalidar o objeto

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. A invocação dos `setters` no construtor reforça o encapsulamento e validação centralizada**

**Justificativa:** Reutilizar os `setters` no construtor garante que **todas as regras de validação de estado sejam aplicadas de forma uniforme**, evitando duplicação de lógica. Isso reforça o princípio de **encapsulamento interno com controle de integridade**.

</details>

## Questão 13

Considere o seguinte cenário:

```java
public class Aluno {
    private List<Double> notas = new ArrayList<>();

    public List<Double> getNotas() {
        return notas;
    }
}
```

Ao executar:

```java
Aluno a = new Aluno();
a.getNotas().add(10.0);
```

Qual o **problema de encapsulamento** nesse caso?

a. O atributo `notas` é `public`\
b. O método `getNotas` retorna uma cópia defensiva da lista\
c. O objeto `Aluno` viola o encapsulamento ao expor a referência interna da lista\
d. O código usa `List` ao invés de `ArrayList`, o que é um erro\
e. O método `add` deveria ser proibido em listas privadas

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. O objeto `Aluno` viola o encapsulamento ao expor a referência interna da lista**

**Justificativa:**\
Ao retornar diretamente a **referência interna da lista**, o método `getNotas()` permite **modificações externas** no estado da instância, o que **compromete a integridade** e **viola o encapsulamento estrutural**. A prática correta seria retornar uma **cópia imutável ou defensiva** da lista.

</details>

## Questão 14

Analise o código:

```java
public class Cliente {
    private String nome;
    private final String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
        }
    }
}
```

O encapsulamento está corretamente aplicado ao atributo `cpf`, pois:

a. O atributo pode ser modificado apenas via método `setCpf`\
b. O atributo é `protected`, permitindo acesso entre pacotes\
c. A ausência de um método `setCpf` e uso de `final` tornam o valor imutável após a construção\
d. A classe restringe acesso ao CPF por herança\
e. O método `getCpf()` é desnecessário pois `cpf` já é público

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. A ausência de um método `setCpf` e uso de `final` tornam o valor imutável após a construção**

**Justificativa:** O uso de `final` em atributos privados permite **encapsulamento de dados imutáveis**, restringindo a modificação do valor **apenas ao construtor** e tornando a instância mais segura e estável.

</details>

## Questão 15

Qual das práticas a seguir **fortalece o encapsulamento** ao se trabalhar com métodos `set`?

a. Permitir que os `setters` alterem atributos sem validação, para maior flexibilidade\
b. Criar `setters` para todos os atributos, mesmo que não sejam alteráveis\
c. Utilizar `setters` apenas para atributos cujo valor possa ser alterado após a construção\
d. Criar `setters` que modificam outros objetos além do próprio\
e. Garantir que `setters` nunca sejam usados internamente pela própria classe

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Utilizar `setters` apenas para atributos cujo valor possa ser alterado após a construção**

**Justificativa:** Encapsulamento **não exige obrigatoriedade de `setters`**; sua existência deve refletir **intenção de alteração legítima** de estado. Expor `setters` desnecessariamente aumenta o acoplamento e compromete a integridade.

</details>

