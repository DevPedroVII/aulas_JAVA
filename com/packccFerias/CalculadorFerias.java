package com.packccFerias;

import java.util.Scanner;

public class CalculadorFerias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Calculador de Férias!");
        
        // Solicitação de informações ao usuário
        System.out.print("Digite o salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses trabalhados: ");
        int mesesTrabalhados = scanner.nextInt();

        // Cálculo do valor das férias
        double valorFerias = calcularValorFerias(salarioMensal, mesesTrabalhados);

        // Exibição do resultado
        System.out.println("O valor das suas férias é: R$" + valorFerias);

        // Fechar o scanner
        scanner.close();
    }

    // Método para calcular o valor das férias
    public static double calcularValorFerias(double salarioMensal, int mesesTrabalhados) {
        double valorFerias = (salarioMensal * mesesTrabalhados) / 12;
        return valorFerias;
    }
}

