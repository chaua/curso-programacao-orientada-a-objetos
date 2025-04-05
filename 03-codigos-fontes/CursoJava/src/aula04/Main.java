package aula04;

public class Main {

    public static void zerarPonto(Ponto ponto) {
        ponto.x = 0;
        ponto.y = 0;

        System.out.println("Entrou: " + ponto);
        ponto.imprime();
        System.out.println("Saiu");
    }


    public static void main(String[] args) {
        Ponto p1 = new Ponto(2, 3);
        System.out.println(p1);

        Ponto p2 = new Ponto(4, 5);
        System.out.println(p2);

        p1.imprime();
        p2.imprime();

        if (p1 == p2) {
            System.out.println("Mesmo objeto");
        } else {
            System.out.println("Objetos distintos");
        }




        p2 = p1;    // O que acontece???
        System.out.println("p2 = p1;");
        System.out.println(p1);
        System.out.println(p2);

        p2.x = -999;
        p2.y = -888;

        p1.imprime();
        p2.imprime();

        if (p1 == p2) {
            System.out.println("Mesmo objeto");
        } else {
            System.out.println("Objetos distintos");
        }

        // Passagem de parametros por referencia
        zerarPonto(p1);

        p1.imprime();


    }

}
