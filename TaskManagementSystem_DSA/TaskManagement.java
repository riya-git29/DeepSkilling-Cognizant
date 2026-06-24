class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

class TaskLinkedList {
    private Task head;

    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);

        if (head == null) {
            head = newTask;
            return;
        }

        Task temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newTask;
    }

    public Task searchTask(int id) {
        Task temp = head;

        while (temp != null) {
            if (temp.taskId == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void displayTasks() {
        Task temp = head;

        while (temp != null) {
            System.out.println("ID: " + temp.taskId +
                    ", Name: " + temp.taskName +
                    ", Status: " + temp.status);
            temp = temp.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task current = head;

        while (current.next != null &&
                current.next.taskId != id) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}

public class TaskManagementSystem {
    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(1, "Design UI", "Pending");
        taskList.addTask(2, "Develop Backend", "In Progress");
        taskList.addTask(3, "Testing", "Pending");

        System.out.println("All Tasks:");
        taskList.displayTasks();

        Task task = taskList.searchTask(2);

        if (task != null) {
            System.out.println("\nFound Task:");
            System.out.println(task.taskId + " - " +
                    task.taskName + " - " +
                    task.status);
        }

        taskList.deleteTask(2);

        System.out.println("\nAfter Deleting Task ID 2:");
        taskList.displayTasks();
    }
}