package com.bf.niuke;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-16 18:55
 **/
public class DuoDuoDemo {

    @Test
    public void test() {
        System.out.println(duiShuFor2(16));;

    }

    // 皮皮虾
    @Test
    public void test2() {
        System.out.println(Arrays.toString(duoduo(new int[]{1,6})));;
//        System.out.println(Arrays.toString(duoduo(new int[]{1,1,2,5})));;
//        System.out.println(Arrays.toString(duoduo(new int[]{3,926132445,546512853,453945346})));;
    }

    public int[] duoduo(int[] source) {
        int[] target = new int[source[0]];
        for (int i = 1; i < source.length; i++) {
            target[i - 1] = duiShuFor2(source[i]) + 1;

        }
        return target;
    }

    // 算出 以2为底的x的对数 log2X = N
    // 除几次2 能 把 长度 取到0

    public int duiShuFor2(int x) {
        for (int i = 0; i < 100; i++) {

        }
        if (x%2 != 0) x = x-1; // 如果是奇数，则次数与 x-1 相同
        int N =0;
        while ((x/2) != 0) {
            x = x/2 + x%2;
            N++;
        }
        return N;
    }
}
