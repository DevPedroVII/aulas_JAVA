package packzin;

import java.util.Random;

public class RandomizadorPontosFlamengo {
    public static void main(String[] args) {
        Random random = new Random();
        int totalPontos = 0;

        System.out.println("Resultados das 38 partidas:");
        for (int partida = 1; partida <= 38; partida++) {
            int resultado = random.nextInt(3); // 0 para derrota, 1 para empate, 2 para vitória

            if (resultado == 0) {
                System.out.println("Partida " + partida + ": Derrota");
            } else if (resultado == 1) {
                System.out.println("Partida " + partida + ": Empate");
                totalPontos += 1;
            } else {
                System.out.println("Partida " + partida + ": Vitória");
                totalPontos += 30;
            }
        }

        System.out.println("Total de pontos: " + totalPontos);
        
        if (totalPontos >= 70) {
            System.out.println("O Flamengo é campeão!");
        } else if (totalPontos < 45) {
            System.out.println("O Flamengo é rebaixado.");
        } else {
            System.out.println("O Flamengo se manteve na série A.");
        }
    }
}
