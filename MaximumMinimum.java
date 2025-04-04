
import java.util.ArrayList;
import java.util.Arrays;

public class MaximumMinimum {
    public static void main(String[] args) {
       
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 8, 3, 2, 10, 6));

        System.out.println("List : " + list);  // printing the numbers 

        //edge case : empty list
        if(list.isEmpty()) {
            System.out.println("List is empty! ");
            return;
        }

        //finding max
        int max = list.get(0);

        for ( int i = 0; i < list.size(); i++) {
            if(list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max number : " + max);

        //finding min
        int min = list.get(0);

        for ( int j = 0 ; j < list.size(); j++) {
            if (list.get(j) < min) {
                min = list.get(j);
            }
        }
        System.out.println("Min number : " + min);
    }
}