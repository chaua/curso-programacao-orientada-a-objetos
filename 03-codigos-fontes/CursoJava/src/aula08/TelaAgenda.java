package aula08;

import java.util.Scanner;

public class TelaAgenda {

    private Scanner teclado;

    public TelaAgenda() {
        teclado = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("=== AGENDA DE ENDEREÇOS ===");
        System.out.println();
        System.out.println("# MENU #");
        System.out.println("# 1. Adicionar contato #");
        System.out.println("# 2. Listar contatos #");
        System.out.println("# 9. Sair #");
        System.out.println();
    }

    public int lerOpcao() {
        System.out.print(">: ");
        int opcao = teclado.nextInt();

        // Limpa o buffer - a leitura do int deixa o \n no buffer
        teclado.nextLine();
        return opcao;
    }

    public Contato exibirAdicionarContato() {
        System.out.println();
        System.out.println("# Adicionar Contato #");
        System.out.print("- Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.print("- Digite o email: ");
        String email = teclado.nextLine();

        System.out.print("- Digite o telefone: ");
        String telefone = teclado.nextLine();

        System.out.print("- Digite o aniversario (dd mm aaaa): ");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();
        teclado.nextLine();

        System.out.print("- Digite a rua: ");
        String rua = teclado.nextLine();

        System.out.print("- Digite o numero: ");
        String numero = teclado.nextLine();

        System.out.print("- Digite a bairro: ");
        String bairro = teclado.nextLine();

        System.out.print("- Digite a cidade: ");
        String cidade = teclado.nextLine();

        System.out.print("- Digite a estado: ");
        String estado = teclado.nextLine();

        // Cria o objeto para contato
        Contato contato = new Contato(nome, telefone, email);
        contato.setAniversario(dia, mes, ano);
        contato.getEndereco().setRua(rua);
        contato.getEndereco().setNumero(Integer.parseInt(numero));
        contato.getEndereco().setBairro(bairro);
        contato.getEndereco().setCidade(cidade);
        contato.getEndereco().setEstado(estado);

        return contato;
    }

    public void exibirListarContato(VetorContatos vetor) {
        System.out.println("# Listar Contatos #");

        for (Contato contato : vetor.getContatos()) {
            // Se a posição do vetor estiver vazia, termina o loop
            if (contato == null) {
                break;
            }

            // Exibe os dados do contato
            System.out.printf("| %20s |", contato.getNome());
            System.out.printf("| %20s |", contato.getEmail());
            System.out.printf("| %02d/%02d/%4d |",
                    contato.getAniversario().getDia(),
                    contato.getAniversario().getMes(),
                    contato.getAniversario().getAno());
            System.out.println();
        }
        System.out.println();
    }

}
