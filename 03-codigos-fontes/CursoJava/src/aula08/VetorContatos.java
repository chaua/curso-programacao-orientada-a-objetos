package aula08;

public class VetorContatos {

    // Definição de constates
    // - Usado para valores estaticos
    // - Usado para substituir valores "magicos"
    // - Facilita a legibilidade do código
    // - static final: indica que é uma constate
    private static final int NUM_CONTATOS = 50;

    private Contato[] contatos;
    private int topo;

    public VetorContatos() {
        contatos = new Contato[NUM_CONTATOS];
        topo = 0;
    }

    public void adiciona(Contato contato) {
        // TODO: Validar se topo < NUM_CONTATOS
        contatos[topo] = contato;
        topo++;
    }

    // TODO: Não expor o vetor de contatos
    public Contato[] getContatos() {
        return contatos;
    }

}
