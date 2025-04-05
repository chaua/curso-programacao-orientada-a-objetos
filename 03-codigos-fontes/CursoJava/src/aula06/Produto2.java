package aula06;

// Encapsulamento - é um dos pilares da OO
// - Cada classe/objeto deve possuir apenas uma responsabilidade
// - Cada classe/objeto é responsável pelos seus atributos
// - Somente a classe/objeto que pode manipular os atributos internos
// - Alcançado através de modificadores de acesso
//      - atributo é SEMPRE privado
public class Produto2 {

    private String nome;
    private int quantidade;
    private int preco;

    // Se nenhum construtor for declarado
    // o compilador cria um construtor vazio
    // public Produto() {
    // }

    public Produto2() {
        // Chamar outro construtor mais completo - usamos o this()
        // - Obrigatório ser a primeira chamar
        this("", 0, 0.0);
    }

    public Produto2(String nome, int quantidade, double preco) {
        this.setNome(nome);
        this.quantidade = quantidade;
        this.setPreco(preco);
    }

    public void imprime() {
        System.out.printf("%10s - %02d - %.2f: total = %.2f\n", nome, quantidade, preco, quantidade * preco);
    }

    // Solução 1: fornece um método específico para alterar o atributo
    public void decrementaQuantidade() {
        if (quantidade > 0) {
            this.quantidade--;
        } else {
            System.out.println("Erro! quantidade = 0");
        }

        // Avisar o main que não foi possível:
        // - retornar um boolean
        // - lançar uma exceção (+ elegante)
    }

    // Solução 2: métodos mutantes e acessores (setters/getters)

    // Setter / Mutante: altera o valor de um atributo
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setPreco(double preco) {
        int real = (int) preco * 100;
        if (preco >= 0) {
            this.preco = real;
        }
    }

    // Getter / Acessor: recupera o valor de um atributo
    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return preco / 100.0;
    }

    public double getTotal() {
        return preco * quantidade;
    }


}
