public class StringMan {
    public static void main(String[] args) {
        int count = 0;
        for (String s : args) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'w' || s.charAt(i) == 'W') {
                    count += 1;
                }
            }
        }
        System.out.println("Count of w & W : " + count);
        System.out.println(args[0].concat(args[1]).toUpperCase().replaceAll("W", "T"));
    }
}
