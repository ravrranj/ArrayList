

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArrayList {
    public static boolean isPlaindrome (ArrayList<Integer> list) {

    //taking two pointers left and right 
    int left = 0, right = list.size() - 1;

    while (left < right) {
        if (!list.get(left).equals(list.get(right))) {
            return false;  //not a palindrome 
        }
        left++;
        right--;
    }
    return true; //it's is a palindrome

    }

    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(1,2,3,2,1));
        System.out.println("Is Plaindrome ? " + isPlaindrome(list1)); //output true

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1));
        System.out.println("Is Palindrome ? " + isPlaindrome(list2));  //output false

    }
}