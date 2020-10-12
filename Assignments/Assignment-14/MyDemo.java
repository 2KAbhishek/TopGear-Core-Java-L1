final class MyDemo extends Demo {
    int value;

    // MyDemo(int temp){ value = temp; }
    // (2)
    public static void main(String args[]) {
        Demo object = new MyDemo();
    }

    void getValues() {
    }

    void compute() {
    }

    void incrementCount() {
        count++;
    } // (3)
    // void incrementNumber() { number++; } // (4)
}
