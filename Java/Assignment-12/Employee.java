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

    public static void main(String args[]) {
        Person objectPerson = new Person("Sanjay", 10, 11, 1967);
        objectPerson.displayDetails();
        Employee objectEmployee = new Employee(111, "Dennis", 21, 03, 2001, 48000);
        objectEmployee.displayDetails();
        objectPerson = objectEmployee;
        objectPerson.displayDetails();
    }
}
