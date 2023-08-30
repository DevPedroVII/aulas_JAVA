package tarefas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        // Adicionar tarefas à lista
        listaDeTarefas.add(new Tarefa("Comprar mantimentos", "Leite, ovos, pão"));
        listaDeTarefas.add(new Tarefa("Estudar Java", "Concluir o capítulo 5"));

        // Marcar a primeira tarefa como concluída
        listaDeTarefas.get(0).marcarConcluida();

        // Exibir as tarefas e seus status
        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println("Título: " + tarefa.getTitulo());
            System.out.println("Descrição: " + tarefa.getDescricao());
            System.out.println("Concluída: " + (tarefa.isConcluida() ? "Sim" : "Não"));
            System.out.println();
        }
    }
}
