import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map favFoods = new HashMap();

        //Setting up a list of my favorite foods mapped to their types.
        favFoods.put("side", "buffalo wings");
        favFoods.put("pizza", "pepperoni");
        favFoods.put("salad", "caesar");
        favFoods.put("cookies", "peanut butter");
        favFoods.put("soda", "root beer");

        //My wife replaced my peanut butter cookies with her favorite
        favFoods.replace("cookies", "oreo");

        //Display the dinner menu, or "go buy cookies"
        if (favFoods.get("cookies") == "peanut butter") {
            //display dinner menu
            System.out.println("Dinner will be: ");
            for (Object key : favFoods.keySet()) {
                System.out.println(key + ": " + favFoods.get(key));
            }
        } else { System.out.println("Go buy cookies."); }
    }
}
