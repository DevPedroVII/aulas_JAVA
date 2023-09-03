package com.aulas.inicio;

import java.util.Scanner;

public class MeuFi {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Oi, meu fi! Quer bulacha?");
			String resposta = scanner.nextLine().toLowerCase();
			
			if (resposta.equals("quero")) {
			    System.out.println("Valeu, meu fi! Aproveita a bulacha!");
			} else {
			    System.out.println("Blz, meu fi! Quer leite?");
			    resposta = scanner.nextLine().toLowerCase();
			    
			    if (resposta.equals("quero")) {
			        System.out.println("Leitinho quente, meu fi! Delícia!");
			    } else {
			        System.out.println("Tá de boa, meu fi! Quer comer?");
			        resposta = scanner.nextLine().toLowerCase();
			        
			        if (resposta.equals("quero")) {
			            System.out.println("Bom apetite, meu fi!");
			        } else {
			            System.out.println("Eita, meu fi! Quer cachaça?");
			            resposta = scanner.nextLine().toLowerCase();
			            
			            if (resposta.equals("mim de papai")) {
			                System.out.println("AUUUUUUUUUUU Baby, I’m preying on you tonight\n" +
			                                   "Hunt you down, eat you alive\n" +
			                                   "Just like animals, animals, like animals-mals");
			            } else {
			                System.out.println("Tranquilo, meu fi!");
			            }
			        }
			    }
			}
		}
        
        System.out.println("🐺");
    }
}
