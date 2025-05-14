package aula10;

public class Main {
    public static void main(String[] args) {
        Pizza4Queijos pizza1 = new Pizza4Queijos("G", "normal");
        Pizza4Queijos pizza2 = new Pizza4Queijos("M", "normal");
        PizzaCalabresa pizza3 = new PizzaCalabresa("M", "chocolate");

        pizza1.preparar();
        pizza2.preparar();
        pizza3.preparar();

        // Não é possível instanciar objetos pq a classe abstrata
        // é incompleta
        // Pizza pizza = new Pizza("magica", "M", "normal", 100);
        // pizza.preparar();

        // Criação de uma classe anônima
        // permite a instanciação
        Pizza pizza = new Pizza("magica", "M", "normal", 100) {
            @Override
            public void preparar() {
                System.out.println("Pizza " + sabor);
                System.out.println("- Ralar tudo que há magico");
                System.out.println("- Colocar tudo em cima da massa");
            }
        };

        pizza.preparar();

    }
}
