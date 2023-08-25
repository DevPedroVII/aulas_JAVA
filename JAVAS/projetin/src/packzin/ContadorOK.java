package packzin;

import java.util.Scanner;

public class ContadorOK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        int contador = contarOK(texto);
        System.out.println("A palavra 'OK' aparece " + contador + " vezes.");
    }

    public static int contarOK(String texto) {
        int contador = 0;
        int index = texto.indexOf("OK");

        while (index != -1) {
            contador++;
            index = texto.indexOf("OK", index + 2); // Avança para a próxima ocorrência
        }

        return contador;
    }
}
