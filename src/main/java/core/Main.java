package core;

import core.arraylist.CustomArrayList;
import core.arraylist.CustomList;
import core.linkedlist.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(5);
        System.out.println(customArrayList);

        core.linkedlist.CustomList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.addFirst("testFirst");
        customLinkedList.add("test");
        customLinkedList.addLast("testLast");
        System.out.println(customLinkedList);

    }
}
