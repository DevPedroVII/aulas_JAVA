package packzin;

import java.util.Random;
import java.util.Scanner;

public class GeradorRandomico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem gerados: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            double numeroAleatorio = random.nextDouble();
            System.out.println("Número " + (i + 1) + ": " + numeroAleatorio);
        }

        System.out.println("Geração de números aleatórios concluída.");
    }
}
