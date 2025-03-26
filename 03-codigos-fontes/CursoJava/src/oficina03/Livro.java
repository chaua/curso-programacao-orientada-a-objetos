package oficina03;/*


Título do livro
Autor
Número total de páginas
Página atual
Se está aberto (sim/não)
✅ Métodos:

    abrir()
        Torna o estado do livro "aberto".

Só altera se ainda estiver fechado.
fechar()

    Torna o estado do livro "fechado".

Só altera se estiver aberto.
virarPagina()

    Incrementa a página atual em 1.

Só pode ser executado se o livro estiver aberto e ainda não estiver na última página.
voltarPagina()

    Decrementa a página atual em 1.

Só pode ser executado se o livro estiver aberto e a página atual for maior que 1.
irParaPagina(int pagina)

    Leva diretamente à página especificada.

Só funciona se o livro estiver aberto e a página for válida (entre 1 e total de páginas).
 */

public class Livro {

    // ATRIBUTOS
    // - São sempre privados

    // Título do livro
    private String titulo;

    // Autor
    private String autor;

    // Número total de páginas
    private int totalPaginas;

    // Página atual
    private int paginaAtual;

    // Se está aberto (sim/não)
    private boolean estaAberto;

    // CONSTRUTORES
    // Função especial:
    //  - mesmo nome da classe
    //  - sem tipo de retorno
    // Usado apenas para inicializar o objeto - estado inicial

    // Construtor default - vazio
    public Livro() {
        this.titulo = "Não informado";
        this.autor = "Não informado";
        this.totalPaginas = 0;
        this.estaAberto = false;
        this.paginaAtual = 0;
    }

    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;

        // Nao são expostos na interface do construtor (parametros)
        // pq não faria sentido criar um novo livro ja aberto, e em
        // qqer pagina
        this.estaAberto = false;
        this.paginaAtual = 0;
    }

    // MÉTODOS

    public void abrir() {
        if (!estaAberto) {
            System.out.println("Abrindo o livro...");
            estaAberto = true;
        }
        else {
            System.out.println("Livro já estava aberto...");
        }
    }

    public void fechar() {
        if (estaAberto) {
            System.out.println("Fechando o livro...");
            estaAberto = false;
        }
        else {
            System.out.println("Livro já estava fechado...");
        }
    }

    public void virarPagina() {
        if (estaAberto && paginaAtual < totalPaginas) {
            System.out.printf("Virando para página %d\n", paginaAtual + 1);
            paginaAtual++;
        }
        else if (!estaAberto) {
            System.out.println("Impossível virar página - O livro está fechado");
        }
        else {
            System.out.println("Impossível virar página - Já está na última página!");
        }
    }

    public void voltarPagina() {
        if (estaAberto && paginaAtual > 0) {
            System.out.printf("Voltando para página %d\n", paginaAtual - 1);
            paginaAtual--;
        }
        else if (!estaAberto) {
            System.out.println("Impossível voltar página - O livro está fechado");
        }
        else {
            System.out.println("Impossível voltar página - Já está na primeira página!");
        }
    }

    public void irParaPagina(int pagina) {
        if (estaAberto && pagina > 0 && pagina < totalPaginas) {
            paginaAtual = pagina;
        }
        else if (!estaAberto) {
            System.out.printf("Impossível ir para página %d - O livro está fechado\n", pagina);
        }
        else {
            System.out.printf("Impossível ir para página %d - O livro tem apenas %d paginas\n", pagina, totalPaginas);
        }
    }

}
