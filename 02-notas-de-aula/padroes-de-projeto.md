# 💻 Padrões de Projeto

## Descrição

Cada caso apresenta uma **situação-problema** e um código Java parcial que corresponde a um **Design Pattern**. Os alunos devem identificar o padrão, reorganizar ou completar o código e justificar a escolha.

## Caso 1: O Cofre Secreto

A sede da Corporação SafeTech possui um **cofre digital central**, acessado por diversos sistemas internos para armazenar dados criptografados. Esse cofre deve possuir **apenas uma instância** em toda a aplicação, para garantir a integridade da informação e evitar acesso concorrente não controlado.

No entanto, os auditores descobriram **múltiplas instâncias da classe `CofreDigital`** sendo criadas em pontos distintos do sistema. Isso representa um **grave problema de segurança**. A equipe de desenvolvimento foi encarregada de **reformular a estrutura do código** para que seja possível **garantir uma única instância** do cofre, independentemente de quantas chamadas sejam feitas.

**Análise do Código**

A seguir, é apresentado um trecho incompleto da classe `CofreDigital`. Os alunos devem identificar a ausência do padrão Singleton e implementar os elementos necessários:

```java
public class CofreDigital {
    
    private String dados;

    public CofreDigital() {
        System.out.println("Instância do Cofre criada.");
        this.dados = "";
    }

    public void armazenar(String dado) {
        this.dados = dado;
    }

    public String recuperar() {
        return this.dados;
    }
}
```

**Modificação com Singleton**

**Objetivo**: Refatorar a classe `CofreDigital` para que atenda aos requisitos do padrão **Singleton**, assegurando:

* Existência de **uma única instância** da classe.
* **Criação sob demanda** da instância (lazy initialization).
* **Impossibilidade de criação externa** de novas instâncias.

**Complementar a Classe**

Complete os seguintes elementos:

* Atributo estático privado que referencia a instância única.
* Construtor privado.
* Método estático `getInstance()` que retorna a instância única.

#### Perguntas de Fixação

1. **Por que o uso de um construtor público na versão original permite múltiplas instâncias?**
2. **Qual é a principal vantagem de centralizar o acesso a um recurso compartilhado via Singleton?**
3. **Em que situações o Singleton pode representar um risco ou limitação arquitetural?**

<details>

<summary>Solução</summary>

<pre class="language-java"><code class="lang-java"><strong>public class CofreDigital {
</strong>...
}
</code></pre>

</details>

## Caso 2: A Troca de Estratégia

Em um jogo de RPG, os personagens podem adotar diferentes estilos de ataque, dependendo da situação de combate. O personagem “Kiron”, por exemplo, pode **atacar com espada**, **lançar magia** ou **usar um arco**. Cada ataque possui regras de dano específicas.

No entanto, os programadores do jogo decidiram implementar todas as opções de ataque **com condicionais dentro da classe `Personagem`**, resultando em um código inflexível, difícil de manter e de estender com novos tipos de ataque.

Sua missão como desenvolvedor sênior é refatorar essa lógica utilizando o **padrão Strategy**, que permitirá alternar dinamicamente entre diferentes comportamentos de ataque **sem alterar a estrutura da classe `Personagem`**.

#### **Análise do Código**

A seguir, apresenta-se uma versão simplificada da classe `Personagem`, utilizando lógica baseada em condicionais:

```java
public class Personagem {
    
    public void atacar(String tipo) {
        if (tipo.equals("espada")) {
            System.out.println("Golpeia com espada!");
        } else if (tipo.equals("magia")) {
            System.out.println("Lança feitiço!");
        } else if (tipo.equals("arco")) {
            System.out.println("Dispara flecha!");
        }
    }
}
```

**Refatoração com Strategy**

**Objetivo**: Refatorar o código acima usando o padrão **Strategy**, de modo que o comportamento de ataque possa ser alterado em tempo de execução, via composição.

**Etapas Esperadas**

1. Criar uma **interface `EstrategiaAtaque`** com o método `executarAtaque()`.
2. Criar três implementações concretas:
   * `AtaqueEspada`
   * `AtaqueMagia`
   * `AtaqueArco`
3. Modificar a classe `Personagem` para que:
   * Possua um atributo do tipo `EstrategiaAtaque`
   * Exponha o método `setEstrategiaAtaque(...)`
   * Delegue o ataque à estratégia atual

#### Perguntas de Fixação

1. **Quais são as vantagens de usar o padrão Strategy neste contexto?**
2. **De que maneira o padrão facilita a adição de novas estratégias de ataque?**
3. **Qual seria o impacto de manter toda a lógica de ataque centralizada na classe `Personagem`?**

<details>

<summary>Solução</summary>

<pre class="language-java"><code class="lang-java"><strong>public interface EstrategiaAtaque {
</strong>...
}

public class AtaqueEspada implements EstrategiaAtaque {...}

public class AtaqueMagia implements EstrategiaAtaque {...}

public class AtaqueArco implements EstrategiaAtaque {...}

public class Personagem {
...
}
</code></pre>



</details>

## Caso 3: A Agência de Notícias

A agência `InfoAgora` distribui notícias em tempo real para diversos **canais de mídia** (televisão, portais online, podcasts etc.). Sempre que uma nova notícia é publicada, **todos os canais registrados devem ser automaticamente notificados** para repassar a informação ao público.

No entanto, o sistema atual exige que a equipe da agência **atualize manualmente cada canal**, inserindo código repetido sempre que uma nova notícia é inserida. Isso torna o sistema rígido, com alta duplicação de código e difícil manutenção.

Você foi chamado para refatorar a arquitetura da aplicação utilizando o padrão **Observer**, permitindo que os canais se **inscrevam (subscribe)** na agência e sejam automaticamente notificados toda vez que uma nova notícia for publicada.

**Análise do Modelo Atual**

A seguir, apresenta-se um código não-escalável da agência:

```java
public class AgenciaNoticias {

    public void publicarNoticia(String noticia) {
        System.out.println("Canal A: " + noticia);
        System.out.println("Canal B: " + noticia);
        System.out.println("Canal C: " + noticia);
    }
}
```

Esse código viola os princípios de extensibilidade: para adicionar um novo canal, seria necessário alterar diretamente a classe `AgenciaNoticias`.

**Implementação com Observer**

**Objetivo**: Refatorar a estrutura para adotar o padrão **Observer**, de modo que os canais se registrem na agência e recebam atualizações automaticamente.

**Etapas Esperadas**

1. Criar uma **interface `Observador`** com o método `atualizar(String noticia)`.
2. Criar a classe **`Canal`**, que implementa `Observador` (pode haver `CanalA`, `CanalB`, etc.).
3. Criar uma **interface `Sujeito`** (ou usar diretamente a classe `AgenciaNoticias`) com métodos:
   * `adicionarObservador(Observador o)`
   * `removerObservador(Observador o)`
   * `notificarObservadores(String noticia)`
4. Implementar a lógica de notificação na `AgenciaNoticias`.

#### Perguntas de Fixação

1. **Como o padrão Observer contribui para o princípio do baixo acoplamento?**
2. **Por que a adição de novos canais não exige alteração na `AgenciaNoticias`?**
3. **Quais problemas de escalabilidade são resolvidos por essa abordagem?**

<details>

<summary>Solução</summary>

```java
import java.util.ArrayList;
import java.util.List;

public interface Observador {
...
}

public class Canal implements Observador {
  ...
}

public class AgenciaNoticias {
    ...
}
```

</details>

## Caso 4: A Fábrica Misteriosa

A empresa de e-commerce **LojaFlex** vende produtos digitais e físicos: eBooks, cursos online, camisetas e acessórios. Cada tipo de produto requer uma lógica de criação distinta: eBooks recebem DRM, cursos precisam de matrícula automática, e produtos físicos geram ordem de expedição.

Atualmente, a lógica de criação está centralizada em um único método com diversos `if-else`, tornando o código rígido e propenso a erros ao adicionar novos tipos de produtos. Isso viola os princípios de **abertura e fechamento** (Open/Closed Principle).

Seu objetivo é reorganizar esse código utilizando o padrão **Factory Method**, permitindo a criação encapsulada de objetos conforme o tipo de produto, **sem modificar a classe cliente**.

#### **Análise do Código**

A seguir, apresenta-se uma versão simplificada e incorreta da lógica atual:

```java
public class Loja {

    public Produto criarProduto(String tipo) {
        if (tipo.equals("ebook")) {
            return new Ebook();
        } else if (tipo.equals("curso")) {
            return new CursoOnline();
        } else if (tipo.equals("camiseta")) {
            return new Camiseta();
        } else {
            return null;
        }
    }
}
```

Essa abordagem apresenta **alto acoplamento** entre a classe `Loja` e as classes concretas de produtos.

**Implementação com Factory Method**

**Objetivo**: Refatorar o código usando o padrão Factory Method para delegar a responsabilidade de criação às subclasses, promovendo extensibilidade e encapsulamento.

**Etapas Esperadas**

1. Criar uma **classe abstrata `Loja`** com o método **abstrato** `criarProduto()`.
2. Criar subclasses concretas de `Loja`:
   * `LojaEbook`
   * `LojaCursoOnline`
   * `LojaCamiseta`
3. Criar uma interface ou classe abstrata `Produto`.
4. Implementar as classes concretas:
   * `Ebook`, `CursoOnline`, `Camiseta`
5. A classe cliente deve apenas instanciar a loja correta e chamar `criarProduto()`.

#### Perguntas de Fixação

1. **Quais são os benefícios da separação da lógica de criação em subclasses?**
2. **De que forma o Factory Method contribui para a extensibilidade da aplicação?**
3. **Qual a diferença entre o padrão Factory Method e o uso direto de `new` com condicionais?**



<details>

<summary>Solução</summary>

```java
public interface Produto {

}

public class Ebook implements Produto {
}

public class CursoOnline implements Produto {
}

public class Camiseta implements Produto {
}

public abstract class Loja {
}

public class LojaEbook extends Loja {
}

public class LojaCursoOnline extends Loja {
}

public class LojaCamiseta extends Loja {
}
```

**Classe Cliente**

```java
public class Main {
    public static void main(String[] args) {
    }
}
```

</details>

## Caso 5: A Cafeteria Extensível

A cafeteria “Café++” implementou um sistema de pedidos onde cada **bebida base** (como café, chá ou chocolate) pode ser personalizada com **adicionais** como leite, chantilly ou caramelo. O sistema original cria uma subclasse para **cada combinação possível**, resultando em dezenas de classes como `CafeComLeite`, `CafeComLeiteEChantilly`, `ChocolatadoComCaramelo`, etc.

Esse modelo é insustentável e viola os princípios da orientação a objetos, principalmente o **princípio da composição sobre herança**. Você foi contratado para refatorar esse sistema utilizando o padrão **Decorator**, permitindo que **adicionais sejam aplicados dinamicamente** às bebidas, com reutilização de código e extensibilidade.

**Modelo Problemático**

```java
public class CafeComLeite {
    public double preco() {
        return 4.50;
    }
}
```

Há dezenas de classes como essa. O sistema está inchado, repetitivo e rígido.

**Implementação com Decorator**

**Objetivo**: Refatorar a estrutura com o padrão **Decorator**, permitindo que objetos de bebidas sejam **encapsulados por decoradores de adicionais**, que incrementam o preço e a descrição.

**Etapas Esperadas**

1. Criar a interface `Bebida` com os métodos:
   * `String getDescricao()`
   * `double getPreco()`
2. Criar classes concretas para as bebidas base:
   * `Cafe`, `Cha`, `Chocolate`
3. Criar classe abstrata `AdicionalDecorator` que **implementa `Bebida`** e **possui uma instância de `Bebida`**.
4. Implementar decoradores concretos:
   * `Leite`, `Chantilly`, `Caramelo`
5. Demonstrar uso em cadeia: `new Chantilly(new Leite(new Cafe()))`

#### Perguntas de Fixação

1. **Qual é a vantagem de usar composição com Decorator em vez de herança para representar adicionais?**
2. **Como o Decorator preserva a interface original (`Bebida`) mesmo após múltiplas composições?**
3. **Quais seriam os riscos de um sistema que implementa todas as variações via subclasses?**

<details>

<summary>Solução</summary>

```java
public interface Bebida {
}

public class Cafe implements Bebida {
}

public abstract class AdicionalDecorator implements Bebida {
}

public class Leite extends AdicionalDecorator {
}

public class Chantilly extends AdicionalDecorator {
}
```

**Classe Cliente**

```java
public class Main {
    public static void main(String[] args) {
    }
}
```

</details>

## Caso 6: O Construtor de Personagens

Em um novo jogo de RPG da empresa `ByteGames`, os personagens são altamente personalizáveis: os jogadores podem escolher o nome, raça, classe, arma, armadura, habilidades e até um animal de estimação. O construtor original da classe `Personagem` exige todos os dados no momento da criação, gerando **construtores longos, difíceis de entender e propensos a erro**.

O time de desenvolvimento deseja reformular essa criação utilizando o padrão **Builder**, de modo a permitir a construção passo a passo, com valores opcionais, e mantendo a imutabilidade da classe `Personagem`.

**Código Original com Construtor Telescópico**

```java
public class Personagem {
    private String nome;
    private String classe;
    private String raca;
    private String arma;

    public Personagem(String nome, String classe, String raca, String arma) {
        this.nome = nome;
        this.classe = classe;
        this.raca = raca;
        this.arma = arma;
    }
}
```

Problemas:

* Ordem de parâmetros difícil de lembrar.
* Difícil lidar com parâmetros opcionais.
* Pouca clareza na construção.

**Implementação com Builder**

**Objetivo**: Refatorar a criação de `Personagem` usando o padrão **Builder**, permitindo construção fluente, modular e segura.

**Etapas Esperadas**

1. Manter `Personagem` como classe imutável com atributos `final`.
2. Criar uma **classe estática interna `Builder`** com métodos encadeados (`withNome()`, `withClasse()`, etc.).
3. Criar o método `build()` que retorna a instância final de `Personagem`.

#### Perguntas de Fixação

1. **Quais são as vantagens do padrão Builder sobre construtores com muitos parâmetros?**
2. **Como o padrão Builder permite que a construção seja mais clara e segura?**
3. **Quais características o Builder compartilha com o padrão Factory Method?**

<details>

<summary>Solução</summary>

```java
public class Personagem {
    private final String nome;
    private final String classe;
    private final String raca;
    private final String arma;
...
}
```

**Classe Cliente**

```java
public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem.Builder()
...
}
```



</details>
