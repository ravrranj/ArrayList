
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));  // list 1

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));  // list 2
        

        ArrayList<Integer> mergedList = new ArrayList<>(); // Merged list
        int i = 0, j = 0;
        
        

        //meregd both the lists using two pointers

        while ( i < list1.size() && j < list2.size()) {
            if(list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++; // move pointer of list 1
            } else {
                mergedList.add(list2.get(j));
                j++; // move pointer of list2 
            }
        }


        //Add remaining elements from list 1 (if any)
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        //add remaining elements from klist 2 ( if any)
        while ( j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        System.out.println("Merged List: " + mergedList);
            }
        }
