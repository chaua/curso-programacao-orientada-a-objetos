package aula12;


public class Caixa<T> {

    private T valor;

    public Caixa(final T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

}
