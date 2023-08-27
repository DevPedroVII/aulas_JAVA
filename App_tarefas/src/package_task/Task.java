package package_task;

// Esta classe representa uma tarefa na lista. Cada tarefa terá um título e um status 
public class Task {
    private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        completed = true;
    }

    public void uncompleteTask() {
        completed = false;
    }
}
