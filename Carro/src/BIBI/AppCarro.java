package BIBI;

import java.util.Scanner;

public class AppCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Comparador de Carros ===");

        Carro carro1 = criarCarro(scanner, 1);
        Carro carro2 = criarCarro(scanner, 2);

        System.out.println("\nInformações do primeiro carro:");
        carro1.imprimirInformacoes();

        System.out.println("\nInformações do segundo carro:");
        carro2.imprimirInformacoes();

        compararVelocidades(carro1, carro2);

        scanner.close();
    }

    public static Carro criarCarro(Scanner scanner, int numeroCarro) {
        System.out.println("\nInforme os detalhes do " + getOrdinal(numeroCarro) + " carro:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        System.out.print("Velocidade do " + getOrdinal(numeroCarro) + " carro: ");
        int velocidade = Integer.parseInt(scanner.nextLine());

        return new Carro(marca, "Modelo Qualquer", ano);
    }

    public static void compararVelocidades(Carro carro1, Carro carro2) {
        int velocidadeCarro1 = carro1.getVelocidade();
        int velocidadeCarro2 = carro2.getVelocidade();

        if (velocidadeCarro1 > velocidadeCarro2) {
            System.out.println("\nO primeiro carro é mais rápido!");
        } else if (velocidadeCarro2 > velocidadeCarro1) {
            System.out.println("\nO segundo carro é mais rápido!");
        } else {
            System.out.println("\nOs carros têm a mesma velocidade!");
        }
    }

    public static String getOrdinal(int numero) {
        String[] ordinais = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo"};
        if (numero >= 1 && numero <= ordinais.length) {
            return ordinais[numero - 1];
        } else {
            return Integer.toString(numero);
        }
    }
}
