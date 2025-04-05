package aula06;

public class Main {

    public static void main(String[] args) {
        Produto1 prod1 = new Produto1("PS5", 1, 15_000);
        prod1.imprime();

        algumaFuncao(prod1);
        prod1.imprime();

        algumaFuncao(prod1);
        prod1.imprime(); // exemplo de alteração que gera estado invalido

        // Outro exemplo
        Produto2 prod2 = new Produto2("PS6", 1, 30_000);
        prod2.imprime();

        prod2.setNome("switch 2");

        algumaFuncao(prod2);
        prod2.imprime();

        algumaFuncao(prod2);
        prod2.imprime(); // exemplo de alteração que gera estado invalido

    }

    private static void algumaFuncao(Produto1 prod1) {
        // ... Faz varias coisas
        prod1.quantidade--;
        // ... Faz outras
    }

    private static void algumaFuncao(Produto2 prod2) {
        // ... Faz varias coisas
        //prod2.quantidade--;
        prod2.decrementaQuantidade();
        // ... Faz outras
    }

}
