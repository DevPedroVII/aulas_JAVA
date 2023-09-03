package br.com.aulasgerais;

import java.util.Random;

public class SimuladorCampeonatoCorrigido {
    public static void main(String[] args) {
        final String[] TEAM_NAMES = {
        		"Flamengo", "Palmeiras", "São Paulo", "Santos", "Corinthians",
                "Grêmio", "Fluminense", "Cruzeiro", "Internacional", "Atlético-MG",
                "Bahia", "Botafogo", "Vasco", "Coritiba", "Cuiaba",
                "Fortaleza", "Athletico-PR", "Goiás", "America-MG", "Bragantino"
        };
        final int NUM_TEAMS = TEAM_NAMES.length;
        final int NUM_ROUNDS = 38;
        final int POINTS_WIN = 3;
        final int POINTS_DRAW = 1;

        int[][] tabela = new int[NUM_TEAMS][2];  // Array para armazenar pontos e identificador da equipe
        inicializarTabela(tabela);

        Random random = new Random();

        // Simulação das rodadas
        for (int round = 1; round <= NUM_ROUNDS; round++) {
            System.out.println("Rodada " + round + ":");

            // Simula os jogos entre as equipes
            for (int i = 0; i < NUM_TEAMS; i++) {
                for (int j = 0; j < NUM_TEAMS; j++) {
                    if (i != j) {
                        int resultado = random.nextInt(3);  // 0: derrota, 1: empate, 2: vitória

                        if (resultado == 2) {
                            tabela[i][1] += POINTS_WIN;
                        } else if (resultado == 1) {
                            tabela[i][1] += POINTS_DRAW;
                        }
                    }
                }
            }
        }

        ordenarTabela(tabela);

        imprimirClassificacao(tabela, TEAM_NAMES);
        imprimirClassificados(tabela, TEAM_NAMES, 0, 4, "Libertadores");
        imprimirClassificados(tabela, TEAM_NAMES, 4, 16, "Sul-Americana");
        imprimirClassificados(tabela, TEAM_NAMES, NUM_TEAMS - 4, NUM_TEAMS, "Rebaixadas");
    }

    private static void inicializarTabela(int[][] tabela) {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i][0] = i;  // Identificador da equipe
        }
    }

    private static void ordenarTabela(int[][] tabela) {
        java.util.Arrays.sort(tabela, (a, b) -> Integer.compare(b[1], a[1]));
    }

    private static void imprimirClassificacao(int[][] tabela, String[] teamNames) {
        System.out.println("\nClassificação Final:");
        for (int i = 0; i < tabela.length; i++) {
            String posicao = String.format("%2d", i + 1);
            System.out.println(posicao + "ª - " + teamNames[tabela[i][0]] + ": " + tabela[i][1] + " pontos");
        }
    }

    private static void imprimirClassificados(int[][] tabela, String[] teamNames, int startIndex, int endIndex, String titulo) {
        System.out.println("\nClassificados para " + titulo + ":");
        for (int i = startIndex; i < endIndex; i++) {
            System.out.println(teamNames[tabela[i][0]]);
        }
    }
}
