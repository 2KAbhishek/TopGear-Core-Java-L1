import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumList {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter 10 numbers as command line arguments");
            System.exit(1);
        }

        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers as command line arguments");
            System.exit(1);
        }

        int[] numbers = new int[args.length];
        try {
            numbers = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        } catch (Exception e) {
            System.out.println("Please enter numbers only");
            System.exit(1);
        }

        ArrayList<Integer> numList = Arrays.stream(numbers).boxed().collect(Collectors.toCollection(ArrayList::new));

        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.print(" " + numList.get(i));
        }
    }
}
