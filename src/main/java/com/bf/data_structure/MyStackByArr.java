package com.bf.data_structure;

/**
 * @description: 用数组实现 栈，将数组尾 当作 栈头
 * @author: bofei
 * @date: 2020-06-01 15:30
 **/
public class MyStackByArr {
    private Object[] arr;
    private int index;

    public void push(Object item) {
        if (arr == null) {
            arr = new Object[100];
        }
        arr[index++] = item;
    }

    public Object pop() {
        Object old = arr[-- index];
        arr[index] = null;
        return old;
    }

    public static void main(String[] args) {
        MyStackByArr myStackByArr = new MyStackByArr();
        myStackByArr.push("a");
        myStackByArr.push("b");
        myStackByArr.push("c");
        System.out.println(myStackByArr.pop());
        System.out.println(myStackByArr.pop());
        System.out.println(myStackByArr.pop());

        myStackByArr.push("1");
        myStackByArr.push("2");
        myStackByArr.push("3");
        System.out.println(myStackByArr.pop());
        System.out.println(myStackByArr.pop());
        System.out.println(myStackByArr.pop());

    }
}
