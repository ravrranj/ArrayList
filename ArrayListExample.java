
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExample {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    // Adding elements
    System.out.print("Enter the numbers :");
    for (int i = 0; i < 5; i++) {
        numbers.add(sc.nextInt());
    }

    System.out.println("Original List: " + numbers);
    
    //sorting the arraylist
    Collections.sort(numbers);
    System.out.println("Sorted List: " + numbers);

    //Searching for an element
    System.out.println("Enter the number to search : ");
    int serachNum = sc.nextInt();
    if(numbers.contains(serachNum)) {
        System.out.println(serachNum + " found inthe list.");
    } else {
        System.out.println(serachNum + "not found in the list.");
    }
    //removing the number from the list
    System.out.println("Enter a number to remove: ");
    int removeNum = sc.nextInt();
    numbers.remove(Integer.valueOf(removeNum));
    System.out.println("Updated List: " + numbers);

    sc.close();
    }
}