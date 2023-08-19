package packzin;

import java.util.Scanner;

public class MiniJogoVerdadeiroFalso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontuacaoTotal = 0;

        System.out.println("Bem-vindo ao Mini Jogo Verdadeiro ou Falso!");

        while (true) {
            System.out.println("Pergunta 1: Java é uma linguagem de programação. (true/false)");
            boolean resposta1 = scanner.nextBoolean();
            if (resposta1) {
                pontuacaoTotal += 2;
            }

            System.out.println("Pergunta 2: A Terra é plana. (true/false)");
            boolean resposta2 = scanner.nextBoolean();
            if (!resposta2) {
                pontuacaoTotal += 2;
            }

            System.out.println("Pergunta 3: 2 + 2 é igual a 5. (true/false)");
            boolean resposta3 = scanner.nextBoolean();
            if (!resposta3) {
                pontuacaoTotal += 2;
            }

            System.out.println("Pergunta 4: A água ferve a 100 graus Celsius. (true/false)");
            boolean resposta4 = scanner.nextBoolean();
            if (resposta4) {
                pontuacaoTotal += 2;
            }

            System.out.println("Pergunta 5: O Sol gira em torno da Terra. (true/false)");
            boolean resposta5 = scanner.nextBoolean();
            if (!resposta5) {
                pontuacaoTotal += 2;
            }

            System.out.println("Sua pontuação total: " + pontuacaoTotal);

            if (pontuacaoTotal >= 6) {
                System.out.println("Parabéns! Você ganhou o prêmio!");
                break;
            } else if (pontuacaoTotal == 4) {
                System.out.println("Você fez 4 pontos. Castigado!");
                break;
            } else if (pontuacaoTotal == 0) {
                System.out.println("Você fez 0 pontos. Você perdeu. O jogo recomeçará.");
            } else {
                System.out.println("Você não ganhou desta vez. O jogo recomeçará.");
            }

            pontuacaoTotal = 0; // Reiniciar a pontuação para um novo jogo
        }

        scanner.close();
    }
}
