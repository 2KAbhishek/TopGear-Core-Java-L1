import java.io.*;

class BufferedReaderDemo {
    public static void main(String s[]) throws IOException {
        System.out.println("Enter the String to check");
        BufferedReader objReader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = objReader.readLine();
        System.out.println(sStr);
        int iCount = 0, iLoc;

        for (int iIndex = 1; iIndex < sStr.length(); iIndex++) {
            iLoc = sStr.charAt(iIndex);
            if (iLoc == 32) {
                iCount++;
            }
        }
        System.out.println("No. of Blankspaces = " + iCount);
    }
}
