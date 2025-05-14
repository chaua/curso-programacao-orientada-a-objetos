package aula10;

public class Pizza4Queijos extends Pizza implements Imprimivel {

    public Pizza4Queijos(String tamanho, String borda) {
        super("4 Queijos", tamanho, borda, 45.00f);
    }

    @Override
    public void preparar() {
        System.out.println("Pizza " + sabor);
        System.out.println("- Ralar parmesão");
        System.out.println("- Ralar gorgonzola");
        System.out.println("- Ralar mussarela");
        System.out.println("- Ralar ricota");
        System.out.println("- Colocar tudo em cima da massa");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo pizza" + sabor);
    }
}
