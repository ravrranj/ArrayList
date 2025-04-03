import java.util.ArrayList;
import java.util.List;

public class MaximumNumber {
    public static void main (String args[]) {
    
    ArrayList<Integer> numbers = new ArrayList<>();
    
    // add elements
    numbers.add(5);
    numbers.add(12);
    numbers.add(8);
    numbers.add(30);
    numbers.add(25);

    // printing the list
    System.out.println("numbers :" + numbers);
    

    //finding the max number in the list
    int max = numbers.get(0); //assume element at 1st index is max
    
    for ( int i = 0 ; i < numbers.size(); i++) {  // Start from index 1
        if (numbers.get(i) > max) {
            max = numbers.get(i); // update max if a larger number is found
        } 
    }

    // printing the max number
    System.out.println("Max number : " + max );
    }
    
}