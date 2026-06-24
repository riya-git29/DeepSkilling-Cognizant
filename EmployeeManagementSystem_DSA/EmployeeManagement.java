public class EmployeeManagement {
    private Employee[] employees;
    private int size;

    public EmployeeManagement(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee emp) {
        if (size < employees.length) {
            employees[size++] = emp;
        } else {
            System.out.println("Array is Full");
        }
    }

    public Employee searchEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void displayEmployees() {
        for (int i = 0; i < size; i++) {
            employees[i].display();
        }
    }

    public void deleteEmployee(int id) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[size - 1] = null;
        size--;

        System.out.println("Employee Deleted");
    }
}