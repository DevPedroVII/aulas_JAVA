package packzin;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<String> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String nomeLivro) {
        livros.add(nomeLivro);
        System.out.println(nomeLivro + " foi adicionado à biblioteca.");
    }

    public void listarLivros() {
        System.out.println("Livros na biblioteca:");
        for (String livro : livros) {
            System.out.println(livro);
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro("Dom Quixote");
        biblioteca.adicionarLivro("1984");
        biblioteca.adicionarLivro("O Grande Gatsby");

        biblioteca.listarLivros();
    }
}

