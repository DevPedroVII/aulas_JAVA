package packzin;

public class ContadorDeMimDePapai {
    public static void main(String[] args) {
        String texto = "Ela mim deu algo, depois ela mim deu outra coisa, e ela mim deu mais uma vez.";

        int contador = contarOcorrencias(texto, "ela mim deu");
        
        if (contador > 0) {
            System.out.println("AUUUUUUUUU!");
            System.out.println("Ela te deu " + contador + " vezes!");
        } else {
            System.out.println("Cara triste, ela não te deu nenhuma vez...");
        }
    }

    public static int contarOcorrencias(String texto, String palavra) {
        int contador = 0;
        int indice = texto.indexOf(palavra);
        
        while (indice != -1) {
            contador++;
            indice = texto.indexOf(palavra, indice + 1);
        }
        
        return contador;
    }
}
