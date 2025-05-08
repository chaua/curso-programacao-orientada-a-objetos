package aula09;

// Palavra-chave extends indica que a classe ExemploDerivada
// herda atributos e métodos da classe ExemploBase

public class ExemploDerivada extends ExemploBase {

    // Construtores não são herdados
    // Construtores devem chamar o construtor da classe pai (primeira operacao)
    public ExemploDerivada() {
        super();    // Chamada para o construtor default da classe pai
        System.out.println("Chamando construtor ExemploDerivada()");
    }

    public ExemploDerivada(int valor) {
        super(valor); // Chamada do construtor com inicializacao do pai
        System.out.println("Chamando construtor ExemploDerivada(valor)");
    }

    public void decrementar() {
        item--;
    }

    // Sobrescrita de métodos
    // - Método da classe pai funciona diferente na classe filha
    @Override
    public void imprimir() {
        System.out.println("Novo imprimir! " + this.item);
        super.imprimir();
    }
}
