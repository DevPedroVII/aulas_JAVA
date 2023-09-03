	package br.com.aulasgerais;

	import java.util.Scanner;

	public class CanalSimpsonGamer {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Você está no canal SIMPSON GAMER? (s/n): ");
	        String resposta = scanner.nextLine();
	        
	        if (resposta.equalsIgnoreCase("s")) {
	            System.out.println("Esse canal é bom demais!");
	        } else if (resposta.equalsIgnoreCase("n")) {
	            System.out.println("Você deveria conferir o canal SIMPSON GAMER!");
	            System.out.println("Canal: https://youtube.com/@SimpsonGamer");
	            System.out.println("Esse canal é bom DMS!");
	        } else {
	            System.out.println("Resposta inválida. Por favor, responda 's' para sim ou 'n' para não.");
	        }
	        
	        scanner.close();
	    }
	}
