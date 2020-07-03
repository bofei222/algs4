package com.bf.test;

import java.util.Stack;

/**
 * @description:
 * @author: bofei
 * @date: 2020-07-03 16:52
 **/
class ListNode<T> {
    public T value;
    public ListNode<T> next;

    public ListNode() {
    }

    public ListNode(T value, ListNode<T> next) {
        super();
        this.value = value;
        this.next = next;
    }

    public ListNode<T> pre;
}

public class MiniList<T> {

    private ListNode<T> head = new ListNode<T>(null, null);

    /**
     * 数组转化成链表
     */
    public void arrayToList(T[] array) {
        ListNode<T> p = head;
        for (T t : array) {
            ListNode<T> node = new ListNode<T>(t, null);
            p.next = node;
            p = node;
        }
    }

    /**
     * 打印链表
     */
    public void printList() {
        ListNode<T> p = head.next;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
        System.out.println();
    }


    /**
     * 逆序打印单向链表,非递归，利用栈
     *
     * @param args
     */
    public void printInverse() {
        Stack<T> stack = new Stack<>();
        ListNode<T> p = head.next;
        while (p != null) {
            stack.push(p.value);
            p = p.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    /**
     * 逆序打印单向链表，递归法
     *
     * @param args
     */
    public void printInverseRecursive() {
        recursive(head.next);
        System.out.println();
    }

    private void recursive(ListNode<T> p) {
        // TODO Auto-generated method stub
        if (p != null) {
            recursive(p.next);
            System.out.println(p.value + " ");
        }
    }

    public static void main(String[] args) {
        MiniList<Integer> list = new MiniList<>();
        Integer[] array = {1, 2, 3, 4, 5, 6};
        list.arrayToList(array);
        System.out.print("original: ");
        list.printList();

        System.out.print("Inverse print: ");
        list.printInverseRecursive();
//        list.printInverse();
    }
}

