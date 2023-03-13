package com.example.max.core;

import com.example.max.core.arraylist.CustomArrayList;
import com.example.max.core.linkedlist.CustomLinkedList;
import com.example.max.core.linkedlist.CustomList;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(5);
        System.out.println(customArrayList);

        CustomList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.addFirst("testFirst");
        customLinkedList.add("test");
        customLinkedList.addLast("testLast");
        System.out.println(customLinkedList);

    }
}
