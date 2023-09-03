package packCalc;

import java.util.Scanner;

public class CalculadoraComplexa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            
            int escolha = scanner.nextInt();
            
            if (escolha == 5) {
                continuar = false;
                System.out.println("Saindo da calculadora.");
            } else if (escolha >= 1 && escolha <= 4) {
                System.out.print("Digite o primeiro número: ");
                double numero1 = scanner.nextDouble();
                
                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextDouble();
                
                double resultado = 0.0;
                
                switch (escolha) {
                    case 1:
                        resultado = numero1 + numero2;
                        break;
                    case 2:
                        resultado = numero1 - numero2;
                        break;
                    case 3:
                        resultado = numero1 * numero2;
                        break;
                    case 4:
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                            continue;
                        }
                        break;
                }
                
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }
        
        scanner.close();
    }
}
