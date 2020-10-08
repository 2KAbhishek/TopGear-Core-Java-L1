import java.util.Arrays;

public class SortCLINums {
    public static void main(String[] args) {
        float[] nums = new float[args.length];
        for (int i = 0; i < args.length; i++) {
            nums[i] = Float.parseFloat(args[i]);
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
