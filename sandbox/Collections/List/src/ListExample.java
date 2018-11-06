import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //Create an ArrayList to store states where I have lived, in order.
        List<String> stateList = new ArrayList<String>();

        //Add states to the list. They can be repeated.
        stateList.add("Washington");
        stateList.add("Louisiana");
        stateList.add("Nevada");
        stateList.add("Utah");
        stateList.add("Washington");
        stateList.add("Nevada");
        stateList.add("California");
        stateList.add("Idaho");
        stateList.add("Washington");
        stateList.add("Minnesota");
        stateList.add("Idaho");

        //I didn't actually live in MN. Remove Minnesota by index value.
        stateList.remove(9);

        //Display states that I have lived in.

        System.out.print("I have lived in the following states in this order: ");

        for (int i = 0; i < stateList.size(); i++) {
            System.out.print(stateList.get(i));
            if(i != 10) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }
}
