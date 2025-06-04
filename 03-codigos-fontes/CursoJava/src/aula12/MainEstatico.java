package aula12;

public class MainEstatico {
    public static void main(String[] args) {
        Eleitor eleitor1 = new Eleitor("Scooby-doo");
        Eleitor eleitor2 = new Eleitor("Fred");
        Eleitor eleitor3 = new Eleitor("Daphne");
        Eleitor eleitor4 = new Eleitor("Velma");

        Eleitor.imprimeMensagem();

        // Exemplo de classe utilitária: Math
        double valor1 = Math.sqrt(100);
        double valor2 = Math.round(1.99);

    }
}
