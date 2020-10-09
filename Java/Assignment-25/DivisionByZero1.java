public class DivisionByZero1 {
    public void division() {
        int iNumerator = 10;
        int iDenominator = 0;
        try {
            System.out.println(iNumerator + "/" + iDenominator + "=" + (iNumerator / iDenominator));
        } catch (Exception e) {
        } finally {
            System.out.println("End of Excep.Finally Block");
        }
        return;
    }

    public static void main(String args[]) {
        new DivisionByZero1().division();
        System.out.println("End of Main");
    }
}
