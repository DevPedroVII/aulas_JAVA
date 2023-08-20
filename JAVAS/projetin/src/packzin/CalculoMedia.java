package packzin;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Média e Aprovação ===");

        int numeroDeAlunos;
        do {
            System.out.print("Digite o número de alunos: ");
            numeroDeAlunos = scanner.nextInt();
            if (numeroDeAlunos <= 0) {
                System.out.println("O número de alunos deve ser maior que zero.");
            }
        } while (numeroDeAlunos <= 0);

        double[] notas = new double[numeroDeAlunos];
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("A nota deve estar entre 0 e 10.");
                i--; // Reverta o índice para obter a entrada correta novamente
            }
        }

        double somaDasNotas = 0;
        for (double nota : notas) {
            somaDasNotas += nota;
        }

        double media = somaDasNotas / numeroDeAlunos;
        System.out.printf("A média das notas é: %.2f%n", media);

        System.out.println("\nAlunos que passaram:");
        for (int i = 0; i < numeroDeAlunos; i++) {
            boolean passou = notas[i] >= 6.0; // Nota mínima para aprovação
            String status = passou ? "Aprovado" : "Reprovado";
            System.out.println("Aluno " + (i + 1) + ": " + status);
        }

        scanner.close();
    }
}
