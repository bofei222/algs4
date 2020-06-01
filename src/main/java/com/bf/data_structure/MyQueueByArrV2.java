package com.bf.data_structure;

/**
 * @description: 用数组实现队列 版本2， 定义front指针，
 * 并不复制到新数组，依靠font指针返回最先进入的元素
 * 不过D1元素的实际数据并没有被删除，但即使没有删除，D1元素也不属于队列中的一部分了，队列只承认队头和队尾之间的数据
 *
 * @author: bofei
 * @date: 2020-06-01 16:11
 **/
public class MyQueueByArrV2 {
    private Object[] arr;
    private int head; // 队头
    private int tail;// 队尾，总是指向 将要插入的新元素 的位置

    public void enq(Object item) {
        if (arr == null) {
            head = 0;
            arr = new Object[100];
        }
        arr[tail++] = item;
    }

    public Object deq() {
        Object old = arr[head];
        head ++;
        return old;
    }

    public static void main(String[] args) {
        MyQueueByArrV2 myQueueByArrV2 = new MyQueueByArrV2();

        myQueueByArrV2.enq("a");
        myQueueByArrV2.enq("b");
        myQueueByArrV2.enq("c");
        System.out.println(myQueueByArrV2.deq());
        System.out.println(myQueueByArrV2.deq());
        System.out.println(myQueueByArrV2.deq());

        myQueueByArrV2.enq("1");
        myQueueByArrV2.enq("2");
        myQueueByArrV2.enq("3");
        System.out.println(myQueueByArrV2.deq());
        System.out.println(myQueueByArrV2.deq());
        System.out.println(myQueueByArrV2.deq());

    }

}
