package Wipro.TT.ProjectZone;

public class AccessSpecifiers {
    int iDefNo;
    protected int iProNo;
    private int iPriNo;

    public AccessSpecifiers() {
        iDefNo = 10;
        iProNo = 20;
        iPriNo = 50;
    }

    public void display() {
        System.out.println("From the public function");
        System.out.println("iDefNo = " + iDefNo);
        System.out.println("iProNo = " + iProNo);
        System.out.println("iPriNo = " + iPriNo);
    }
}
