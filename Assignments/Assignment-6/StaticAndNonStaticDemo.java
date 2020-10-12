public class StaticAndNonStaticDemo {
    public static void main(String args[]) {
        System.out.println("Before creating objects");
        StaticAndNonStatic.displayObjectCount();
        System.out.println();
        System.out.println("After creating objects");
        StaticAndNonStatic object = new StaticAndNonStatic('N');
        StaticAndNonStatic.displayObjectCount();
        object.displayUserChoice();
    }
}
