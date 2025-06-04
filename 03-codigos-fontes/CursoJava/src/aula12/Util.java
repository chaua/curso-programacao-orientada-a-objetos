package aula12;

public class Util {

    public static final int MAX_TAM = 10;
    public static final String IDIOMA = "pt-BR";

    private Util() {
        // Construtor privado - impede que a classe seja
        // instanciada ou herdada
        // Deve possuir apenas constantes e funções de uso
        // geral
    }

    public static String limpaString(String texto) {
        return texto.strip().toUpperCase();
    }


}
