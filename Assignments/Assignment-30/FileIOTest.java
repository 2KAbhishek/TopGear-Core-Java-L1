import java.io.*;

public class FileIOTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream objFile = new FileOutputStream("Trng.data");
        byte b1 = 65, b2 = 66, b3 = 67;
        objFile.write(b1);
        objFile.write(b2);
        objFile.write(b3);
        objFile.close();
        FileInputStream objFileIp = new FileInputStream("Trng.data");
        int iValue = objFileIp.read();
        while (iValue != -1) {
            System.out.println((byte) iValue);
            iValue = objFileIp.read();
        }
        objFileIp.close();
    }
}
