import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListImplementation {
    public static void main (String [] args)
    {
        //LinkedList Add the Entries into the List
        LinkedList<String> L1 = new LinkedList<>();
        L1.add("Entry 1");
        L1.add("Entry 2");
        L1.add("Entry 3");
        L1.add("Entry 4");


        System.out.println(L1);

        //LinkedList Add Elements to the Beginning of the LinkedList
        L1.add(0, "Entry 0");

        System.out.println("List after adding to the first position---");
        System.out.println(L1);

        //LinkedList Size
        System.out.println("The size of the LinkedList is : " + L1.size());

        // Return an Array of the elements of the Linkedlist - First to Last
        String [] arr = new String[L1.size()];
        L1.toArray(arr);

        System.out.println("Print form an array converted from the LinkedList---");

        int i =0;
        for(String s : arr){

            System.out.println("Array at the "+i+"th position is : "+s);
            i++;
        }

        //reverse a linked List
        System.out.println("Reverse a LinkedList ---");
        Iterator<String> obj = L1.descendingIterator();

        while(obj.hasNext()){

            System.out.println(obj.next());
        }


    }

}
