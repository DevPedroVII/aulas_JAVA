package packzin;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int jogadorAtual = 1; // Começa com o jogador 1
        int pontosJogador1 = 0;
        int pontosJogador2 = 0;

        Scanner scanner = new Scanner(System.in);

        while (pontosJogador1 < 3 && pontosJogador2 < 3) {
            exibirTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogadorAtual + ", é a sua vez.");
            System.out.print("Informe a linha (0 a 2): ");
            int linha = scanner.nextInt();
            System.out.print("Informe a coluna (0 a 2): ");
            int coluna = scanner.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida. Tente novamente.");
                continue;
            }

            tabuleiro[linha][coluna] = (jogadorAtual == 1) ? 'X' : 'O';

            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                if (jogadorAtual == 1) {
                    pontosJogador1++;
                } else {
                    pontosJogador2++;
                }

                System.out.println("Jogador " + jogadorAtual + " ganhou essa rodada!");
                resetarTabuleiro(tabuleiro);
            } else if (verificarEmpate(tabuleiro)) {
                System.out.println("Empate! O tabuleiro está cheio.");
                resetarTabuleiro(tabuleiro);
            }

            jogadorAtual = (jogadorAtual == 1) ? 2 : 1; // Alternar jogadores
        }

        if (pontosJogador1 == 3) {
            System.out.println("Jogador 1 ganhou o jogo!");
        } else {
            System.out.println("Jogador 2 ganhou o jogo!");
        }

        scanner.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean verificarVitoria(char[][] tabuleiro, int jogador) {
        char jogadorChar = (jogador == 1) ? 'X' : 'O';

        // Verificar linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogadorChar && tabuleiro[i][1] == jogadorChar && tabuleiro[i][2] == jogadorChar) ||
                    (tabuleiro[0][i] == jogadorChar && tabuleiro[1][i] == jogadorChar && tabuleiro[2][i] == jogadorChar)) {
                return true;
            }
        }

        if ((tabuleiro[0][0] == jogadorChar && tabuleiro[1][1] == jogadorChar && tabuleiro[2][2] == jogadorChar) ||
                (tabuleiro[0][2] == jogadorChar && tabuleiro[1][1] == jogadorChar && tabuleiro[2][0] == jogadorChar)) {
            return true;
        }

        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Ainda existem espaços vazios
                }
            }
        }
        return true; // Todos os espaços estão preenchidos
    }

    public static void resetarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
}
