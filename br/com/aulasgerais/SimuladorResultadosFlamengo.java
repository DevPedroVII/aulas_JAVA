package br.com.aulasgerais;

import java.util.Random;

public class SimuladorResultadosFlamengo {
    public static void main(String[] args) {
        Random random = new Random();
        int totalPontos = 0;

        for (int partida = 1; partida <= 38; partida++) {
            int resultado = random.nextInt(3); // 0 para derrota, 1 para empate, 2 para vitória

            if (resultado == 0) {
                // Derrota, não soma pontos
                System.out.println("Partida " + partida + ": Derrota");
            } else if (resultado == 1) {
                totalPontos += 1;
                System.out.println("Partida " + partida + ": Empate");
            } else {
                totalPontos += 3; // Vitória vale 3 pontos
                System.out.println("Partida " + partida + ": Vitória");
            }
        }

        System.out.println("Pontuação final: " + totalPontos);

        if (totalPontos >= 70) {
            System.out.println("O Flamengo é o campeão!");
        } else if (totalPontos < 45) {
            System.out.println("O Flamengo foi rebaixado.");
        }
    }
}

