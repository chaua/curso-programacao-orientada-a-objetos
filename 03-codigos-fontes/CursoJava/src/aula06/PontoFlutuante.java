package aula06;

import java.math.BigDecimal;

public class PontoFlutuante {

    public static void main(String[] args) {
        double preco = 0;
        for (long i = 0; i < 100_000_000L; i++) {
            preco += 0.1;
        }
        System.out.println(preco);

        // int
        // classe

        // solucao
        // DECIMAL(10, 2)
        BigDecimal x = new BigDecimal(10);




    }
}
