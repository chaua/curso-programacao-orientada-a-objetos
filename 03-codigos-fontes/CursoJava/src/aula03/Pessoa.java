package aula03;
// Classe
//  - Classificação dos objetos

// Objeto
//  - Entidade do mundo real (possui existência)
//  - Todo objeto possui uma identidade

public class Pessoa {

    // ---------------------------------------------
    // Atributos (TAD: Modelo Matemático)
    // ---------------------------------------------
    // - Propriedades, Características, Dados
    // - Usados para descrever o meu objeto
    // - São as variáveis que descrevem o objeto

    String nome;
    int idade;
    String genero;

    int altura;
    float peso;

    String cpf;

    // ---------------------------------------------
    // Construtor
    // ---------------------------------------------
    // - Função especial que é chamado quando um objeto é criado
    //    - Precisa ter o mesmo nome da classe
    //    - Não possui tipo de retorno
    // - Usado APENAS para inicializar o objeto
    // ---------------------------------------------

    Pessoa(String nome,
           int idade,
           String genero,
           int altura,
           float peso,
           String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    Pessoa(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.genero = "Não informado";
        this.altura = 0;
        this.peso = 0;
        this.cpf = "Não informado";
    }


    // ---------------------------------------------
    // Métodos (TAD: Operações)
    // ---------------------------------------------
    // - Comportamentos, Ações, Métodos, Funções
    // - Usados para descrever o que o meu objeto faz
    // - São as funções que descrevem o objeto

    void andar() {
        System.out.println("Andando...");
    }

    void falar() {
        System.out.println("Falando...");
    }

    void dormir() {
        System.out.println("Dormindo...");
    }

    void comer() {
        System.out.println("Comendo...");
    }

    float calcularIMC() {
        float imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        return imc;
    }

    void conversar(Pessoa pessoa) {
        System.out.println("Conversando com " + pessoa.nome);
    }

    void identificarSe() {
        System.out.println("Meu nome é " + nome);
    }

    void mudarDeNome(String nome) {
        this.nome = nome;
    }

    void imprimirDados() {
        System.out.println("Nome..: " + nome);
        System.out.println("CPF...: " + cpf);
        System.out.println("Gênero: " + genero);
    }

}
