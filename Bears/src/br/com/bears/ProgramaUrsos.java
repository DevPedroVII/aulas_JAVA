package br.com.bears;

import java.util.Scanner;

public class ProgramaUrsos {
    public static void main(String[] args) {
        // Criando instâncias de ursos específicos
        Urso ursoPolar = new UrsoPolar();
        Urso ursoNegro = new UrsoNegro();
        Urso ursoPanda = new UrsoPanda();
        Urso ursoGrizzly = new UrsoGrizzly();
        Urso ursoAndino = new UrsoAndino();

        // Exibindo informações sobre os ursos
        exibirInformacoes(ursoPolar);
        exibirInformacoes(ursoNegro);
        exibirInformacoes(ursoPanda);
        exibirInformacoes(ursoGrizzly);
        exibirInformacoes(ursoAndino);
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
        System.out.println();
    }
}
