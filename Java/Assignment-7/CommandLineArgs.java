public class CommandLineArgs {
    public static void main(String args[]) {
        if (args.length < 2 || args.length > 2) {
            System.out.println("Invalid no of arguments, Supply exactly two arguments");
            System.exit(0);
        }
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
