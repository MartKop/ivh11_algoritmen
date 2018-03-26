package OefenTentamen.Opgave2_filter_collectie;

import javax.xml.soap.Node;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        List linkedList = new LinkedList<Integer>();
        List collection = new ArrayList<Integer>();
        collection.add(7);
        collection.add(1);
        collection.add(2);
        collection.add(5);
        collection.add(1);
        collection.add(3);
        collection.add(1);
        collection.add(3);
        collection.add(7);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(7);
        linkedList.add(7);
        linkedList.add(5);
        linkedList.add(9);

        Collection resultArrayList = findDuplicatesInList(collection);
        Collection resultLinkedList = findDuplicatesInList(linkedList);


        System.out.println(resultArrayList.size());
        System.out.println(resultLinkedList.size());
    }

    public static Collection findDuplicatesInList(List<Integer> list) {
        Set<Integer> unique = new HashSet<>();
        List<Number> duplicates = new ArrayList<>();
        for(Integer n : list ) {
            if(!unique.add(n) && !duplicates.contains(n)) {
                duplicates.add(n);
            }
        }
        return duplicates;
    }

}

