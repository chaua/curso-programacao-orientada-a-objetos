# Entrada e Saída de Dados

## :orange\_book: Saída de Dados

O objeto `System.out` permite **exibir informações no console**. Ele é um **objeto de saída padrão**, do tipo `PrintStream`.

### **Principais métodos**

| Método                 | Descrição                         |
| ---------------------- | --------------------------------- |
| `System.out.print()`   | Imprime sem quebrar a linha       |
| `System.out.println()` | Imprime e pula uma linha          |
| `System.out.printf()`  | Imprime formatado (como no C/C++) |

{% code title="Exemplo" %}
```java
System.out.print("Olá ");
System.out.print("mundo!");
// Saída: Olá mundo!

System.out.println("Olá");
System.out.println("mundo!");
// Saída: 
// Olá
// mundo!

double nota = 8.75;
System.out.printf("Nota final: %.2f\n", nota);
// Saída: Nota final: 8.75
```
{% endcode %}

* `%d` → inteiro
* `%f` → ponto flutuante
* `%s` → texto (string)
* `%n` → quebra de linha (alternativa ao )

## :orange\_book: Entrada de Dados

A classe `Scanner` permite **ler dados digitados pelo usuário** no terminal. Está disponível no pacote `java.util`.

{% code title="📌 Sintaxe" %}
```java
import java.util.Scanner;

Scanner entrada = new Scanner(System.in);
```
{% endcode %}

{% code title="🧪 Exemplo" %}
```java
import java.util.Scanner;

public class EntradaUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("\nResumo:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

        sc.close();
    }
}
```
{% endcode %}

### Cuidados ao Usar o `Scanner`

* **Sempre feche o scanner com `sc.close()`** ao final do uso.
* Quando alternar entre `nextLine()` e `nextInt()`, pode ser necessário **consumir a quebra de linha** com `sc.nextLine()` extra.

Exemplo de erro comum:

```java
int idade = sc.nextInt();
String nome = sc.nextLine(); // Pode ler uma linha vazia!
```

Solução:

```java
int idade = sc.nextInt();
sc.nextLine(); // consome o "Enter"
String nome = sc.nextLine();
```
