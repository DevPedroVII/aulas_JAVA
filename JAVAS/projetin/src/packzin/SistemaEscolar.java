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
            System.out.println();
        }
        
        System.out.print("O aluno fez segunda chamada? (S/N): ");
        char segundaChamada = scanner.next().charAt(0);
        
        if (segundaChamada == 'S' || segundaChamada == 's') {
            System.out.print("Informe a matéria da segunda chamada: ");
            scanner.nextLine(); // Limpar o buffer
            String materiaSegundaChamada = scanner.nextLine();
            
            System.out.print("Informe a nota na prova de segunda chamada: ");
            double notaSegundaChamada = scanner.nextDouble();
            
            aluno.processarSegundaChamada(materiaSegundaChamada, notaSegundaChamada);
        }
        
        aluno.calcularMedia();
        aluno.verificarAprovacao();
    }
}

class Aluno {
    private String nome;
    private int serie;
    private Map<String, double[]> notasPorMateria;
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
        this.notasPorMateria = new HashMap<>();
        String[] materias = (serie == 1) ? MATERIAS_FUNDAMENTAL : MATERIAS_MEDIO;
        for (String materia : materias) {
            this.notasPorMateria.put(materia, new double[3]); // 3 unidades
        }
    }

    public void mostrarFichaMatricula() {
        System.out.println("=== Ficha de Matrícula ===");
        System.out.println("Aluno: " + nome);
        System.out.println("Série: " + ((serie == 1) ? "Fundamental" : "Médio"));
        System.out.println("Matérias: " + String.join(", ", getMaterias()));
        System.out.println("=========================");
    }

    public void addNota(String materia, int unidade, double nota) {
        double[] notasMateria = notasPorMateria.get(materia);
        if (unidade >= 1 && unidade <= notasMateria.length) {
            notasMateria[unidade - 1] = nota;
        }
    }

    public void processarSegundaChamada(String materia, double notaSegundaChamada) {
        double[] notasMateria = notasPorMateria.get(materia);
        if (notaSegundaChamada <= 4) {
            notasMateria[0] += notaSegundaChamada; // Adiciona à primeira unidade
            System.out.println("Nota da segunda chamada adicionada à matéria " + materia);
        } else {
            System.out.println("Algo de errado aconteceu na segunda chamada de " + materia);
        }
    }

    public void calcularMedia() {
        double soma = 0;
        int count = 0;
        for (String materia : notasPorMateria.keySet()) {
            double[] notasMateria = notasPorMateria.get(materia);
            double somaMateria = 0;
            for (double nota : notasMateria) {
                somaMateria += nota;
                count++;
            }
            double mediaMateria = somaMateria / notasMateria.length;
            System.out.println("Média em " + materia + ": " + mediaMateria);
        }
    }

    public void verificarAprovacao() {
        boolean passou = true;

        for (String materia : notasPorMateria.keySet()) {
            double[] notasMateria = notasPorMateria.get(materia);
            double mediaMateria = calcularMediaMateria(notasMateria);

            if (mediaMateria < mediaAnual) {
                System.out.println("Aluno em recuperação em " + materia + ". Média: " + mediaMateria);
                passou = false;
            }
        }

        if (passou) {
            System.out.println("Parabéns! " + nome + " passou de ano!");
        } else {
            System.out.println("Infelizmente, " + nome + " não passou de ano.");
            System.out.println("Você tem a opção de fazer recuperação em cada matéria.");
        }
    }

    private double calcularMediaMateria(double[] notasMateria) {
        double soma = 0;
        for (double nota : notasMateria) {
            soma += nota;
        }
        return soma / notasMateria.length;
    }

    public String[] getMaterias() {
        return (serie == 1) ? MATERIAS_FUNDAMENTAL : MATERIAS_MEDIO;
    }
}

