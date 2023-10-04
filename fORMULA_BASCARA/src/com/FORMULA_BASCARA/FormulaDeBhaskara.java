package com.FORMULA_BASCARA;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os coeficientes da equação quadrática (a, b e c):");
        
        // Leitura dos coeficientes a, b e c da entrada do usuário
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        // Calcula o discriminante (parte dentro da raiz quadrada)
        double discriminante = b * b - 4 * a * c;
        
        if (discriminante > 0) {
            // Duas raízes reais distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As raízes são x1 = " + x1 + " e x2 = " + x2);
        } else if (discriminante == 0) {
            // Uma raiz real (raízes iguais)
            double x1 = -b / (2 * a);
            System.out.println("A raiz é x1 = " + x1);
        } else {
            // Não há raízes reais (raízes complexas)
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("As raízes são complexas:");
            System.out.println("x1 = " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
        
        scanner.close();
    }
}