package oficina05;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("item1");
        lista.add("item2");
        lista.add("item3");

        for (String item : lista) {
            System.out.println(item);
        }

        Random rand = new Random();

        for (int i = 0; i <= 10; i++) {
            System.out.println(rand.nextInt(100) + 1);
        }
    }
}
