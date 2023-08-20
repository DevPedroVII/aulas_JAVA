package packzin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAtividades {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			List<Atividade> listaAtividades = new ArrayList<>();
			int maxAtividades = 24; // O número máximo de atividades é igual ao número de horas em um dia
			
			System.out.println("Bem-vindo à Lista de Atividades!");
			System.out.println("Você pode adicionar até " + maxAtividades + " atividades.");

			while (listaAtividades.size() < maxAtividades) {
			    System.out.print("Informe o nome da atividade (ou digite 'sair' para encerrar): ");
			    String nomeAtividade = scanner.nextLine();

			    if (nomeAtividade.equalsIgnoreCase("sair")) {
			        break;
			    }

			    System.out.print("Informe a duração da atividade em horas: ");
			    double duracaoAtividade = scanner.nextDouble();
			    scanner.nextLine(); // Limpar o buffer

			    if (duracaoAtividade <= 0 || duracaoAtividade > 24) {
			        System.out.println("Duração inválida! A duração deve estar entre 0 e 24 horas.");
			        continue;
			    }

			    Atividade atividade = new Atividade(nomeAtividade, duracaoAtividade);
			    listaAtividades.add(atividade);
			    System.out.println("Atividade adicionada à lista.");
			}

			System.out.println("=== Lista de Atividades ===");
			for (Atividade atividade : listaAtividades) {
			    System.out.println(atividade);
			}
		}
    }
}

class Atividade {
    private String nome;
    private double duracao;

    public Atividade(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Atividade: " + nome + " (Duração: " + duracao + " horas)";
    }
}
