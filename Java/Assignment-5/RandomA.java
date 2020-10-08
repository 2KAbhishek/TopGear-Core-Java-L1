public class RandomA {
    void rndMsg() {
        double val = Math.random();
        if (val < 0.5) {
            System.out.println("The value is less than 0.5");
        } else {
            System.out.println("The value is greater than 0.5");
        }
    }
}
