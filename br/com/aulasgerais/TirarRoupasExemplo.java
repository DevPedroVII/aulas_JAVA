package br.com.aulasgerais;
// Exemplo de Foreach 
import java.util.ArrayList;
import java.util.List;

public class TirarRoupasExemplo {
    public static void main(String[] args) {
        List<String> pecasDeRoupa = new ArrayList<>();
        pecasDeRoupa.add("Camisa");
        pecasDeRoupa.add("Calça");
        pecasDeRoupa.add("Sapatos");
        pecasDeRoupa.add("Meias");

        System.out.println("Comecei a tirar a roupa:");
        for (String peca : pecasDeRoupa) {
            System.out.println("Tirei a " + peca);
        }

        System.out.println("Terminei de tirar a roupa.");
    }
}
