import java.io.OutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ByteWriter {
    public void writeBytes(OutputStream outStream) {
        try {
            outStream.write(65);
            outStream.write(66);
            outStream.write(67);
        } catch (IOException e) {
            System.out.println("Error = " + e);
        }
    }

    public static void main(String[] args) {
        try {
            ByteArrayOutputStream objByteArray = new ByteArrayOutputStream();
            FileOutputStream objFileOp = new FileOutputStream("Trng.data");
            ByteWriter objByte = new ByteWriter();

            objByte.writeBytes(System.out);
            objByte.writeBytes(objByteArray);

            objByte.writeBytes(objFileOp);

            byte bArray[] = objByteArray.toByteArray();
            for (int iIndex = 0; iIndex < bArray.length; ++iIndex) {
                System.out.println(bArray[iIndex]);
            }

            FileInputStream objFileIp = new FileInputStream("Trng.data");
            int iValue = objFileIp.read();
            while (iValue != -1) {
                System.out.println((byte) iValue);
                iValue = objFileIp.read();
            }
            objFileIp.close();
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }
}
