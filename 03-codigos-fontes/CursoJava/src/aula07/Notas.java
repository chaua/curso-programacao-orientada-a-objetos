package aula07;

public class Notas {
    // Declaração de constantes
    // static final => indica que é constante
    // convenção usar nome todo em maiúsculo separado por underscore
    private static final int NUM_NOTAS = 2;

    private double[] notas;

    public Notas() {
        notas = new double[NUM_NOTAS];
    }

    public void setNota1(double nota1) {
        // TODO: validar a nota
        this.notas[0] = nota1;
    }

    public void setNota2(double nota2) {
        // TODO: validar a nota
        this.notas[1] = nota2;
    }

    public double getMedia() {
        return (notas[0] + notas[1]) / 2;
    }

}
