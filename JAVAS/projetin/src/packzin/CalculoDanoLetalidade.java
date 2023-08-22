package packzin;

public class CalculoDanoLetalidade {

    public static double calcularDanoComLetalidade(double danoBase, double resistenciaFisicaAlvo, double letalidade) {
        double danoSemLetalidade = danoBase * (1 - resistenciaFisicaAlvo);
        double danoComLetalidade = danoSemLetalidade + letalidade;
        return danoComLetalidade;
    }

    public static void main(String[] args) {
        double danoBase = 100;  // Dano físico base do ataque ou habilidade
        double resistenciaFisicaAlvo = 0.5;  // Resistência física do alvo (ex: 0.5 representa 50% de resistência)
        double letalidade = 20;  // Valor de letalidade do seu campeão
        
        double danoCalculado = calcularDanoComLetalidade(danoBase, resistenciaFisicaAlvo, letalidade);
        
        System.out.println("Dano causado com letalidade: " + danoCalculado);
    }
}
