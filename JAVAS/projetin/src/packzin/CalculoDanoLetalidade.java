package packzin;

import java.util.Scanner;

public class CalculoDanoLetalidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de Letalidade do item: ");
        double letalidade = scanner.nextDouble();

        System.out.print("Digite a resistência física do alvo: ");
        double resistenciaFisica = scanner.nextDouble();

        System.out.print("Digite o dano físico base: ");
        double danoFisicoBase = scanner.nextDouble();

        // Cálculo do dano com Letalidade
        double danoCausado = calcularDanoLetalidade(danoFisicoBase, letalidade, resistenciaFisica);

        if (danoCausado < 0) {
            danoCausado = 0; // Evita que o dano seja negativo
        }

        System.out.println("O dano causado com base na Letalidade é: " + danoCausado);

        scanner.close();
    }

    public static double calcularDanoLetalidade(double danoFisicoBase, double letalidade, double resistenciaFisica) {
        // Aplicando a fórmula: Dano físico causado = Dano físico base * (1 - Resistência física do alvo) + Letalidade
        double danoCausado = danoFisicoBase * (1 - resistenciaFisica) + letalidade;
        return danoCausado;
    }
}
