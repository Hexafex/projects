import java.util.ArrayList;
import java.util.List;

public class TechnicalLead extends TechnicalEmployee {
    int headcount;
    double baseSalary;

    List<SoftwareEngineer> seList = new ArrayList();

    public TechnicalLead(String name) {
        super(name);
        this.baseSalary = super.getBaseSalary() * 1.3;
        this.headcount = 4;
    }
    @Override
    public double getBaseSalary(){
        return this.baseSalary;
    }

    public boolean hasHeadCount() {//depends on addReport
        if (headcount > (seList.size()) )
            return true;
        else
            return false;
    }

    public boolean addReport(SoftwareEngineer e) {// add to arrayList
        if (hasHeadCount()) {
            seList.add(e);
            e.manager=this;
            return true;
        } else
            return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        //checks if SE has code access
        if (seList.contains(e)&&e.getCodeAccess()){
            super.checkIns++;
            return true;
        }else
            return false;
        }

    public boolean requestBonus(Employee e, double bonus) {
        return false;
    }

    public String getTeamStatus() {
        String stat=this.employeeStatus();

        for (SoftwareEngineer e : this.seList){
            stat+="\n\t"+e.employeeStatus();
        }
        return stat;
    }
}


