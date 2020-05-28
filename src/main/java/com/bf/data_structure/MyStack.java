package com.bf.data_structure;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-28 09:34
 **/
public class MyStack<T> {

    private Node last;

    // 从表头 插入元素
    // 新元素当作表头
    public void push(T t) {
        Node<T> oldLast = last;

        Node<T> newLast = new Node<>();
        newLast.item = t;
        newLast.next = oldLast;

        last = newLast;
    }

    // 将最近插入的元素删除
    public Node<T> pop() {
        Node<T> oldLast = last;
        last = last.next;
        return oldLast;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "last=" + last +
                '}';
    }
    public void print() {
        Node a = last;

        while ( a != null) {
            System.out.println(a);
            a = a.next;

        }
    }

    class Node<T> {
        private T item;
        private Node next;

        @Override
        public String toString() {
            return item.toString();
        }
    }

    public static void main(String[] args) {

        MyStack<Object> myStack = new MyStack<>();
        myStack.push("a");
        myStack.push("b");
        myStack.push("c");


        // 打印序列的所有元素
        myStack.print();
        System.out.println("------------");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.print();


    }

}
