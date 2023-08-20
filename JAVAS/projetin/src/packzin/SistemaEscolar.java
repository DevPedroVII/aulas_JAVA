package packzin;

import java.util.*;

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
                System.out.print("Informe a nota da unidade " + unidade + " para " + materia + ": ");
                double nota = scanner.nextDouble();
                aluno.addNota(materia, unidade, nota);
            }
        }

        aluno.calcularMediaPorMateria();
        aluno.verificarAprovacao();
    }
}

class Aluno {
    private String nome;
    private int serie;
    private double mediaMinima = 7;
    private Map<String, List<Double>> notasPorMateria;

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
        this.notasPorMateria = new HashMap<>();
        for (String materia : getMaterias()) {
            notasPorMateria.put(materia, new ArrayList<>());
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
        if (notasPorMateria.containsKey(materia)) {
            List<Double> notas = notasPorMateria.get(materia);
            notas.add(nota);
        }
    }

    public void calcularMediaPorMateria() {
        for (String materia : notasPorMateria.keySet()) {
            List<Double> notas = notasPorMateria.get(materia);
            if (!notas.isEmpty()) {
                double soma = 0;
                for (double nota : notas) {
                    soma += nota;
                }
                double media = soma / notas.size();
                System.out.println("Média de " + materia + ": " + media);
            }
        }
    }

    public void verificarAprovacao() {
        for (String materia : notasPorMateria.keySet()) {
            List<Double> notas = notasPorMateria.get(materia);
            if (!notas.isEmpty()) {
                double soma = 0;
                for (double nota : notas) {
                    soma += nota;
                }
                double media = soma / notas.size();
                if (media >= mediaMinima) {
                    System.out.println("Parabéns! " + nome + " passou em " + materia + " com média " + media);
                } else {
                    System.out.println("Infelizmente, " + nome + " não passou em " + materia + " com média " + media);
                }
            }
        }
    }
}
