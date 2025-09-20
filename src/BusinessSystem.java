import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BusinessSystem class provides a simple Employee Management System.
 * Users can add employees, view all employees' details, calculate total payroll, and exit the program.
 *
 * Supported Employee Types:
 * - Manager
 * - SalesPerson
 * - Intern
 *
 * Each employee has a base salary, and some roles have additional compensation (bonus or commission).
 */
public class BusinessSystem {

    public static void main(String[] args) {
        // Scanner object to read user input from console
        Scanner userInput = new Scanner(System.in);

        // List to store all employee objects
        List<Employee> employees = new ArrayList<>();

        // Adding some initial employees
        employees.add(new Manager(1, "Ahmed", 1000, 500));      // Manager with bonus
        employees.add(new SalesPerson(2, "Mohamed", 2000, 1000)); // SalesPerson with commission
        employees.add(new Intern(3, "Osama", 3000));             // Intern with only base salary

        boolean programIsRunning = true; // Flag to control main program loop

        // Main program loop
        while (programIsRunning) {
            // ====== Display Main Menu ======
            System.out.println("\n===========================================");
            System.out.println("   📋 Business Employee Management System  ");
            System.out.println("===========================================");
            System.out.println("1️⃣  Add Employee");
            System.out.println("2️⃣  View All Employees");
            System.out.println("3️⃣  View Total Payroll");
            System.out.println("4️⃣  Exit");
            System.out.println("===========================================");
            System.out.print("👉 Choose an option: ");

            // Read user menu choice
            int choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    // ====== Add New Employee ======
                    System.out.println("\n=========== Add New Employee ===========");
                    System.out.print("Enter Employee ID: ");
                    int id = userInput.nextInt();
                    userInput.nextLine(); // Consume newline

                    System.out.print("Enter Employee Name: ");
                    String name = userInput.nextLine();

                    System.out.print("Enter Employee Base Salary: ");
                    double baseSalary = userInput.nextDouble();
                    userInput.nextLine(); // Consume newline

                    // Select employee role
                    System.out.println("\nSelect Employee Role:");
                    System.out.println("1. Manager");
                    System.out.println("2. SalesPerson");
                    System.out.println("3. Intern");
                    System.out.print("👉 Choose an option: ");
                    int role = userInput.nextInt();
                    userInput.nextLine(); // Consume newline

                    // Create and add the selected employee type to the list
                    if (role == 1) {
                        System.out.print("Enter Bonus: ");
                        double bonus = userInput.nextDouble();
                        employees.add(new Manager(id, name, baseSalary, bonus));
                    } else if (role == 2) {
                        System.out.print("Enter Commission: ");
                        double commission = userInput.nextDouble();
                        employees.add(new SalesPerson(id, name, baseSalary, commission));
                    } else if (role == 3) {
                        employees.add(new Intern(id, name, baseSalary));
                    }

                    System.out.println("✅ Employee Added Successfully!");
                    System.out.println("===========================================");
                    break;

                case 2:
                    // ====== View All Employees ======
                    System.out.println("\n=========== All Employees Information ===========");
                    for (Employee employee : employees) {
                        employee.displayInfo(); // Display basic employee info
                        System.out.println("Calculated Salary: " + employee.calculateSalary()); // Show calculated salary

                        // Identify employee role
                        if (employee instanceof Manager) {
                            System.out.println("Employee Role: Manager");
                        } else if (employee instanceof SalesPerson) {
                            System.out.println("Employee Role: SalesPerson");
                        } else if (employee instanceof Intern) {
                            System.out.println("Employee Role: Intern");
                        }
                        System.out.println("-------------------------------------------");
                    }
                    System.out.println("👥 Total Employees Count: " + Employee.getEmployeeCount());
                    System.out.println("===========================================");
                    break;

                case 3:
                    // ====== View Total Payroll ======
                    double totalPayroll = 0;
                    for (Employee employee : employees) {
                        totalPayroll += employee.calculateSalary(); // Sum all salaries
                    }
                    System.out.println("\n=========== Total Payroll ===========");
                    System.out.println("💰 Total Payroll: " + totalPayroll);
                    System.out.println("===========================================");
                    break;

                case 4:
                    // ====== Exit Program ======
                    programIsRunning = false;
                    System.out.println("\n===========================================");
                    System.out.println("🚪 Program has been stopped. Thank You :)");
                    System.out.println("===========================================");
                    break;

                default:
                    // Invalid input handling
                    System.out.println("\n❌ Invalid choice, please try again!");
                    System.out.println("===========================================");
            }
        }

        // Close scanner to prevent resource leak
        userInput.close();
    }
}
