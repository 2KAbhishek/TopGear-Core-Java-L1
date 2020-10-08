public class Trainee extends Employee {
    double GPA;

    public Trainee(int empId, String ename, int eday, int emonth, int eyear, double sal, double gpa) {
        super(empId, ename, eday, emonth, eyear, sal);
        GPA = gpa;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("GPA: " + GPA);
    }
}
