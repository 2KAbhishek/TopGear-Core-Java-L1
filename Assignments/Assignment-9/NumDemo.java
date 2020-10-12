public class NumDemo {
    public static void main(String[] args) {
        float num = Float.parseFloat(args[0]);
        System.out.println("Abosolute Value: " + Math.abs(num));
        System.out.println("Rounded Value: " + Math.floor(num));
        System.out.println("Square Root: " + Math.sqrt(num));
    }
}
