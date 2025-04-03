import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEven {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    

    // taking inputs
    
    System.out.println("Enter the number of elements : ");
    int n = sc.nextInt();

    System.out.println("Enter the elements: ");
    for( int i = 0; i < n ; i++ ) {
        numbers.add(sc.nextInt());
        }

        //Removing even numbers
        numbers.removeIf(num -> num % 2 == 0);

        //Printing the elements without even numbers
        System.out.println("List after removing even numbers: " + numbers);

        sc.close();
    }
}
