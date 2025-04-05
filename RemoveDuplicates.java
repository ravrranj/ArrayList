
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        //Convert list to Hashset to remove duplicates
        HashSet<Integer> set = new HashSet<>(list);

        System.out.println("HashSet content : " + set);

        //Convert back to ArrayList
        return new ArrayList<>(set);
        
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,6,8,9,1,2,5,7));
        System.out.println("Original List : " + numbers);

        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("List after removing duplicates : " + uniqueNumbers );
    }
}