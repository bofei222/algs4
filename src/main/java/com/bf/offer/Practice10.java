package com.bf.offer;

import org.junit.Test;

/**
 * @description: 斐波那契
 * @author: bofei
 * @date: 2020-06-22 09:26
 **/
public class Practice10 {

    @Test
    public void test() {

    }

    public int fibonacci(int n) {
        if (n <= 1) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
