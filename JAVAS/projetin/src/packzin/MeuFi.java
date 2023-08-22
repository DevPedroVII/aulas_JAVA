package packzin;

import java.util.Scanner;

public class MeuFi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Oi, meu fi! Quer bulacha?");
        String resposta = scanner.nextLine().toLowerCase();
        
        while (!resposta.equals("nao quero mais")) {
            if (resposta.equals("quero")) {
                System.out.println("Beleza, meu fi! Quer sair?");
                resposta = scanner.nextLine().toLowerCase();
                
                if (resposta.equals("quero")) {
                    System.out.println("Eita! E meu fi quer beber?");
                    resposta = scanner.nextLine().toLowerCase();
                    
                    if (resposta.equals("mim de papai")) {
                        System.out.println("AUUUUUUUUUUU Baby, I’m preying on you tonight\n" +
                                           "Hunt you down, eat you alive\n" +
                                           "Just like animals, animals, like animals-mals");
                    } else {
                        System.out.println("Tá bom, meu fi!");
                    }
                } else {
                    System.out.println("Tranquilo, meu fi!");
                }
            } else {
                System.out.println("Ah, tá, meu fi...");
            }
            
            System.out.println("Quer bulacha?");
            resposta = scanner.nextLine().toLowerCase();
        }
        
        System.out.println("Valeu, meu fi! Até mais!");
    }
}



