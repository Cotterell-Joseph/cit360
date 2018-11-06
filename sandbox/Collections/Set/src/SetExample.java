import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]) {

        //Note the duplicate entry for 22 in the array.
        int count[] = {34,22,10,60,30,22};

        //Create the set
        Set<Integer> set = new HashSet<Integer>();
        try {

            //Iterate the array and place the values in the new Set. The last entry will be ignored.
            for (int i = 0; i <= 5; i++) {
                set.add(count[i]);
            }

            //This will not include the second entry for 22 as it has been dropped as a duplicate.
            System.out.println(set);

            //Convert to a TreeSet (ordered).
            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            //Since the set is ordered, the first and last values will be the min and max.
            System.out.println("The first element of the set is: " + (Integer)sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer)sortedSet.last());
        }
        catch (Exception e) {}
    }
}
