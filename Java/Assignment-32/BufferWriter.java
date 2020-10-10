import java.io.OutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class BufferWriter {
    public void writeBytes(OutputStream outStream) {
        try {
            outStream.write(65);
            outStream.write(66);
            outStream.write(67);
            // outStream.write("\n".codePointAt(0));
            outStream.flush();
        } catch (IOException e) {
            System.out.println("Error = " + e);
        }
    }

    public static void main(String[] args) {
        try {
            BufferWriter objByte = new BufferWriter();

            FileOutputStream objFileOp = new FileOutputStream("Trng.data");
            ByteArrayOutputStream objByteArrayOp = new ByteArrayOutputStream();

            BufferedOutputStream sysOut = new BufferedOutputStream(System.out);
            BufferedOutputStream fileOut = new BufferedOutputStream(objFileOp);
            BufferedOutputStream byteOut = new BufferedOutputStream(objByteArrayOp);

            objByte.writeBytes(fileOut);
            objByte.writeBytes(byteOut);
            objByte.writeBytes(sysOut);

            ByteArrayInputStream objByteArrayIn = new ByteArrayInputStream(objByteArrayOp.toByteArray());
            BufferedInputStream byteIn = new BufferedInputStream(objByteArrayIn);
            int bValue = byteIn.read();
            while (bValue != -1) {
                System.out.println((byte) bValue);
                bValue = byteIn.read();
            }

            FileInputStream objFileIp = new FileInputStream("Trng.data");
            BufferedInputStream fileIn = new BufferedInputStream(objFileIp);
            int iValue = fileIn.read();
            while (iValue != -1) {
                System.out.println((byte) iValue);
                iValue = fileIn.read();
            }
            objFileIp.close();
        } catch (IOException e) {
            System.out.println("Error : " + e);
        }
    }
}
