# 📄 Estudo Dirigido 01

{% hint style="success" %}
## Instruções

* Entrega via **GitHub**
* Salvar os arquivos no diretório: `ed01/`
  * `Jogador.java`
  * `Placar.java`
  * `Jogo.java`
  * `Main.java`
* Todos os códigos devem estar **documentados com Javadoc**
* **Data limite de entrega: 19/04**
{% endhint %}

## 🕹️ Descrição Geral

O jogo deve permitir que um **jogador** tente adivinhar um número secreto gerado aleatoriamente. A cada rodada:

* O número de tentativas deve ser contabilizado.
* Um **placar** deve armazenar a pontuação de cada jogador.
* Deve ser possível cadastrar jogadores com nomes distintos.

***

## :bricks: Estrutura de Classes

### :small\_blue\_diamond: 1. Classe Jogador

Representa o participante do jogo.

#### Atributos:

* `private String nome`
* `private int tentativas`
* `private int pontuacao`

#### Métodos obrigatórios:

* Construtor que recebe o nome do jogador.
* Getters e setters para os três atributos.
* `void incrementarTentativas()`: soma 1 à quantidade de tentativas.
* `void atualizarPontuacao(int valor)`: soma pontos ao jogador.

### :small\_blue\_diamond: 2. Classe Placar

Responsável por armazenar e exibir a pontuação dos jogadores.

#### Atributos:

* `private ArrayList<Jogador> ranking`

#### Métodos obrigatórios:

* Construtor sem parâmetros.
* `void adicionarJogador(Jogador j)`
* `void mostrarRanking()`: exibe nome e pontuação dos jogadores.

### :small\_blue\_diamond: 3. Classe Jogo

Gerencia a lógica da rodada de adivinhação.

#### Atributos:

* `private Jogador jogador`
* `private int numeroSecreto`

#### Métodos obrigatórios:

* Construtor que recebe um jogador e sorteia um número aleatório entre 1 e 100.
* `String jogar(int tentativa)`:
  * Incrementa as tentativas.
  * Informa se o número é "maior", "menor" ou "acertou".
  * Atualiza a pontuação se acertar.

### :small\_blue\_diamond: Main

Classe principal que executa o programa.

#### Funcionalidades:

* Solicitar nome do jogador via `Scanner`.
* Instanciar `Jogador` e `Jogo`.
* Executar o loop do jogo até acerto.
* Exibir tentativas e pontuação final.
* Atualizar e exibir o ranking com `Placar`.

***

## :bulb: Dicas

{% hint style="info" %}
## Para gerar o número secreto

```java
Random rand = new Random();
int numero = rand.nextInt(100) + 1;
```
{% endhint %}

{% hint style="info" %}
## Para entrada de dados

```java
Scanner teclado = new Scanner(System.in);
```
{% endhint %}

{% hint style="info" %}
## Pontuação

Calcule a pontuação de forma proporcional ao número de tentativas, por exemplo: `pontuacao = 100 - tentativas * 10;`
{% endhint %}

{% hint style="info" %}
## Ranking

Utilize `ArrayList` para gerenciar a lista de jogadores no placar.
{% endhint %}

***

## :white\_check\_mark: Critérios de Avaliação

| Critério                              | Peso |
| ------------------------------------- | ---- |
| Uso correto de construtores           | 2,0  |
| Implementação de getters e setters    | 2,0  |
| Instanciação e manipulação de objetos | 2,0  |
| Organização e clareza do código-fonte | 2,0  |
| Funcionalidade geral da aplicação     | 2,0  |
