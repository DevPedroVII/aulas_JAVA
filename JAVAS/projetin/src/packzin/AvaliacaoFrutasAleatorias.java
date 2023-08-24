package packzin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AvaliacaoFrutasAleatorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> frutas = new ArrayList<>();
        List<Integer> notas = new ArrayList<>();
        List<String> frutasSugeridas = new ArrayList<>();

        // Frutas para sugestões aleatórias
        String[] frutasAleatorias = {
            "Banana", "Maçã", "Laranja", "Pêssego", "Abacaxi", "Uva", "Morango",
            "Melancia", "Kiwi", "Manga", "Pera", "Cereja", "Goiaba", "Caju",
            "Framboesa", "Melão", "Ameixa", "Maracujá", "Jabuticaba", "Tangerina",
            "Limão", "Coco", "Amora", "Figo", "Pitaya", "Guaraná", "Romã",
            "Açaí", "Jambo", "Acerola", "Kiwi", "Lichia", "Cacto", "Durião"
        };

        Collections.addAll(frutasSugeridas, frutasAleatorias);

        while (true) {
            System.out.print("Informe o nome de uma fruta (ou 'não quero' para parar): ");
            String nomeFruta = scanner.nextLine();

            if (nomeFruta.equalsIgnoreCase("não quero")) {
                break;
            }

            frutas.add(nomeFruta);

            System.out.print("Informe a nota da fruta (0-10): ");
            int nota = scanner.nextInt();
            notas.add(nota);
            scanner.nextLine(); // Limpar o buffer

            frutasSugeridas.remove(nomeFruta);

            System.out.print("Deseja uma sugestão de fruta para comer? (sim/não): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("sim")) {
                int indiceSugestao = random.nextInt(frutasSugeridas.size());
                String sugestao = frutasSugeridas.get(indiceSugestao);
                System.out.println("Que tal experimentar uma " + sugestao + "?");
            }
        }

        System.out.println("\nFrutas informadas:");

        // Organiza as frutas em ordem alfabética
        Collections.sort(frutas);

        for (int i = 0; i < frutas.size(); i++) {
            String fruta = frutas.get(i);
            int nota = notas.get(i);

            System.out.print(fruta);

            // Adiciona a carinha correspondente à nota
            if (nota < 6) {
                System.out.print(" 😠");
            } else if (nota >= 6 && nota < 8) {
                System.out.print(" 😐");
            } else if (nota >= 8 && nota < 10) {
                System.out.print(" 😀");
            } else if (nota == 10) {
                System.out.print(" ❤️");
            }

            System.out.println();
        }
    }
}
