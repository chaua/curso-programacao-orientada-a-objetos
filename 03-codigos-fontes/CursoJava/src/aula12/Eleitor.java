package aula12;

public class Eleitor {

    // Uma variável estática não pertence às
    // instâncias e sim a classe
    private static int numEleitores = 0;

    // Uso de variáveis estáticas é recomendado apenas para
    // criação de constantes
    // - se a constante (final) não for estática, todos objetos
    // terão o mesmo valor que não muda, e com isso estamos
    // gastando memória
    private static final int MAX_ELEITORES = 1000;

    private String nome;

    public Eleitor(String nome) {
        this.nome = nome;

        // Como a variável pertence à classe
        // acessamos através no nome da classe
        Eleitor.numEleitores++;

        System.out.println("Cadastrando eleitor " + numEleitores);
    }

    public String getNome() {
        return nome;
    }

    // Um método estático pode ser chamado sem a necessidade
    // de instanciar um objeto
    // Com isso, o método só pode acessar variáveis estáticas
    // Usado normalmente em classes utilitárias
    public static void imprimeMensagem() {
        System.out.println("Total de eleitores = " + Eleitor.numEleitores);
    }



}
