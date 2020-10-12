class DivisionByZeroException extends Exception {
    // (1)
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}

public class DivisionByZero2 {
    public void division() throws DivisionByZeroException { // (2)
        int iNumerator = 10;
        int iDenominator = 0;
        if (iDenominator == 0)
            throw new DivisionByZeroException("Divide By Zero");
        // (3)
        System.out.println(iNumerator + "/" + iDenominator + "=" + (iNumerator / iDenominator));
        System.out.println("End of Function ");
    }

    public static void main(String args[]) {
        try {
            new DivisionByZero2().division();
        } catch (DivisionByZeroException e) {
            // (4)
            System.out.println("Error " + e);
        } finally {
            System.out.println("Finally Block");
        }
        System.out.println("End of main.");
    }
}
