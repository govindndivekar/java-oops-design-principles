package SOLID.SingleResponsibilityPrinciple.after;

public class Main {

    public static void main(String[] args){
        Employee employee = new Employee("Govind", "Divekar");
        MonthlySalary salary = new MonthlySalary(10000);
        NbTimePerWeek noOfHours = new NbTimePerWeek(70);
        ISaveEmployeeRecords saveEmployeeRecords = new SaveEmployeeRecordsToDB();
        saveEmployeeRecords.saveEmployeeRecords(employee,salary,noOfHours);
    }
}
