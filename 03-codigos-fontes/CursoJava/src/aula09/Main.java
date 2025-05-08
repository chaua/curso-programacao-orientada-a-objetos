package aula09;

public class Main {
    public static void main(String[] args) {
        ExemploDerivada derivada = new ExemploDerivada();
        derivada.incrementar();
        derivada.imprimir();
        derivada.incrementar();
        derivada.imprimir();
        derivada.decrementar();
        derivada.imprimir();
        System.out.println("Herdado de Object: " + derivada.toString());

        ExemploDerivada derivada1 = new ExemploDerivada(100);
        derivada1.incrementar();
        derivada1.imprimir();


    }
}
