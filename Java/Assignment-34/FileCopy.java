import java.io.*;

public class FileCopy {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.err.println("Usage: java FileCopy file1 file2");
            System.exit(1);
        }
        File inFile = new File(args[0]);
        File outFile = new File(args[1]);
        try {
            BufferedReader objReader = new BufferedReader(new FileReader(inFile));
            BufferedWriter objWriter = new BufferedWriter(new FileWriter(outFile));
            String sStr = null;
            while ((sStr = objReader.readLine()) != null) {
                objWriter.write(sStr);
                objWriter.newLine();
            }
            objReader.close();
            objWriter.close();
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }
    }
}
