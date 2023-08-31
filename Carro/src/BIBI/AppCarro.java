package BIBI;

import java.util.Scanner;

//Classe principal
public class AppCarro {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Solicitar informações do primeiro carro
     System.out.println("Informe os detalhes do primeiro carro:");
     System.out.print("Marca: ");
     String marcaCarro1 = scanner.nextLine();
     System.out.print("Ano: ");
     int anoCarro1 = scanner.nextInt();
     scanner.nextLine(); // Limpar o buffer
     System.out.print("Velocidade do primeiro carro: ");
     int velocidadeCarro1 = scanner.nextInt();
     scanner.nextLine(); // Limpar o buffer

     // Solicitar informações do segundo carro
     System.out.println("\nInforme os detalhes do segundo carro:");
     System.out.print("Marca: ");
     String marcaCarro2 = scanner.nextLine();
     System.out.print("Ano: ");
     int anoCarro2 = scanner.nextInt();
     scanner.nextLine(); // Limpar o buffer
     System.out.print("Velocidade do segundo carro: ");
     int velocidadeCarro2 = scanner.nextInt();

     // Criando objetos Carro com as informações fornecidas pelo usuário
     Carro carro1 = new Carro(marcaCarro1, "Modelo Qualquer", anoCarro1);
     Carro carro2 = new Carro(marcaCarro2, "Modelo Qualquer", anoCarro2);

     // Atribuir velocidades aos carros
     carro1.acelerar(velocidadeCarro1);
     carro2.acelerar(velocidadeCarro2);

     // Imprimir informações dos carros
     System.out.println("\nInformações do primeiro carro:");
     carro1.imprimirInformacoes();

     System.out.println("\nInformações do segundo carro:");
     carro2.imprimirInformacoes();

     // Comparar velocidades
     if (carro1.getVelocidade() > carro2.getVelocidade()) {
         System.out.println("\nO primeiro carro é mais rápido!");
     } else if (carro2.getVelocidade() > carro1.getVelocidade()) {
         System.out.println("\nO segundo carro é mais rápido!");
     } else {
         System.out.println("\nOs carros têm a mesma velocidade!");
     }

     scanner.close(); // Fechar o scanner
 }
}
