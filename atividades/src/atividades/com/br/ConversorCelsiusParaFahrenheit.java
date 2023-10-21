package atividades.com.br;
import java.util.Scanner;

public class ConversorCelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite a temperatura em graus Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();
            double temperaturaFahrenheit = (9.0 / 5.0) * temperaturaCelsius + 32;

            System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);

            System.out.print("Deseja repetir (S/N)? ");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');
    }
}

