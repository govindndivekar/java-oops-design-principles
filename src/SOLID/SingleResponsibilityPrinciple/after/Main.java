package SOLID.SingleResponsibilityPrinciple.after;

public class Main {

    public static void main(String[] args){
        Employee employee = new Employee("Govind", "Divekar");
        MonthlySalary salary = new MonthlySalary(10000);
        NbTimePerWeek noOfHours = new NbTimePerWeek(70);
        EmployeeType employeeType = EmployeeType.RFT;
        ISaveEmployeeRecords saveEmployeeRecords = new SaveEmployeeRecordsToFile();
        saveEmployeeRecords.saveEmployeeRecords(employee,salary,noOfHours,employeeType);
    }
}
