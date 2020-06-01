package com.bf.data_structure;

/**
 * @description: 循环队列
 * 整个队列的入队和出队的过程，就是头指针head和尾指针tail互相追赶的过程
 * 判断队列为空的条件是：head==tail
 * 判断队列为满的情况就是：tail+1=head
 * 考虑 套圈 情况 ：(tail+1)%n=head  模 就是 去掉 套圈 （不能被套圈）
 * @author: bofei
 * @date: 2020-06-01 17:13
 **/
public class MyQueueArrV3 {


    private Object[] arr;

    public MyQueueArrV3(int length) {
        this.arr = new Object[length];;
    }

    private int head;
    private int tail;

    public void enq(Object item) {
        arr[tail] = item;


        if (++tail > arr.length-1) {
            tail -= arr.length;
        }
    }

    public Object deq() {
        Object old = arr[head];
        if (++head > arr.length-1) {
            head -= arr.length;
        }
        return old;
    }

    public static void main(String[] args) {
        MyQueueArrV3 myQueueArrV3 = new MyQueueArrV3(7);

        myQueueArrV3.enq("d1");
        myQueueArrV3.enq("d2");
        myQueueArrV3.enq("d3");
        myQueueArrV3.enq("d4");
        myQueueArrV3.enq("d5");
        myQueueArrV3.enq("d6");
        myQueueArrV3.enq("d7");
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        System.out.println(myQueueArrV3.deq());
        myQueueArrV3.enq("d8");
        System.out.println(myQueueArrV3.deq());

        myQueueArrV3.enq("d9");myQueueArrV3.enq("d10");myQueueArrV3.enq("d11");
        System.out.println(myQueueArrV3.deq());System.out.println(myQueueArrV3.deq());System.out.println(myQueueArrV3.deq());




    }
}
