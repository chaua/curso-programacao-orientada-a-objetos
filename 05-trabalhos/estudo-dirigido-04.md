# 📄 Estudo Dirigido 04

{% hint style="success" %}
## Instruções

* Entrega via **GitHub**
* Salvar os arquivos no diretório: `ed04/`
* Todos os códigos devem estar **documentados com Javadoc**
* **Data limite de entrega: 11/05**
{% endhint %}

## Agenda de Contatos

### **Especificação do Sistema**

A aplicação deve permitir:

* Cadastro, listagem, atualização e exclusão de contatos.
* Diferenciação entre tipos de contatos (Pessoa Física e Pessoa Jurídica).
* Validação de dados básicos (nome obrigatório, CPF/CNPJ válidos, etc.).
* Exibição das informações em formato tabular na interface textual.

### **Requisitos de Modelagem**

<mark style="background-color:orange;">**Entidade (Model)**</mark>

* Interface `Contato`: define os métodos públicos obrigatórios.
* Classe abstrata `ContatoBase`: contém atributos comuns como `nome`, `telefone` e `email`.
* Classes concretas:
  * `PessoaFisica`: possui o atributo `cpf`.
  * `PessoaJuridica`: possui o atributo `cnpj`.

<mark style="background-color:orange;">**Apresentação (View)**</mark>

* Classe `ContatoView`: responsável pela entrada e exibição de dados no console.

<mark style="background-color:orange;">**Controle (Controller)**</mark>

* Classe `ContatoController`: orquestra a lógica da aplicação, manipulando a lista de contatos (armazenamento em memória).

### **Regras de Negócio**

* CPF deve conter 11 dígitos numéricos; CNPJ, 14.
* O campo nome é obrigatório e deve conter no mínimo 3 caracteres.
* Contatos devem ser únicos com base em CPF ou CNPJ.

### **Requisitos Técnicos**

* Encapsulamento: todos os atributos devem ser `private`, com métodos `get` e `set` conforme necessário.
* Herança: uso de uma superclasse abstrata e implementação de interface.
* Polimorfismo: uso de coleções do tipo `Contato`, com instâncias de `PessoaFisica` e `PessoaJuridica`.
* Utilização de estruturas de dados como `ArrayList`.

### **Diagrama de Classes**&#x20;

```mermaid
classDiagram
    direction TB

    class Contato {
        <<interface>>
        +getNome(): String
        +getTelefone(): String
        +getEmail(): String
    }

    class ContatoBase {
        -nome: String
        -telefone: String
        -email: String
        +getNome(): String
        +setNome(String): void
        +getTelefone(): String
        +setTelefone(String): void
        +getEmail(): String
        +setEmail(String): void
    }

    class PessoaFisica {
        -cpf: String
        +getCpf(): String
        +setCpf(String): void
    }

    class PessoaJuridica {
        -cnpj: String
        +getCnpj(): String
        +setCnpj(String): void
    }

    class ContatoController {
        -contatos: List~Contato~
        +adicionar(Contato): void
        +remover(String): void
        +listar(): void
    }

    class ContatoView {
        +exibirMenu(): void
        +mostrarContatos(List~Contato~): void
    }

    Contato <|.. ContatoBase
    ContatoBase <|-- PessoaFisica
    ContatoBase <|-- PessoaJuridica
    Contato --> ContatoController : utiliza
    Contato --> ContatoView : utiliza

```
