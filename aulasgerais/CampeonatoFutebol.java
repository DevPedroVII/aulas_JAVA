package br.com.aulasgerais;

public class CampeonatoFutebol {
    public static void main(String[] args) {
        boolean flamengoGanhouCampeonato = true;
        boolean flamengoEstaJogandoBem = true;
        boolean rodadaFinal = false;

        int rodadasRestantes = 5;

        while (rodadasRestantes > 0) {
            if (flamengoEstaJogandoBem) {
                System.out.println("O Flamengo está jogando bem na rodada " + (6 - rodadasRestantes));
            } else {
                System.out.println("O Flamengo não está jogando bem na rodada " + (6 - rodadasRestantes));
            }

            rodadasRestantes--;

            if (rodadasRestantes == 1) {
                rodadaFinal = true;
            }

            if (rodadaFinal) {
                System.out.println("É a rodada final! Tensão no ar!");
            }

            if (flamengoGanhouCampeonato && rodadaFinal) {
                System.out.println("O Flamengo é o grande CAMPEÃO!");
            } else if (!flamengoGanhouCampeonato && rodadaFinal) {
                System.out.println("Infelizmente, o Flamengo não venceu o campeonato.");
            }
        }
    }
}
