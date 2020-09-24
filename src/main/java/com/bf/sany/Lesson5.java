package com.bf.sany;

/**
 * @description:
 * @author: bofei
 * @date: 2020-08-15 14:03
 **/
public class Lesson5 {

    public static void main(String[] args) {
        Node node1 = new Node();
        node1.value = 1d;
        Node node2 = new Node();
        node2.value = 2d;
        node1.next = node2;
        node2.next = null;


        // 中间新增节点
        Node node15 = new Node();
        node15.value = 1.5d;
        node15.next = node1.next; // 不是 = node2 ,而是直接用node1的next, 开始
        node1.next = node15;

        // 删除 中间节点
//        node1.next = node2;
        // 循环链表
        node2.next = node1;

        Node iter = new Node();
        iter.next = node1;

        int flag  = 0;
        while (iter.next != null) {
            iter = iter.next;
            System.out.println(iter.value);

            if (flag++ == 10) {
                return;
            }

        }


    }



    static class Node {
        Double value;
        Node next;

        public Double getValue() {
            return value;
        }

        public void setValue(Double value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
