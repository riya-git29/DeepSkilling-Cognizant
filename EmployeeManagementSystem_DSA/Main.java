public class Main {
    public static void main(String[] args) {

        EmployeeManagement ems = new EmployeeManagement(5);

        ems.addEmployee(new Employee(101, "Riya", "Developer", 50000));
        ems.addEmployee(new Employee(102, "Aman", "Tester", 40000));
        ems.addEmployee(new Employee(103, "Neha", "Manager", 70000));

        System.out.println("Employee Records:");
        ems.displayEmployees();

        System.out.println("\nSearching Employee ID 102");
        Employee emp = ems.searchEmployee(102);

        if (emp != null) {
            emp.display();
        }

        System.out.println("\nDeleting Employee ID 102");
        ems.deleteEmployee(102);

        System.out.println("\nUpdated Records:");
        ems.displayEmployees();
    }
}