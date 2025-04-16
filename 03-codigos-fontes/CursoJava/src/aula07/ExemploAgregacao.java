package aula07;

public class ExemploAgregacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Batman");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua da batcaverna");
        endereco.setCidade("Gotham City");

        pessoa.setEndereco(endereco);

        // x = pessoa.getEndereco() -> retorna uma referencia para o endereco
        // x.getRua() -> retorna a rua

        Endereco x = pessoa.getEndereco();
        System.out.println(
                "Nome....: " + pessoa.getNome() + "\n"
              + "Rua.....: " + pessoa.getEndereco().getRua() + "\n"
              + "Cidade..: " + pessoa.getEndereco().getCidade() + "\n"
              + "Estado..: " + pessoa.getEndereco().getEstado() + "\n"
        );

    }
}
