---
description: Comparação entre paradigmas estruturado e OO com exemplos em pseudocódigo.
---

# 💡 Aula 01 - Paradigmas de Programação

{% hint style="info" %}
## Material da aula

* Slides
{% endhint %}

## :orange\_book: Introdução

Paradigmas de programação são modelos que definem a estrutura e a forma de execução dos programas, influenciando diretamente o design, a legibilidade e a manutenção do código, tendo surgido à medida que as necessidades tecnológicas e teóricas evoluíram ao longo do tempo.

Os principais paradigmas de programação são:

* Imperativo
* Procedural
* Orientado a Objetos (OOP)
* Funcional
* Lógico
* Orientado a Eventos
* Concorrente/Paralelo
* Declarativo

## :orange\_book: Paradigma Imperativo

O paradigma imperativo é caracterizado pela execução de uma sequência de comandos que alteram o estado do programa, utilizando variáveis, laços de repetição e estruturas condicionais. Essa abordagem proporciona controle direto sobre o hardware, permitindo uma manipulação explícita dos recursos computacionais.

### Vantagens e Desvantagens

✅ Alto controle sobre a execução\
❌ Complexidade crescente em grandes sistemas

### Exemplos de Linguagens

* Assembly
* C
* Fortran

### Exemplo de Código (C)

```c
int soma = 0;
for (int i = 1; i <= 10; i++) {
    soma += i;
}
printf("Soma: %d", soma);
```

## :orange\_book: Paradigma Procedural

O paradigma procedural se caracteriza pela organização do código em procedimentos e funções, com ênfase na reutilização e na estruturação lógica das instruções, promovendo maior clareza e modularidade no desenvolvimento de programas.

### Vantagens e Desvantagens

✅ Redução de redundância\
❌ Dificuldade em modelar sistemas complexos

### Exemplos de Linguagens

* Pascal
* ALGOL
* COBOL

### Exemplo de Código (Pascal)

```pascal
procedure CalcularMedia;
var
    a, b, media: real;
begin
    read(a, b);
    media := (a + b) / 2;
    writeln('Média: ', media);
end;
```

## :orange\_book: Paradigma Orientado a Objetos

O paradigma orientado a objetos é caracterizado pela modelagem do software com base em objetos que encapsulam dados e comportamentos, sendo estruturado a partir de quatro pilares fundamentais: encapsulamento, que oculta os detalhes internos e expõe apenas interfaces essenciais; herança, que permite o reaproveitamento de atributos e métodos entre classes; polimorfismo, que possibilita múltiplas formas de um mesmo comportamento; e abstração, que foca nos aspectos relevantes dos objetos, omitindo detalhes desnecessários para facilitar o entendimento e a manutenção do sistema.

### Vantagens e Desvantagens

✅ Modularidade, escalabilidade e manutenção\
❌ Curva de aprendizado maior e possível overhead

### Exemplos de Linguagens

* Java
* C++
* Python
* C#
* Swift

### Pilares da POO

#### **Encapsulamento**

Oculta os dados internos e expõe apenas o necessário.

```java
class Conta {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }
}
```

#### **Herança**

Permite que uma classe herde atributos e métodos de outra.

```cpp
class Animal {
    public: void comer() { /*...*/ }
};

class Cachorro : public Animal {
    //...
};
```

#### **Polimorfismo**

Métodos com comportamentos diferentes conforme o contexto.

```java
class Veiculo {
    void mover() { /*...*/ }
}

class Carro extends Veiculo {
    void mover() { /*...*/ }
}
```

## :orange\_book: Paradigma Funcional

O paradigma funcional tem como principal característica o uso de funções como elementos centrais na construção dos programas, privilegiando a imutabilidade dos dados, o uso de funções puras — que não produzem efeitos colaterais — e a aplicação de funções de ordem superior, ou seja, funções que recebem outras funções como argumentos ou retornam funções como resultado. Esse modelo é especialmente adequado para contextos que demandam alto desempenho em processamento paralelo e aplicações em Big Data, devido à sua natureza declarativa e à facilidade de paralelização.

### Exemplos de Linguagens

* Haskell
* Lisp
* Erlang

### Exemplo de Código (Lisp)

```lisp
(defun factorial (N)
  "Compute the factorial of N."
  (if (= N 1)
      1
      (* N (factorial (- N 1)))))
```

***

## :orange\_book: Paradigma Lógico

O paradigma lógico é fundamentado em regras e inferência lógica, utilizando predicados e cláusulas de Horn como base para a representação e manipulação do conhecimento. Nesse modelo, a computação ocorre por meio da verificação de fatos e da dedução de novas informações a partir das regras definidas. É amplamente aplicado em áreas como Inteligência Artificial e sistemas especialistas, onde a capacidade de raciocínio lógico automatizado é essencial.

### Linguagem Principal

* Prolog

### Exemplo de Código

```prolog
pai(joao, maria).
avo(X, Y) :- pai(X, Z), pai(Z, Y).
% Consulta: avo(joao, X)?
```

## :orange\_book: Paradigma Orientado a Eventos

O paradigma orientado a eventos baseia-se na execução do programa em resposta a eventos externos, como cliques do usuário ou mensagens do sistema. Esse modelo utiliza estruturas como listeners e callbacks para detectar e reagir dinamicamente às interações, sendo amplamente empregado no desenvolvimento de interfaces gráficas e aplicações web, onde a interação em tempo real com o usuário é fundamental.

### Exemplos de Linguagens

* JavaScript
* C#

#### Exemplo de Código (JavaScript)

```javascript
button.addEventListener('click', () => {
    console.log('Botão clicado!');
});
```

## :orange\_book: Paradigma Concorrente/Paralelo

O paradigma concorrente ou paralelo é caracterizado pela execução simultânea de múltiplas tarefas, permitindo que diferentes partes de um programa sejam processadas de forma independente para melhorar o desempenho e a eficiência. Essa abordagem pode ser implementada por meio de diversos modelos, como threads, processos e atores, cada um com suas particularidades. No entanto, a programação concorrente impõe desafios complexos, como a ocorrência de condições de corrida (race conditions) e deadlocks, que exigem estratégias cuidadosas de sincronização e controle de acesso aos recursos compartilhados.

### Exemplos de Linguagens

* Go
* Java
* Rust

### Exemplo de Código (Java)

```java
public static void main(String[] args) {
    Runnable tarefa = () -> System.out.println("Thread rodando");
    new Thread(tarefa).start();
    System.out.println("Fim");
}
```

## :orange\_book: Paradigma Declarativo

O paradigma declarativo concentra-se em descrever “o quê” deve ser feito, em vez de especificar “como” a tarefa deve ser realizada, abstraindo os detalhes do controle de fluxo e da execução passo a passo. Ele engloba subparadigmas como o funcional e o lógico, além de linguagens como SQL, onde o programador define as propriedades do resultado desejado, e o mecanismo de execução se encarrega de determinar a melhor forma de alcançá-lo.

### Exemplo de Código (SQL)

```sql
SELECT nome
FROM cliente
WHERE idade > 30;
```

## :orange\_book: Comparação Entre Paradigmas

<table><thead><tr><th width="196.5">Paradigma</th><th width="361">Características</th><th>Linguagens</th></tr></thead><tbody><tr><td><strong>Imperativo</strong></td><td>Comandos sequenciais e alteração de estado</td><td>C, Fortran, Assembly</td></tr><tr><td><strong>Procedural</strong></td><td>Organização em funções e procedimentos</td><td>Pascal, ALGOL, COBOL</td></tr><tr><td><strong>Orientado a Objetos</strong></td><td>Objetos, encapsulamento, herança, polimorfismo</td><td>Java, Python, C++, Swift</td></tr><tr><td><strong>Funcional</strong></td><td>Imutabilidade, funções puras, cálculo lambda</td><td>Haskell, Lisp, Erlang</td></tr><tr><td><strong>Lógico</strong></td><td>Inferência com base em regras</td><td>Prolog</td></tr><tr><td><strong>Orientado a Eventos</strong></td><td>Resposta a eventos via listeners/callbacks</td><td>JavaScript, C#</td></tr><tr><td><strong>Concorrente/Paralelo</strong></td><td>Execução simultânea de tarefas</td><td>Go, Java, Rust</td></tr><tr><td><strong>Declarativo</strong></td><td>Foco no resultado, não no processo</td><td>SQL, XSLT, Prolog</td></tr></tbody></table>

* Sebesta, Robert W. _Concepts of Programming Languages_. 12ª edição. Pearson, 2021.
