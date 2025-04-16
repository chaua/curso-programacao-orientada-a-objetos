package aula07;

public class Aluno {
    private String nome;
    private Notas notas;

    public Aluno(String nome) {
        this.nome = nome;

        // Composição
        // - Objeto criado junto com o Aluno
        // - Aluno deixa de existir - Notas vao junto
        this.notas = new Notas();
    }

    public void setNotas(double nota1, double nota2) {
        this.notas.setNota1(nota1);
        this.notas.setNota2(nota2);
    }

    public double getMedia() {
        return this.notas.getMedia();
    }

}
