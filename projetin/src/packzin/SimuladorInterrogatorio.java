package packzin;

import java.util.Scanner;

public class SimuladorInterrogatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean pessoaConfessa = false;
        int perguntasRealizadas = 0;

        System.out.println("Bem-vindo ao simulador de interrogatório.");

        while (perguntasRealizadas < 3) {
            System.out.println("Pergunta " + (perguntasRealizadas + 1) + ":");
            System.out.println("O bolsonaro confessa o crime? (true/false)");
            boolean resposta = scanner.nextBoolean();

            if (resposta) {
                pessoaConfessa = true;
                break; // Se a pessoa confessar, não precisamos fazer mais perguntas
            }

            perguntasRealizadas++;
        }

        if (pessoaConfessa) {
            System.out.println("O Bolsonaro confessou o crime. Ela será presa Faz o L.");
        } else {
            System.out.println(" 'NÂO VOU FALAR NADA TAOK'. Ela Vai Fazer o L .");
        }

        scanner.close();
    }
}

