package aula10;

public class PizzaCalabresa extends Pizza {

    public PizzaCalabresa(String tamanho, String borda) {
        super("Calabresa", tamanho, borda, 45.00f);
    }

    @Override
    public void preparar() {
        System.out.println("Pizza " + sabor);
        System.out.println("- Ralar queijo");
        System.out.println("- Picotar calabresa");
        System.out.println("- Colocar tudo em cima da massa");
    }
}
