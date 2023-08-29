package packzin;
import java.util.Scanner;

public class MatrizCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matrizA = lerMatriz(scanner, linhas, colunas, "A");
        int[][] matrizB = lerMatriz(scanner, linhas, colunas, "B");

        System.out.println("\nMatriz A:");
        imprimirMatriz(matrizA);

        System.out.println("\nMatriz B:");
        imprimirMatriz(matrizB);

        int[][] soma = somarMatrizes(matrizA, matrizB);
        int[][] produto = multiplicarMatrizes(matrizA, matrizB);

        System.out.println("\nSoma das matrizes:");
        imprimirMatriz(soma);

        System.out.println("\nProduto das matrizes:");
        imprimirMatriz(produto);
    }

    public static int[][] lerMatriz(Scanner scanner, int linhas, int colunas, String nome) {
        int[][] matriz = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz " + nome + ":");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] somarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        int[][] resultado = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int colunasB = matrizB[0].length;
        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }
}

