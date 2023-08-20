package packzin;


import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
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
}

class Aluno {
    private String nome;
    private int serie;
    private int unidades = 3;
    private double mediaRecuperacao = 6;
    private double mediaAnual = 7;
    private double[][] notas;
    private String[] atividades;
    
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
        this.notas = new double[MATERIAS_FUNDAMENTAL.length][3]; // 3 unidades
        this.setAtividades(new String[MATERIAS_FUNDAMENTAL.length]);
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
        int index = findMateriaIndex(materia);
        if (index != -1) {
            this.notas[index][unidade - 1] = nota;
        }
    }

    public void processarSegundaChamada(String materia, double notaSegundaChamada) {
        int index = findMateriaIndex(materia);
        if (index != -1) {
            if (notaSegundaChamada <= 4) {
                this.notas[index][0] += notaSegundaChamada; // Adiciona à primeira unidade
                System.out.println("Nota da segunda chamada adicionada à matéria " + materia);
            } else {
                System.out.println("Algo de errado aconteceu na segunda chamada de " + materia);
            }
        }
    }

    public double calcularMedia() {
        double soma = 0;
        int count = 0;
        for (double[] unidadeNotas : notas) {
            for (double nota : unidadeNotas) {
                soma += nota;
                count++;
            }
        }
        double media = soma / count;

        if (media < mediaAnual && unidades > 1) {
            try (Scanner scanner = new Scanner(System.in)) {
				System.out.print("Informe a nota da recuperação: ");
				double notaRecuperacao = scanner.nextDouble();

				media = (media + notaRecuperacao) / 2;
				unidades--;
				System.out.println("Aluno em recuperação. Nova média: " + media);
				if (notaRecuperacao == 10) {
				    System.out.println("Parabéns! Você ganhou um presente misterioso!");
				}
			}
        } else {
            System.out.println("Média anual do aluno: " + media);
        }
		return media;
    }

    public void verificarAprovacao() {
        double media = (double) calcularMedia();

        if (media >= mediaAnual) {
            System.out.println("Parabéns! " + nome + " passou de ano!");
        } else if (media >= mediaRecuperacao) {
            System.out.println("Aluno em recuperação. Média: " + media);
        } else {
            System.out.println("Você não atingiu a média necessária e está reprovado(a). Estude mais para o próximo ano!");
        }
    }

    private int findMateriaIndex(String materia) {
        for (int i = 0; i < MATERIAS_FUNDAMENTAL.length; i++) {
            if (getMaterias()[i].equalsIgnoreCase(materia)) {
                return i;
            }
        }
        return -1;
    }

	public String[] getAtividades() {
		return atividades;
	}

	public void setAtividades(String[] atividades) {
		this.atividades = atividades;
	}
}
