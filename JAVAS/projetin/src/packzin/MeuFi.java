package packzin;

import java.util.Scanner;



public class MeuFi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Oi, meu fi! Quer bulacha?");
        String respostaBulacha = scanner.nextLine().toLowerCase();
        
        if (respostaBulacha.equals("quero")) {
            System.out.println("Aqui está a bulachinha, meu fi!");
        } else {
            System.out.println("Tá bom, meu fi...");
            return;
        }
        
        System.out.println("Agora, meu fi, quer leite?");
        String respostaLeite = scanner.nextLine().toLowerCase();
        
        if (respostaLeite.equals("quero")) {
            System.out.println("Aqui está o leitinho quente, meu fi!");
        } else {
            System.out.println("Tudo bem, meu fi. E a fome, tá grande?");
            String respostaComida = scanner.nextLine().toLowerCase();
            
            if (respostaComida.equals("quero")) {
                System.out.println("Aqui está uma comida gostosa, meu fi!");
            } else {
                System.out.println("Meu fi, quer cachaça?");
                String respostaCachaca = scanner.nextLine().toLowerCase();
                
                if (respostaCachaca.equals("mim de papai")) {
                    System.out.println("AUUUUUUUUUUU Baby, I’m preying on you tonight\n" +
                                       "Hunt you down, eat you alive\n" +
                                       "Just like animals, animals, like animals-mals");
                } else {
                    System.out.println("Beleza, meu fi! Vamos continuar com as opções.");
                    main(args); // Repete o código
                }
            }
        }
        
        System.out.println("Valeu, meu fi! Até mais!");
    }
}
