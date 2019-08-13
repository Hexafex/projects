public class TechnicalEmployee extends Employee {
public int checkIns;

    public TechnicalEmployee(String name){
        super(name,75000.00);

    }
    public String employeeStatus(){

        String empStat = getEmployeeID()+" "+getName()+" has "+this.checkIns+" Successful check ins";

        return empStat;
    }
}
