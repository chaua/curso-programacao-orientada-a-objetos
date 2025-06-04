package aula12;

// final = indica que variavel eh constante(nao pode mudar valor)
//       = indica que a classe nao pode ser herdada

public final class ExemploFinal {

    public ExemploFinal() {}

    // Indica que o objeto não sofre alteração
    // - Facilita leitura e entendimento de código
    public void cadastra(final Eleitor eleitor) {

        // Variavel numero nao pode ser alterada
        final int numero = 10;
        //numero = 100;   // ERRO!

        String nome = eleitor.getNome();

    }


}
