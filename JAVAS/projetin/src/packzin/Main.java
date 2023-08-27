package packzin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (choice) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String title = scanner.nextLine();
                    todoList.addTask(title);
                    break;
                case 2:
                    System.out.print("Digite o índice da tarefa a ser removida: ");
                    int index = scanner.nextInt();
                    todoList.removeTask(index - 1);
                    break;
                case 3:
                    todoList.listTasks();
                    break;
                case 4:
                    System.out.println("Saindo do aplicativo.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
