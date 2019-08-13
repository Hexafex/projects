public class CompanyStructure {
    public static void main (String[] args){
    TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");

        System.out.println(CTO.getName() + ' ' +CTO.getBaseSalary());
        System.out.println(seA.getName() + ' ' +seA.getBaseSalary());



        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);

        System.out.println(CTO.seList.size());
        seA.setCodeAccess(true);
        seB.setCodeAccess(true);
        seC.setCodeAccess(true);

        seA.checkInCode();
        seB.checkInCode();
        seC.checkInCode();


       /* for (SoftwareEngineer e : CTO.seList){
            System.out.println(e.getName());
        }*/


        System.out.println(CTO.getTeamStatus());


    TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
    SoftwareEngineer seD = new SoftwareEngineer("Winter");
    SoftwareEngineer seE = new SoftwareEngineer("Libby");
    SoftwareEngineer seF = new SoftwareEngineer("Gizan");
    SoftwareEngineer seG = new SoftwareEngineer("Zaynah");

        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);

        seD.setCodeAccess(true);
        seE.setCodeAccess(true);
        seF.setCodeAccess(true);
        seG.setCodeAccess(true);


        seD.checkInCode();
        seE.checkInCode();
        seF.checkInCode();
        seG.checkInCode();
        System.out.println(VPofENG.getTeamStatus());

    BusinessLead CFO = new BusinessLead("Amy Hood");
    Accountant actA = new Accountant("Niky");
    Accountant actB = new Accountant("Andrew");

        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);

        System.out.println(CFO.acctList.size());

/*       for (Accountant e : CFO.acctList){
           System.out.println(e.getName());
       }*/
       System.out.println(CFO.getTeamStatus());
}
}
