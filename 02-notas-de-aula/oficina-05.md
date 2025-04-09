---
description: Encapsulamento para modularização e integridade dos dados.
---

# 💻 Oficina 05

## Descrição

O jogo deve permitir que um **jogador** tente adivinhar um número secreto gerado aleatoriamente. A cada rodada:

* O número de tentativas deve ser contabilizado.
* Um **placar** deve armazenar a pontuação de cada jogador.
* Deve ser possível cadastrar jogadores com nomes distintos.

***

## Exercício 1

* **1.1**: Implemente a classe `Jogador` com os requisitos acima.
* **1.2**: Crie dois objetos da classe `Jogador`, utilizando o construtor e os métodos `get` e `set`.

### Classe `Jogador`

Representa o participante do jogo.

**Atributos**

* `private String nome`
* `private int tentativas`
* `private int pontuacao`

**Métodos obrigatórios**

* Construtor que recebe o nome do jogador.
* Getters e setters para os três atributos.
* `void incrementarTentativas()`: soma 1 às tentativas.
* `void atualizarPontuacao(int valor)`: soma o valor à pontuação atual.

***

## Exercício 2

* **2.1**: Implemente a classe `Placar`.
* **2.2**: Crie três jogadores, adicione-os ao placar e exiba o ranking.

### Classe `Placar`

Controla a classificação dos jogadores.

**Atributos**

* `private ArrayList<Jogador> ranking`

**Métodos obrigatórios**

* Construtor sem parâmetros que inicializa o ranking.
* `void adicionarJogador(Jogador j)`: adiciona jogador ao ranking.
* `void mostrarRanking()`: imprime nome e pontuação de cada jogador.

***

## Exercício 3

* **3.1**: Implemente a classe `Jogo` conforme os requisitos.
* **3.2**: Simule uma rodada com entrada manual de tentativas.
* **3.3**: Execute o jogo até o jogador acertar e atualize o placar.

### Classe `Jogo`

Representa a lógica de uma partida individual.

**Atributos**

* `private Jogador jogador`
* `private int numeroSecreto`

**Métodos obrigatórios**

* Construtor que recebe um jogador e sorteia um número aleatório entre 1 e 100.
* `String jogar(int tentativa)`: compara o valor com o número secreto:
  * Incrementa o contador de tentativas.
  * Retorna "maior", "menor" ou "acertou".
  * Se acertar, calcula e atualiza a pontuação do jogador (ex: `100 - tentativas * 10`).

***

## Exercício 4

* **4.1**: Implemente a classe `Main` com toda a lógica de execução do jogo.

### Classe `Main`

Ponto de entrada do programa.

**Requisitos**

* Permitir que o jogador informe o nome via `Scanner`.
* Criar um objeto `Jogador` e iniciar uma partida.
* Repetir as jogadas até o acerto.
* Exibir tentativas e pontuação final.
* Adicionar o jogador ao placar e exibir o ranking ao final.

***

## Dicas

* Use `Random rand = new Random();` e `rand.nextInt(100) + 1` para gerar o número secreto.
* Use `Scanner scanner = new Scanner(System.in);` para entrada de dados.
