# Paradigmas de programação

## Questão 1&#x20;

O paradigma de programação **estruturada** é caracterizado principalmente por:

a. Reutilização de código por meio de herança entre objetos\
b. Uso intensivo de chamadas de eventos assíncronos\
c. Organização do código em classes com atributos e métodos\
d. Controle do fluxo por estruturas como sequência, decisão e repetição\
e. Comunicação entre objetos por meio de mensagens

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. Controle do fluxo por estruturas como sequência, decisão e repetição**

**Justificativa:** A programação estruturada baseia-se em estruturas de controle de fluxo bem definidas (sequência, decisão, laços). As alternativas a, c e e são características da programação orientada a objetos. A alternativa b é associada à programação orientada a eventos.

</details>

## Questão 2&#x20;

Em qual das opções abaixo a programação **orientada a objetos** difere essencialmente da programação estruturada?

a. Uso de arquivos texto para entrada e saída\
b. Separação entre dados e lógica de controle\
c. Implementação de algoritmos de ordenação e busca\
d. Organização do código em torno de entidades com estado e comportamento\
e. Uso de variáveis globais para compartilhamento de dados

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. Organização do código em torno de entidades com estado e comportamento**

**Justificativa:** A programação orientada a objetos organiza o código com base em objetos que encapsulam dados (estado) e métodos (comportamento).

As alternativas a e c são comuns a diversos paradigmas. \
A alternativa b descreve a separação típica da programação estruturada. \
A alternativa e é considerada uma má prática e não caracteriza especificamente nenhum paradigma.

</details>

## Questão 3

Considere os dois trechos de código abaixo, escritos em pseudocódigo:

**Código A:**

```
entrada: nome, idade
imprimir("Nome: " + nome)
imprimir("Idade: " + idade)
```

**Código B:**

```
classe Pessoa:
    atributos: nome, idade
    método apresentar():
        imprimir("Nome: " + nome)
        imprimir("Idade: " + idade)

p = novo Pessoa("Maria", 30)
p.apresentar()
```

Com base nos paradigmas de programação, é correto afirmar que:

a. O Código A é orientado a objetos e o Código B é estruturado\
b. Ambos os códigos seguem o paradigma estruturado\
c. O Código A ignora completamente o uso de variáveis\
d. O Código B encapsula comportamento e dados, caracterizando o paradigma OO\
e. Ambos os códigos são equivalentes em estrutura e conceito

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **d. O Código B encapsula comportamento e dados, caracterizando o paradigma OO**

**Justificativa:** O Código B define uma classe com atributos e um método, configurando encapsulamento – característica central da POO. O Código A apenas executa comandos sequenciais, típico do paradigma estruturado.&#x20;

A alternativa a está invertida. \
A alternativa c é falsa, pois o Código A usa variáveis. \
A alternativa e é incorreta, pois os paradigmas são distintos.

</details>

## Questão 4&#x20;

Em relação aos paradigmas de programação, assinale a alternativa **incorreta**:

a. A programação estruturada favorece a decomposição funcional do problema\
b. A programação orientada a objetos utiliza abstração para modelar entidades do mundo real\
c. A modularização em POO é baseada em funções independentes e sequenciais\
d. A reutilização de código em POO ocorre frequentemente por meio de herança\
e. O encapsulamento promove ocultação dos detalhes internos de uma classe

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. A modularização em POO é baseada em funções independentes e sequenciais**

**Justificativa:** A alternativa c descreve uma característica da programação estruturada, não da POO.&#x20;

Em POO, a modularização é centrada em classes e objetos. As demais afirmativas estão corretas conforme a definição clássica dos paradigmas.

</details>

## Questão 5

Considere os seguintes critérios para comparar os paradigmas estruturado e orientado a objetos:

| Critério                  | Estruturado | Orientado a Objetos |
| ------------------------- | ----------- | ------------------- |
| Reutilização de código    | Baixa       | Alta                |
| Facilidade de manutenção  | Média       | Alta                |
| Organização do código     | Funções     | Classes/Objetos     |
| Modelagem de domínio real | Limitada    | Facilitada          |

A partir da tabela, é possível inferir que a principal **vantagem prática** da POO sobre a programação estruturada está em:

a. Redução da complexidade sintática do código\
b. Eliminação da necessidade de laços de repetição\
c. Facilidade em representar entidades e relacionamentos reais\
d. Uso exclusivo de programação gráfica e interfaces\
e. Substituição completa do paradigma estruturado em todos os contextos

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> &#x20;**c. Facilidade em representar entidades e relacionamentos reais**

**Justificativa:** A POO permite modelar objetos do mundo real com atributos e comportamentos, facilitando o mapeamento entre a realidade e o software.

A alternativa a é incorreta, pois a POO tende a ter sintaxe mais complexa. \
A alternativa b é falsa: laços continuam sendo usados. \
A alternativa d não caracteriza o paradigma. \
A alternativa e é incorreta, pois o paradigma estruturado ainda é aplicável em muitos contextos.

</details>

## Questão 6&#x20;

Analise as afirmações a seguir:

I. A programação orientada a objetos é sempre superior à estruturada, independentemente do problema.\
II. A programação estruturada é mais indicada em scripts curtos ou com fluxo linear simples.\
III. O uso de herança, polimorfismo e encapsulamento facilita a manutenção e extensão de sistemas complexos.\
IV. Paradigmas não são mutuamente exclusivos e podem coexistir em sistemas híbridos.

Assinale a alternativa correta:

a. Apenas I está correta\
b. Apenas II e III estão corretas\
c. Apenas II, III e IV estão corretas\
d. Todas estão corretas\
e. Apenas IV está correta

<details>

<summary><span data-gb-custom-inline data-tag="emoji" data-code="270f">✏️</span> Resposta</summary>

> **c. Apenas II, III e IV estão corretas**

**Justificativa:** A afirmação I é incorreta por ser absoluta; há contextos em que a programação estruturada é mais adequada.\
As afirmações II, III e IV são compatíveis com a literatura e prática da Engenharia de Software. Paradigmas podem coexistir em soluções híbridas (ex: uso de scripts estruturados em sistemas orientados a objetos).

</details>

