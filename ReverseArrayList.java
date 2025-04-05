
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ReverseArrayList {
    public static void main(String[] args) {
       
        // Input , strung elements
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "C++", "Java Script", "Python"));
        System.out.println("Original List: " + list);

        //Reverse the string using Collection.reverse
        Collections.reverse(list);

        System.out.println("Reversed List : " + list);

    }
}
