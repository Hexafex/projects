public class SoftwareEngineer extends TechnicalEmployee {
    Boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        codeAccess=false;
    }

    public boolean getCodeAccess() {

        return codeAccess;
    }

    public void setCodeAccess(boolean access) {

        codeAccess = access;
    }

    public int getSuccessfulCheckIns() {

            this.checkIns++;

        return this.checkIns;
    }

    public boolean checkInCode() {
        TechnicalLead manager =(TechnicalLead)this.manager;
        if(manager.approveCheckIn(this)){
            super.checkIns++;
            return true;
        }else{
            this.codeAccess=false;
            return false;
        }
    }
}