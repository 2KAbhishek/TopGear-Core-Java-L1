import java.util.Hashtable;

public class CityCountry {
    public static void main(String[] args) {
        Hashtable<String, String> cities = new Hashtable<>();
        cities.put("Tokyo", "Japan");
        cities.put("Berlin", "Germany");
        cities.put("Bangalore", "India");
        cities.put("Paris", "France");
        cities.put("London", "UK");
        cities.put("Kolkata", "India");
        cities.put("Seattle", "USA");
        cities.put("Rome", "Italy");
        cities.put("Beijing", "China");
        cities.put("City", "Country");

        if (args.length == 0) {
            System.out.println("Please enter a city name as command line argument");
            System.exit(1);
        }

        if (!cities.containsKey(args[0])) {
            System.out.println(args[0] + " not in table");
            System.exit(1);
        }

        System.out.println(args[0] + " is in " + cities.get(args[0]));
    }
}
