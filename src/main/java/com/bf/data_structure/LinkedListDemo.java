package com.bf.data_structure;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(linkedList.toString());

        linkedList.addFirst("1");
        linkedList.addLast("9"); // add 就是 addLast
        System.out.println(linkedList);

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
        System.out.println(linkedList.peek());

        linkedList.add(1, "x");
        System.out.println(linkedList);

    }
}
