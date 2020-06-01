package com.bf.data_structure;

/**
 * @description: 每次出列 都要重新复制数组
 * @author: bofei
 * @date: 2020-06-01 15:49
 **/
public class MyQueueByArr {
    private Object[] arr;
    private int index;

    public void enq(Object item) {
        if (arr == null) {
            arr = new Object[100];
        }
        arr[index++] = item;
    }

    public Object deq() {
        Object old = arr[0];
        Object[] newArr = new Object[100];
        System.arraycopy(arr, 1, newArr, 0, 99);
        arr = newArr;
        index --;
        return old;
    }

    public static void main(String[] args) {
        MyQueueByArr myQueueByArr = new MyQueueByArr();

        myQueueByArr.enq("a");
        myQueueByArr.enq("b");
        myQueueByArr.enq("c");
        System.out.println(myQueueByArr.deq());
        System.out.println(myQueueByArr.deq());
        System.out.println(myQueueByArr.deq());

        myQueueByArr.enq("1");
        myQueueByArr.enq("2");
        myQueueByArr.enq("3");
        System.out.println(myQueueByArr.deq());
        System.out.println(myQueueByArr.deq());
        System.out.println(myQueueByArr.deq());

    }
}
