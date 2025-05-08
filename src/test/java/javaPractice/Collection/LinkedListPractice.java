package javaPractice.Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Naveen");
        linkedList.remove("Naveenn");
        linkedList.add(1,"Testing");
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        linkedList.add("Zombie");
        linkedList.add("Apple");
        linkedList.get(2);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);

        HashSet<String> set= new HashSet<>();
        set.add("Naveen");
    }
}
