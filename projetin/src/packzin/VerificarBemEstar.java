package packzin;

import java.util.Scanner;

public class VerificarBemEstar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Olá! Como você está? ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("bem") || resposta.equalsIgnoreCase("bem, obrigado")) {
            System.out.println("Fico feliz em ouvir isso! :)");            
        } else {
            System.out.println("Sinto muito ouvir que você não está bem. 🙁");
            System.out.println("Receba um abraço virtual! *abraço*");
        }

        scanner.close();
    }
}
