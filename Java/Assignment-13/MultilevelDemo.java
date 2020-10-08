public class MultilevelDemo {
    public static void main(String args[]) {
        Person objectPerson = new Person("Sanjay", 10, 11, 1967);
        objectPerson.displayDetails();
        Employee objectEmployee = new Employee(111, "Dennis", 21, 3, 2001, 48000);
        objectEmployee.displayDetails();
        objectPerson = objectEmployee;
        objectPerson.displayDetails();
        Trainee objectTrainee = new Trainee(2000, "Abhishek", 28, 9, 2020, 24000, 8.4);
        objectTrainee.displayDetails();
        objectPerson = objectTrainee;
        objectPerson.displayDetails();
    }
}
