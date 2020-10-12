public class Employee extends Person {
    int employeeId;
    double salary;

    public Employee(int empId, String ename, int eday, int emonth, int eyear, double sal) {
        super(ename, eday, emonth, eyear);
        employeeId = empId;
        salary = sal;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Salary : " + salary);
    }
}
