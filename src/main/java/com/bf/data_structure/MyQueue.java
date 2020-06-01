package com.bf.data_structure;

/**
 * @description: 链表 实现 队列
 * 先进先出
 * 栈 只需要 经常需要操作 最近加入的元素，
 * 而 队列 即需要操作 最近加入的元素，也需要操作 最开始加入的元素
 * @author: bofei
 * @date: 2020-05-28 09:24
 **/

public class MyQueue<T> {
    Node first;
    Node last;
    private int n;

    // 从表尾插入
    // 新元素 成为 表尾
    public void enq(T item) {
        Node newNode = new Node();
        newNode.item = item;
        if (null != first) {
            last.next = newNode; // 最后一个元素的next = 新元素
            last = newNode;
        } else {
            last = first = newNode; // 只有一个元素 时， last = first
        }
        n++;
    }
    // 从表头 移除
    // 将 最开始插入的元素移除
    public T deq() {
        Node oldFirst = first;
        first = first.next;
        n--;
        return oldFirst.item;
    }

    public int size() {
        return n;
    }
    class Node {
        private T item;
        private Node next;
    }



    public static void main(String[] args) {
        MyQueue<Object> myQueue = new MyQueue<>();
        myQueue.enq("a");
        myQueue.enq("b");
        myQueue.enq("c");
        System.out.println(myQueue.size());
        System.out.println(myQueue.deq());
        System.out.println(myQueue.deq());
        System.out.println(myQueue.deq());
    }
}
