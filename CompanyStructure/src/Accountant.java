public class Accountant extends BusinessEmployee{

double bonusBudget;
private TechnicalLead support;

    public Accountant(String name){
        super(name);
    }
    public TechnicalLead getTeamSupported(){

       return support;

    }
    public void supportTeam(TechnicalLead lead){
        this.support=lead;
         this.bonusBudget=lead.seList.size()*(lead.getBaseSalary()/1.3)*1.1;

    }
    public boolean approveBonus(double bonus){
        if (bonus<bonusBudget){
            return true;
        }else
        return false;
    }
    public String employeeStatus(){
        String newDouble=String.format("%.2f",this.bonusBudget);
        String stat=this.getEmployeeID()+" "+this.getName()+" with a budget of "+ newDouble+ " is supporting "+support;//manager's name
        return stat;
    }
}