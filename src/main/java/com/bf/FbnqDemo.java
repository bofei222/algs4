package com.bf;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-12 17:01
 **/
public class FbnqDemo {
    public static void main(String[] args) {
        System.out.println(get(3));
    }

    public static Integer get(Integer n) {
        if (n == 0) return 0;
        return n < 2 ? 1 : get(n - 1) + get(n - 2);
    }
}
