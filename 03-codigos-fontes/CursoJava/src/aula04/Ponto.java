package aula04;

public class Ponto {
    public int x;
    public int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprime() {
        System.out.printf("Ponto(%d, %d)\n", x, y);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
