package packzin;

import java.util.Random;

public class SimuladorCampeonatoCorrigido {
    public static void main(String[] args) {
        final String[] TEAM_NAMES = {
        		"Flamengo", "Palmeiras", "São Paulo", "Santos", "Corinthians",
                "Grêmio", "Fluminense", "Cruzeiro", "Internacional", "Atlético-MG",
                "Bahia", "Botafogo", "Vasco", "Sport", "Ceará",
                "Fortaleza", "Athletico-PR", "Goiás", "Chapecoense", "Avaí"
        };
        final int NUM_TEAMS = TEAM_NAMES.length;
        final int NUM_ROUNDS = 38;
        final int POINTS_WIN = 3;
        final int POINTS_DRAW = 1;
        final int POINTS_LOSS = 0;

        Random random = new Random();
        int[][] tabela = new int[NUM_TEAMS][3];  // Array para armazenar pontos, saldo de gols e identificador da equipe

        // Inicializa a tabela com identificadores de equipe e pontos aleatórios
        for (int i = 0; i < NUM_TEAMS; i++) {
            tabela[i][0] = i;  // Identificador da equipe
            tabela[i][1] = random.nextInt(50);  // Pontuação aleatória
        }

        // Simulação das rodadas
        for (int round = 1; round <= NUM_ROUNDS; round++) {
            System.out.println("Rodada " + round + ":");

            // Simula o desempenho das equipes na rodada
            for (int i = 0; i < NUM_TEAMS; i++) {
                int resultado = random.nextInt(3);  // 0: derrota, 1: empate, 2: vitória

                if (resultado == 0) {
                    tabela[i][1] += POINTS_LOSS;
                } else if (resultado == 1) {
                    tabela[i][1] += POINTS_DRAW;
                } else {
                    tabela[i][1] += POINTS_WIN;
                }
            }
        }

        // Ordena a tabela classificatória com base nos pontos
        java.util.Arrays.sort(tabela, (a, b) -> Integer.compare(b[1], a[1]));

        // Imprime a classificação final
        System.out.println("\nClassificação Final:");
        for (int i = 0; i < NUM_TEAMS; i++) {
            String posicao = String.format("%2d", i + 1);
            System.out.println(posicao + "ª - " + TEAM_NAMES[tabela[i][0]] + ": " + tabela[i][1] + " pontos");
        }

        // Imprime os times que se classificaram para Libertadores, Sul-Americana e rebaixamento
        System.out.println("\nClassificados para a Libertadores:");
        for (int i = 0; i < 4; i++) {
            System.out.println(TEAM_NAMES[tabela[i][0]]);
        }

        System.out.println("\nClassificados para a Sul-Americana:");
        for (int i = 4; i < 16; i++) {
            System.out.println(TEAM_NAMES[tabela[i][0]]);
        }

        System.out.println("\nEquipes Rebaixadas:");
        for (int i = NUM_TEAMS - 4; i < NUM_TEAMS; i++) {
            System.out.println(TEAM_NAMES[tabela[i][0]]);
        }
    }
}
