package com.example.max.core;

import com.example.max.core.arraylist.CustomArrayList;
import com.example.max.core.arraylist.CustomList;
import com.example.max.core.linkedlist.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(5);
        System.out.println(customArrayList);

        com.example.max.core.linkedlist.CustomList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.addFirst("testFirst");
        customLinkedList.add("test");
        customLinkedList.addLast("testLast");
        System.out.println(customLinkedList);

    }
}
