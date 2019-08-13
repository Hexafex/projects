import java.util.ArrayList;
import java.util.List;

public class BusinessLead extends BusinessEmployee {
    int headcount;
    double salary;
    List<Accountant> acctList = new ArrayList();

    public BusinessLead(String name) {
        super(name);
        this.salary=getBaseSalary()*2;
        this.headcount=10;

    }
    @Override
    public double getBaseSalary(){
        return salary;
    }

    public boolean hasHeadCount() {//depends of addReport
        if (headcount >acctList.size())
            return true;
        else
            return false;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (hasHeadCount()) {

                acctList.add(e);
                bonusBudget+=e.getBaseSalary()+(e.getBaseSalary()*1.1);
                e.supportTeam(supportTeam);

                return true;
            } else {
                return false;
            }

        }

    public boolean requestBonus(Employee e, double bonus) {
        return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        return false;
    }

        public String getTeamStatus() {

            String stat=this.employeeStatus();
            for (Accountant e : this.acctList){
                stat+="\n\t"+e.employeeStatus();

            }
            return stat;
          }
}