/**
 * Abstract class representing a generic Employee.
 * Provides common attributes and behaviors shared among all types of employees.
 */
public abstract class Employee {

    /** Unique identifier for the employee */
    private int id;

    /** Name of the employee */
    private String name;

    /** Base salary of the employee */
    private double baseSalary;

    /** Static counter to keep track of total number of employees created */
    private static int employeeCount = 0;

    /**
     * Constructor to initialize an Employee with id, name, and base salary.
     * Increments the static employee count whenever a new employee is created.
     *
     * @param id The unique identifier for the employee
     * @param name The full name of the employee
     * @param baseSalary The base salary of the employee
     */
    public Employee(int id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    /**
     * Gets the employee's ID.
     * @return The unique identifier of the employee
     */
    public int getId() {
        return id;
    }

    /**
     * Sets or updates the employee's ID.
     * @param id The new ID for the employee
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the employee's name.
     * @return The full name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Sets or updates the employee's name.
     * @param name The new name of the employee
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the base salary of the employee.
     * @return The base salary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Sets or updates the base salary of the employee.
     * @param baseSalary The new base salary
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Gets the total number of Employee instances created.
     * @return The total employee count
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }

    /**
     * Abstract method to calculate the total salary of an employee.
     * Must be implemented by subclasses to provide specific salary calculation logic.
     * @return The calculated salary
     */
    public abstract double calculateSalary();

    /**
     * Displays the employee's basic information: ID, name, and base salary.
     */
    public void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
