import java.io.*;

class DataIOApp {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try {
            DataOutputStream objDataOp = new DataOutputStream(new FileOutputStream("Trng.data")); // (1)
            double[] dExp = { 9.5, 9.7, 3.3, 2.9, 4.9 };
            int[] iEmpno = { 120, 210, 390, 480, 570 };
            String[] sName = { "Ashwaq", "Jagan", "Konrad", "Shekar", "Gopal" };
            for (int iIndex = 0; iIndex < dExp.length; iIndex++) { // (2)
                objDataOp.writeDouble(dExp[iIndex]);
                objDataOp.writeChar('\t');
                objDataOp.writeInt(iEmpno[iIndex]);
                objDataOp.writeChar('\t');
                objDataOp.writeChars(sName[iIndex]);
                objDataOp.writeChar('\n');
            }
            objDataOp.close();
        } catch (IOException E) {
            System.out.println("Error: " + E);
        }
        try {
            DataInputStream objDataIp = new DataInputStream(new FileInputStream("Trng.data")); // (3)
            double dExp;
            int iEmpno;
            String sName;
            double total = 0.0;
            try {
                while (true) {
                    dExp = objDataIp.readDouble(); // (4)
                    objDataIp.readChar();// throws out tab
                    iEmpno = objDataIp.readInt();
                    objDataIp.readChar();// throws out tab
                    sName = objDataIp.readLine();
                    System.out.println("Contents: " + sName + " " + dExp + " " + iEmpno);
                }
            } catch (EOFException e) {
                System.out.println("File End Reached : " + e);
            }
            objDataIp.close();
        } catch (Exception f) {
            System.out.println("File Not Found : " + f);
        }
    }
}
