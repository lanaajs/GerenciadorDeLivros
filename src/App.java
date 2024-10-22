public class App {
    public static void main(String[] args) throws Exception {
 

        Livro livro = new Livro();
        System.out.println("\n\nGERENCIADOR DE LIVROS");

        livro.titulo = "A Culpa é das Estrelas";
        livro.autor = "John Green";
        livro.ano = 2012;
        livro.disponivel = true;

        livro.exibirDetalhes();
        livro.emprestar();
        livro.devolver();
        
    }
}
