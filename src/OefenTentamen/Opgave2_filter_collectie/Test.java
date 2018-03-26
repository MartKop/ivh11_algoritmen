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

        Collection resultArrayList = returnDuplicates(collection);
        Collection resultLinkedList = returnDuplicates(linkedList);


        System.out.println(resultArrayList.size());
        System.out.println(resultLinkedList.size());
    }

    public static <E> Collection<E> returnDuplicates(Collection<E> list){
        Set<E> unique = new HashSet<>();
        Collection collection;

        if (list instanceof LinkedList) {
           collection = new LinkedList<E>();
        } else {
            collection = new ArrayList<E>();
//            try {
//                collection = list.getClass().newInstance();
//            } catch (Exception e) {
//                collection = new HashSet<E>();
//            }
        }

        for(E element : list ) {
            if(!unique.add(element) && !collection.contains(element)) {
                collection.add(element);
            }
        }

        return collection;
    }
}

