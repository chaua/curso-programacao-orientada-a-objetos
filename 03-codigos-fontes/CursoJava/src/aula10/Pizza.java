package aula10;

public abstract class Pizza {

    protected String sabor;
    private String tamanho;
    private String borda;
    private float preco;

    public Pizza(String sabor, String tamanho, String borda, float preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.borda = borda;
        this.preco = preco;
    }

    public abstract void preparar();

    public void assar() {
        System.out.println("Assando pizza!");
    }
    public void entregar() {
        System.out.println("Entregando pizza!");
    }
}
