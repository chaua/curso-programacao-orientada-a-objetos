package aula12;

// Exemplo de classe imutável
// - Depois da criação não permite mais alteração dos atributos
// - Usado bastante em programação funcionalista
public class CaixaInt {

    private int valor;

    public CaixaInt(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
