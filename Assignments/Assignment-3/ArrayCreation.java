public class ArrayCreation {
    int aiArray[];

    public ArrayCreation() {
        aiArray = new int[12];
    }

    public void arrayValues() {
        for (int iIndex = 0; iIndex < 12; iIndex++) {
            aiArray[iIndex] = iIndex + 1;
        }
    }

    public void arrayDisplay() {
        for (int iIndex = 0; iIndex < 12; iIndex++) {
            System.out.println("aiArray[ " + iIndex + " ] = " + aiArray[iIndex]);
        }
    }
}
