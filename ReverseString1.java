
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Frontend", "Back-end", "Full Stack", "Devops"));
        System.out.println("Original List: " + list);
        
        //Reverse manually by swapping

        int left = 0, right = list.size() - 1;
        while (left < right) {
            //swap elements
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed list: " + list);
    }
}