public class Livro {

    // Atributos
    String titulo;
    String autor;
    int ano;
    boolean disponivel = true;

    public Livro() {
        this.titulo = "Nome do Livro";
        this.autor = "Autor";
        this.ano = 1900;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("\nTitulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponivel: " + (disponivel ? "Sim" : "Não"));
    }

    public boolean emprestar() {
        if (disponivel) {
            System.out.println("\nDISPONIVEL PARA EMPRESTIMO");
            disponivel = false;
            return true;
        } else {
            System.out.println("\nINDISPONIVEL PARA EMPRESTIMO");
            return false;
        }
    }

    public boolean devolver() {
        if (!disponivel) {
            System.out.println("\nLIVRO DEVOLVIDO COM SUCESSO");
            disponivel = true;
            return true;
        } else {
            System.out.println("\nLIVRO JÁ ESTÁ DISPONÍVEL");
            return false;
        }
    }
}
