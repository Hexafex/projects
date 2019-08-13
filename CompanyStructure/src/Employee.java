public class Employee {
    private  String name;
    private  double salary;
    public static int employeeID;
    public Employee manager;

    public Employee(String employeeName,Double employeeBaseSalary){
        name=employeeName;
        salary=employeeBaseSalary;

    }
    public double getBaseSalary() {
        return salary;
    }
    public String getName() {

        return name;
    }
    public int getEmployeeID(){
        employeeID++;
        return employeeID;
    }
    public Employee getManager(){

        return manager;
    }

    public boolean equals(Employee other){
        boolean isSame=false;

            if (this.employeeID==other.employeeID){
                isSame=true;
            }

            return isSame;
    }

    public String toString(){

        String employeeInfo = getEmployeeID() +" "+getName();
        return employeeInfo;
    }

    public String employeeStatus(){
        String empStat="";

        return empStat;
    }

}

