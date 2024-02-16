package guvitask;

public class Employee extends Person {
    private String employeeID;
    private double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); 
        this.employeeID = employeeID;
        this.salary = salary;
    }

    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID + ", Salary: " + salary);
    }

    
    public String getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}



