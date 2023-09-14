package br.com.bears;

import java.util.Scanner;

public class ProgramaUrsos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Apresentação das opções ao cliente
        System.out.println("Escolha um tipo de urso para obter informações:");
        System.out.println("1. Urso Polar");
        System.out.println("2. Urso Negro");
        System.out.println("3. Urso Panda");
        System.out.println("4. Urso Grizzly");
        System.out.println("5. Urso Andino");
        
        int escolha = scanner.nextInt();
        
        switch (escolha) {
            case 1:
                exibirInformacoes(new UrsoPolar());
                break;
            case 2:
                exibirInformacoes(new UrsoNegro());
                break;
            case 3:
                exibirInformacoes(new UrsoPanda());
                break;
            case 4:
                exibirInformacoes(new UrsoGrizzly());
                break;
            case 5:
                exibirInformacoes(new UrsoAndino());
                break;
            default:
                System.out.println("Escolha inválida.");
        }
        
        scanner.close();
    }
    
    // Método para exibir informações de um Urso
    public static void exibirInformacoes(Urso urso) {
        System.out.println("Nome Científico: " + urso.getNomeCientifico());
        System.out.println("Habitat: " + urso.getHabitat());
        System.out.println("Dieta: " + urso.getDieta());
        System.out.println("Tempo de Gestação: " + urso.getTempoGestacao());
        System.out.println("Cores: " + urso.getCores());
        System.out.println("Comportamento: " + urso.getComportamento());
        System.out.println("Tamanho Médio: " + urso.getTamanhoMedio());
        System.out.println("Peso Médio: " + urso.getPesoMedio());
        System.out.println("Tempo de Vida: " + urso.getTempoVida());
    }
}
