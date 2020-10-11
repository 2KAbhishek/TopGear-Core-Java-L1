import java.io.*;

public class SerializationDemo {
    public static void main(String args[]) {
        try {
            Employee objEmployee = new Employee("Abhishek Keshri", 20171268, 30000);
            FileOutputStream objFileOp = new FileOutputStream("Object.data");
            ObjectOutputStream objectOp = new ObjectOutputStream(objFileOp);
            objectOp.writeObject(objEmployee);
            System.out.print("Object Written to a File ");
            objectOp.flush();
            objectOp.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            System.exit(0);
        }

        try {
            Employee objEmp;
            FileInputStream objFileIp = new FileInputStream("Object.data");
            ObjectInputStream objectIp = new ObjectInputStream(objFileIp);
            objEmp = (Employee) objectIp.readObject();
            System.out.println("Contents Are : " + objEmp);
            objectIp.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            System.exit(0);
        }
    }
}
