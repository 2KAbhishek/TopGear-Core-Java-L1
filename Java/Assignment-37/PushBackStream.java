import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackStream {
    public static void main(String[] args) {
        String data = "This is Java Input/Output";
        try {
            ByteArrayOutputStream objByteArrayOp = new ByteArrayOutputStream();
            byte[] dataArray = data.getBytes();
            objByteArrayOp.write(dataArray);

            ByteArrayInputStream objByteArrayIn = new ByteArrayInputStream(objByteArrayOp.toByteArray());
            PushbackInputStream inStream = new PushbackInputStream(objByteArrayIn);

            char ch = (char) inStream.read();
            System.out.println("First character of inStream is " + ch);

            inStream.unread((int) Character.toLowerCase(ch));
            ch = (char) inStream.read();
            System.out.println("Now first character of stream is " + ch);

        } catch (IOException e) {
            System.out.println("Exception " + e);
        }

    }
}
