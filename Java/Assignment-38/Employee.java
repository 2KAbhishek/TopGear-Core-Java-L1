import java.io.Serializable;

class Employee implements Serializable {
    String sName;
    int iEmpNo;
    double dSalary;

    public Employee(String sName, int iEmpNo, double dSalary) {
        this.sName = sName;
        this.iEmpNo = iEmpNo;
        this.dSalary = dSalary;
    }

    public String toString() {
        return "Name = " + sName + "; Empno = " + iEmpNo + "; Salary = " + dSalary;
    }
}
