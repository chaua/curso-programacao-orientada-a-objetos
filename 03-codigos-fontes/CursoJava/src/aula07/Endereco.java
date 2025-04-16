package aula07;

public class Endereco {
    private String rua = "";
    private int numero = 0;
    private String bairro = "";
    private String cidade = "";
    private String estado ="";
    private String cep ="";

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.err.println("Nao existe numero de casa negativo!");
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (estado.length() == 2) {
            this.estado = estado.toUpperCase();
        } else {
            System.err.println("Estado deve ter 2 caracteres.");
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
