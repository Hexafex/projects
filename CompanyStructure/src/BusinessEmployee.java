public class BusinessEmployee extends Employee {
    public double bonusBudget;
    public BusinessEmployee(String name) {
        super(name, 50000.00);
    }

    public double getBonusBudget() {

        return bonusBudget;
    }

    public String employeeStatus() {
        String empStat = this.getEmployeeID() + " " + this.getName() + " with a budget of  " + bonusBudget;

        return empStat;
    }
}