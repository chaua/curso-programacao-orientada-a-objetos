package aula12;

public class MainGenerico {
    public static void main(String[] args) {

        CaixaInt caixaInt = new CaixaInt(10);
        CaixaString caixaString = new CaixaString("banana");
        
        Caixa<Integer> caixa1 = new Caixa<>(12);
        Caixa<String> caixa2 = new Caixa<>("banana");
        Caixa<Boolean> caixa3 = new Caixa<>(true);
        Caixa<Eleitor> caixa4 = new Caixa<>(new Eleitor("Jose"));
        Caixa<Caixa<Double>> caixa5 = new Caixa<>(new Caixa<>(12.0));

    }


}
