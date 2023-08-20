package packzin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Sistema Escolar ===");
        System.out.print("Informe o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Informe a série (1 para Fundamental ou 2 para Médio): ");
        int serie = scanner.nextInt();
        
        Aluno aluno = new Aluno(nomeAluno, serie);
        
        aluno.mostrarFichaMatricula();
        
        for (String materia : aluno.getMaterias()) {
            System.out.println("Matéria: " + materia);
            for (int unidade = 1; unidade <= 3; unidade++) {
                System.out.print("Informe a nota da unidade " + unidade + ": ");
                double nota = scanner.nextDouble();
                aluno.addNota(materia, unidade, nota);
            }
        }
        
        aluno.calcularMedias();
        aluno.verificarAprovacao();
    }
}

class Aluno {
    private String nome;
    private int serie;
    private Map<String, Map<Integer, Double>> notas;
    private double mediaRecuperacao = 6;
    private double mediaAnual = 7;
    
    public static final String[] MATERIAS_FUNDAMENTAL = {
        "Língua Portuguesa", "Técnicas de redação", "Matemática", "História", "Geografia",
        "Ciências (química e física)", "Artes", "Inglês", "Espanhol", "Geometria", "Sociologia", "Filosofia", "Ed. Fisica"
    };

    public static final String[] MATERIAS_MEDIO = {
        "Português", "Matemática", "História", "Geografia", "Física", "Química",
        "Inglês", "Espanhol", "Geometria", "Sociologia", "Filosofia", "Ed. Fisica"
    };

    public Aluno(String nome, int serie) {
        this.nome = nome;
        this.serie = serie;
        this.notas = new HashMap<>();
        
        for (String materia : getMaterias()) {
            notas.put(materia, new HashMap<>());
        }
    }

    public String[] getMaterias() {
        return (serie == 1) ? MATERIAS_FUNDAMENTAL : MATERIAS_MEDIO;
    }

    public void mostrarFichaMatricula() {
        System.out.println("=== Ficha de Matrícula ===");
        System.out.println("Aluno: " + nome);
        System.out.println("Série: " + ((serie == 1) ? "Fundamental" : "Médio"));
        System.out.println("Matérias: " + String.join(", ", getMaterias()));
        System.out.println("=========================");
    }

    public void addNota(String materia, int unidade, double nota) {
        Map<Integer, Double> unidadeNotas = notas.get(materia);
        if (unidadeNotas != null) {
            unidadeNotas.put(unidade, nota);
        }
    }

    public void calcularMedias() {
        for (String materia : notas.keySet()) {
            Map<Integer, Double> unidadeNotas = notas.get(materia);
            double soma = 0;
            int count = 0;
            for (double nota : unidadeNotas.values()) {
                soma += nota;
                count++;
            }
            double media = soma / count;
            System.out.println("Média de " + materia + ": " + media);
            unidadeNotas.put(0, media); // Armazenar a média anual na posição 0
        }
    }

    public void verificarAprovacao() {
        boolean passouDeAno = true;
        
        for (String materia : notas.keySet()) {
            double media = notas.get(materia).get(0); // Pegar a média anual
            if (media < mediaAnual) {
                passouDeAno = false;
                break;
            }
        }

        if (passouDeAno) {
            System.out.println("Parabéns! " + nome + " passou de ano!");
        } else {
            System.out.println("Você não atingiu a média necessária e está reprovado(a). Estude mais para o próximo ano!");
        }
    }
}
