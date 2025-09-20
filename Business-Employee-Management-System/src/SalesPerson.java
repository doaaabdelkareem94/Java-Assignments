/**
 * Class representing a SalesPerson, which is a type of Employee.
 * In addition to base salary, a SalesPerson earns a commission.
 */
public class SalesPerson extends Employee {

    /** Commission amount earned by the salesperson */
    private double commission;

    /**
     * Constructor to initialize a SalesPerson with id, name, base salary, and commission.
     *
     * @param id The unique identifier for the salesperson
     * @param name The full name of the salesperson
     * @param baseSalary The base salary of the salesperson
     * @param commission The commission amount for the salesperson
     */
    public SalesPerson(int id, String name, double baseSalary, double commission) {
        super(id, name, baseSalary);
        this.commission = commission;
    }

    /**
     * Gets the salesperson's commission amount.
     * @return The commission
     */
    public double getCommission() {
        return commission;
    }

    /**
     * Sets or updates the salesperson's commission amount.
     * @param commission The new commission value
     */
    public void setCommission(double commission) {
        this.commission = commission;
    }

    /**
     * Calculates the total salary for the salesperson.
     * Overrides the abstract calculateSalary method in Employee.
     * Total salary = base salary + commission.
     *
     * @return The calculated total salary of the salesperson
     */
    @Override
    public double calculateSalary() {
        return getBaseSalary() + commission;
    }
}
