package aula09;

// Todas classes em java sao filhas da classe Object

public class ExemploBase{

    // protected (protegido) -
    //  - atributos/metodos sao privados para mundo externo
    //    mas visiveis na estrutura hierarquica de heranca
    protected int item;

    ExemploBase() {
        item = 0;
        System.out.println("Chamando construtor ExemploBase()");
    }

    ExemploBase(int num) {
        item = num;
        System.out.println("Chamando construtor ExemploBase(valor)");
    }

    public void incrementar() {
        item++;
    }

    public void imprimir() {
        System.out.println(item);
    }

}
