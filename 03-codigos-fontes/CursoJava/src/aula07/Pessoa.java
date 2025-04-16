package aula07;

// Exemplo de agregação
public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;

        // Composição
        // - Objeto criado junto com a Pessoa
        // - Pessoa deixa de existir - Endereco vai junto
        // this.endereco = new Endereco();

        // Agregação
        // - Objetos coexistem sem relação com a
        // existencia
        this.endereco = endereco;
    }

    public Pessoa(String nome) {
        // Chamada do outro construtor
        // - 1. deve ser a primeira instrucao no construtor
        // - 2. usamos o this() para chamar
        this(nome, null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
