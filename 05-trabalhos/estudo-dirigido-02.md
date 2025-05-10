# 📄 Estudo Dirigido 02

{% hint style="success" %}
## Instruções

* Entrega via **GitHub**
* Salvar os arquivos no diretório: `ed02/`
* Todos os códigos devem estar **documentados com Javadoc**
* **Data limite de entrega: 14/05**
{% endhint %}

## **1. Sistema Bancário**

Implemente um sistema bancário com uma classe base chamada `Conta`, e três subclasses: `ContaCorrente`, `ContaPoupanca` e `ContaSalario`. O sistema deve permitir as operações básicas de depósito, saque, transferência, aplicação de juros diários e impressão de extrato. As regras de aplicação de juros devem variar conforme o tipo de conta.

### **Especificação das Classes**

**Classe Base: `Conta`**

Atributos:

* `String cliente`
* `double saldo`

Métodos:

* `depositar(double valor)`
* `sacar(double valor)`
* `transferir(Conta destino, double valor)`
* `getSaldo() : double`
* `imprimirExtrato()`
* `aplicarJurosDiarios()`

**Subclasses:**

* `ContaCorrente`: aplica 0.1% de juros ao dia.
* `ContaPoupanca`: aplica 0.08% de juros ao dia.
* `ContaSalario`: **não aplica juros**.

Cada subclasse deve sobrescrever:

* `imprimirExtrato()` para incluir o tipo da conta.
* `aplicarJurosDiarios()` com o percentual adequado.

**Programa Principal:**

```java
// Classe Main para Teste
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios();

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}
```

## Jogo de RPG

Implemente uma hierarquia de classes representando personagens de um jogo de RPG. Todos os personagens possuem um nome, pontos de vida (HP) e pontos de ataque base. Cada subclasse implementa um comportamento específico para atacar e defender. Além disso, crie um método `usarHabilidadeEspecial()` com efeitos distintos por classe.

### **Especificação das Classes**

**Classe Base: `Personagem`**

Atributos:

* `String nome`
* `int hp`
* `int ataqueBase`

Métodos:

* `atacar(Personagem inimigo)`
* `defender(int dano)`
* `usarHabilidadeEspecial()`
* `status()`

**Subclasses:**

* `Guerreiro`: ataque físico forte, reduz dano recebido pela metade na defesa, habilidade especial: "Golpe Duplo" (2x ataque).
* `Mago`: ataque mágico, defesa fraca, habilidade especial: "Bola de Fogo" (ataque em área).
* `Arqueiro`: ataque médio com chance de ataque crítico, habilidade especial: "Chuva de Flechas" (3 ataques).

#### **Programa Principal:**

```java
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        g.status();
        m.status();
        a.status();

        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        g.status();
        m.status();
        a.status();
    }
}
```
