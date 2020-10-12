import java.util.ResourceBundle;

public class ReadProperties {
    ResourceBundle resourcebundle;

    public ReadProperties() {
        resourcebundle = ResourceBundle.getBundle("Training");
        String sType[] = resourcebundle.getString("Type").split(",");
        String sBu[] = resourcebundle.getString("BU").split(",");
        String sLoc[] = resourcebundle.getString("Location").split(",");
        /*
         * Loop for getting each of the values present in the string array
         */
        for (int iIndex = 0; iIndex < sType.length; iIndex++) {
            System.out.println("Type :" + (iIndex + 1));
            System.out.println("Type :" + sType[iIndex]);
            System.out.println("BU :" + sBu[iIndex]);
            System.out.println("Loc :" + sLoc[iIndex]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReadProperties readproperties = new ReadProperties();
    }
}
