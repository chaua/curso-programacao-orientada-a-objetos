package aula08;

public class ControleAgenda {

    // Tela da aplicação
    private TelaAgenda tela = new TelaAgenda();

    // Lista de contatos
    private VetorContatos contatos = new VetorContatos();

    public void executar() {

        // Controla o loop principal
        boolean saida = false;

        // Loop principal
        do {
            // Imprime menu
            tela.exibirMenu();

            // Le a opcao do usuario
            int opcao = tela.lerOpcao();

            switch (opcao) {
                // 1. Insere contato
                case 1:
                    Contato contato = tela.exibirAdicionarContato();
                    contatos.adiciona(contato);
                    break;

                // 2. Lista contatos
                case 2:
                    tela.exibirListarContato(contatos);
                    break;

                // 9. Sair
                case 9:
                    saida = true;
                    break;
                default:
                    System.err.println("Opção inválida!");
            }

        } while(!saida);
    }

}
