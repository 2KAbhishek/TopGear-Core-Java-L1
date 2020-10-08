
public class ConstructorOverload {
    int iNo1, iNo2;

    public ConstructorOverload(int iNumber) {
        iNo1 = iNumber;
        System.out.print("Constructor with one argument :- ");
        System.out.println("iNo1: " + iNo1 + " " + "iNo2: " + iNo2);
    }

    public ConstructorOverload(int iFirst, int iSecond) {
        iNo1 = iFirst;
        iNo2 = iSecond;
        System.out.print("Cons. with two arguments :- ");
        System.out.println("iNo1: " + iNo1 + " " + "iNo2: " + iNo2);
    }

    public ConstructorOverload() {
        System.out.print("Default Constructor :- ");
        System.out.println("iNo1: " + iNo1 + " " + "iNo2: " + iNo2);
    }
}
