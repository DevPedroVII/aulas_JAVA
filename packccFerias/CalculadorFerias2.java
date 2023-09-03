package packccFerias;

import java.util.Scanner;

public class CalculadorFerias2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Informe o salário mensal: ");
			double salarioMensal = scanner.nextDouble();

			System.out.print("Informe quantos meses trabalhados: ");
			int mesesTrabalhados = scanner.nextInt();

			double ferias = calcularFerias(salarioMensal, mesesTrabalhados);

			System.out.println("O valor das férias é: R$" + ferias);
		}
    }

    public static double calcularFerias(double salarioMensal, int mesesTrabalhados) {
        double valorFerias = salarioMensal * (1 + (1.0 / 3)) * (mesesTrabalhados / 12.0);
        return valorFerias;
    }
}
