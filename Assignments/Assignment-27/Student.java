class Student {
    private int iRollNo;
    private String sName;

    public void setrollNo(int iTempRollNo) {
        this.iRollNo = iTempRollNo;
    }

    public void setName(String sName) {
        this.sName = sName;
    }

    public int getRollNo() {
        return iRollNo;
    }

    public String getName() {
        return sName;
    }

    public static void main(String args[]) {
        Student[] objStudent = new Student[2];
        objStudent[0] = new Student();
        objStudent[0].setrollNo(39997);
        System.out.println(objStudent[0].getRollNo());
    }
}
