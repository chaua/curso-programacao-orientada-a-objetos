package aula07;

public class ExemploComposicao {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Batman");
        Aluno aluno2 = new Aluno("Hulk");

        aluno1.setNotas(7, 9);
        aluno2.setNotas(2, 4);

        System.out.println("Aluno1: " + aluno1.getMedia());
        System.out.println("Aluno2: " + aluno2.getMedia());



    }
}
