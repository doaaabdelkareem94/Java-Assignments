/**
 * Class representing an Intern, which is a type of Employee.
 * Interns have a fixed salary regardless of their base salary.
 */
public class Intern extends Employee {

    /**
     * Constructor to initialize an Intern with id, name, and base salary.
     *
     * @param id The unique identifier for the intern
     * @param name The full name of the intern
     * @param baseSalary The base salary of the intern (not used in final salary calculation)
     */
    public Intern(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    /**
     * Calculates the total salary for the intern.
     * Overrides the abstract calculateSalary method in Employee.
     * Interns have a fixed salary of 3000.
     *
     * @return The fixed salary of the intern (3000)
     */
    @Override
    public double calculateSalary() {
        return 3000;
    }
}
