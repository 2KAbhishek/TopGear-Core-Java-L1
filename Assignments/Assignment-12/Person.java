public class Person {
    String sName;
    int iDay, iMonth, iYear;

    public Person(String sTemp, int iTd, int iTm, int iTy) {
        sName = sTemp;
        iDay = iTd;
        iMonth = iTm;
        iYear = iTy;
    }

    public void displayDetails() {
        System.out.println();
        System.out.println("Name : " + sName);
        System.out.println("DOJ : " + iDay + "-" + iMonth + "-" + iYear);
    }
}
