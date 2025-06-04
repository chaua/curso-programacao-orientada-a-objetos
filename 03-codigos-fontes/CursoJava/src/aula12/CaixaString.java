package aula12;

// Exemplo de classe imutável
// - Depois da criação não permite mais alteração dos atributos
// - Usado bastante em programação funcionalista
public class CaixaString {

    private String valor;

    public CaixaString(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
