package SOLID.SingleResponsibilityPrinciple.after;

public class Employee {

    String firstName;
    String lastName;
    String emailId;

    public Employee(String firstName,String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = this.firstName + "." + this.lastName + "@abc.com";
    }

    public String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.emailId;
    }
}
