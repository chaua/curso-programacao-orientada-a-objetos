# 🤖 Aula 06 - Classe e Objetos

## Modificadores de Acesso e Encapsulamento

Em POO, proteger os dados internos de um objeto é uma **boa prática essencial para garantir a segurança, a integridade e a modularidade do sistema**. Para isso, utilizamos os chamados **modificadores de acesso**.

Esses modificadores controlam **quem pode acessar ou modificar os atributos e métodos de uma classe**. Em Java (e em muitas linguagens orientadas a objetos), temos quatro níveis principais de acesso.

### Modificadores de Acesso em Java

| Modificador | Visível para...                                      | Exemplo de uso         |
| ----------- | ---------------------------------------------------- | ---------------------- |
| `public`    | Todas as classes, em qualquer pacote                 | `public void falar()`  |
| `private`   | Apenas dentro da própria classe                      | `private String cpf;`  |
| `protected` | Dentro do mesmo pacote ou subclasses em outro pacote | `protected int idade;` |
| _(default)_ | Apenas dentro do mesmo pacote (sem palavra-chave)    | `String nome;`         |

Declarar **atributos como `private`** significa que **nenhuma outra classe pode acessá-los diretamente**, nem mesmo uma classe do mesmo pacote. O acesso só será possível **por meio de métodos da própria classe**, como os **getters** e **setters**.

**Motivos para usar atributos `private`:**

* Encapsulamento
* Controle de regras de negócios
* Manutenção e refatoração

### **Encapsulamento**

O **encapsulamento** é o princípio da POO que **protege os dados internos** de um objeto, permitindo que o acesso a eles seja **controlado**.

```java
public class Pessoa {
    private String nome; // protegendo o dado

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
```

> Sem o `private`, qualquer parte do código poderia fazer:
>
> `pessoa.nome = null;`
>
> Isso pode corromper o estado interno do objeto.

### **Controle de regras de negócio**

Ao expor apenas métodos públicos e manter os atributos privados, podemos **incluir validações** e **lógicas de negócio** no acesso aos dados.

```java
public void setIdade(int idade) {
    if (idade >= 0 && idade <= 150) {
        this.idade = idade;
    } else {
        System.out.println("Idade inválida!");
    }
}
```

Se o atributo fosse público, não haveria como impedir alguém de fazer:

```java
pessoa.idade = -999;
```

### **Facilidade de manutenção e refatoração**

Ao restringir o acesso direto, podemos **modificar a estrutura interna da classe** no futuro sem impactar outras partes do sistema, desde que os métodos públicos (a "interface" da classe) continuem os mesmos.

### Exemplos

Exemplo: Atributo público (má prática)

```java
public class Pessoa {
    public String nome;
}

Pessoa p = new Pessoa();
p.nome = ""; // Ninguém garante que isso é válido
```

Exemplo: Atributo privado com método público (boa prática)

```java
public class Pessoa {
    private String nome;

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }
}
```

### Métodos podem ser públicos ou privados

A escolha do modificador de acesso para métodos depende de **qual é o papel do método**:

* **`public`**: método faz parte da interface pública do objeto; deve ser usado por outras classes.
* **`private`**: método é auxiliar, usado apenas internamente, **não faz sentido ser visível externamente**.

```java
public class Pessoa {
    private void validarCpf(String cpf) {
        // apenas uso interno da classe
    }

    public void cadastrar(String cpf) {
        validarCpf(cpf);
        // lógica de cadastro
    }
}
```
