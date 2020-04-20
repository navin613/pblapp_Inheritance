public class Employee extends Person {
    double salary;
    int yearStarted;
    String insuranceNo;
    
    Employee(String n, int d, double sal, int yearStart, String insNo){
        super(n,d);
        salary = sal;
        yearStarted = yearStart;
        insuranceNo = insNo;
    }
    
    public String getEmployee(){
        return "Employee Information : \n"+super.getPerson()+"\nSalary : "+salary +"\nYear in which started : "+yearStarted + "\nInsurance Number : "+insuranceNo; 
    }
}
