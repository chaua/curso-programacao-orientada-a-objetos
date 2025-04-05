package aula06;

// POJO: plain old java object

// MVC: Model View Controller
//      Controller - Gerenciadores: Lógica da aplicação/ regras de negócios
//      View       - Apresentação: Ler/escrever na tela(janela, web, ...)
//      Model      - Entidade

// DAO/VO:
//      DAO - Data Access Object - BD, Txt, Json, ...
//      VO  - Value Object = Entidade

public class Produto1 {

    public String nome;
    public int quantidade;
    public double preco;

    // Se nenhum construtor for declarado
    // o compilador cria um construtor vazio
    // public Produto() {
    // }

    public Produto1(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void imprime() {
        System.out.printf("%10s - %02d - %.2f: total = %.2f\n", nome, quantidade, preco, quantidade * preco);
    }
}
