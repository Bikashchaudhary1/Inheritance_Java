public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Bikash", 19, "9811111111", "Kathmandu", 1000.0, "Finance");
        System.out.println("Manager Salary: $" + manager.calculateSalary(2));

        Employee employee = new Employee("Raju", 16, "983465212", "Lalitpur", 80.0, "HR");
        System.out.println("Employee Salary: $" + employee.calculateSalary(3));
    }
}
