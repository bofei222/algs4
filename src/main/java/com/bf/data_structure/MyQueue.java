package com.bf.data_structure;

/**
 * @description: 链表 实现 队列
 * @author: bofei
 * @date: 2020-05-28 09:24
 **/

public class MyQueue<T> {
    Node first;

    // 从表尾插入
    //
    public void add(T item) {
        if (first != null) {
            Node newNode = new Node();
            newNode.item = item;
            newNode.next = first;
        } else {

        }

    }

    public Node remove() {
        return first;
    }
    class Node {
        private T item;
        private Node next;
    }

    public static void main(String[] args) {
        MyQueue<Object> myQueue = new MyQueue<>();
        myQueue.add("a");
        myQueue.add("b");
        System.out.println(myQueue.remove());
    }
}
