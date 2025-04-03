import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        
        //create an ArrayList
        ArrayList<String> names = new ArrayList<>(); 


        //Add elements
        names.add("Kamal");
        names.add("VM");
        names.add("Abhi");
        names.add("Ravi");

        //print elemnents
        System.out.println("Names: " + names);  // output

        //Get an element
        System.out.println("First name: " + names.get(1));

        //Remove a name
        names.remove("VM");
        System.out.println("After removing VM : " + names);  //output

        // check size
        System.out.println("Size: " + names.size());  //output 
    }
}