public class StaticAndNonStatic {
    static int iStatic;
    char cChoice;

    StaticAndNonStatic(char choice) {
        iStatic++;
        cChoice = choice;
    }

    static void displayObjectCount() {
        System.out.println("Value of iStatic : " + iStatic);
    }

    void displayUserChoice() {
        System.out.println("The user choice is " + cChoice);
    }
}
