/**
 * Class representing a Manager, which is a type of Employee.
 * In addition to base salary, a Manager has a bonus component.
 */
public class Manager extends Employee {

    /** Additional bonus amount for the manager */
    private double bonus;

    /**
     * Constructor to initialize a Manager with id, name, base salary, and bonus.
     *
     * @param id The unique identifier for the manager
     * @param name The full name of the manager
     * @param baseSalary The base salary of the manager
     * @param bonus The additional bonus for the manager
     */
    public Manager(int id, String name, double baseSalary, double bonus){
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    /**
     * Gets the manager's bonus amount.
     * @return The bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * Sets or updates the manager's bonus amount.
     * @param bonus The new bonus value
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * Calculates the total salary for the manager.
     * Overrides the abstract calculateSalary method in Employee.
     * Total salary = base salary + bonus.
     *
     * @return The calculated total salary of the manager
     */
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}
