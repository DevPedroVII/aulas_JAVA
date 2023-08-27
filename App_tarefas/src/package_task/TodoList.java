package package_task;

//Esta classe representa a lista de tarefas e contém métodos para adicionar,
//remover e listar tarefas.
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String title) {
        Task task = new Task(title);
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.getTitle() + " - " + (task.isCompleted() ? "Concluída" : "Pendente"));
        }
    }
}
