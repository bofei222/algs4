package com.bf.leetcode;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import edu.princeton.cs.algs4.In;
import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * 为什么不是对int类型进行自动装箱处理呢？其实这块是java根据一个很明显的道理进行设计的：如果有人比较一个int类型的值和Integer类型的值，是想比较什么呢？肯定是值呀，所以这块是对Integer对象进行拆箱而不是对int类型装箱了
 *
 *
 * @author: bofei
 * @date: 2020-06-09 09:28
 **/
public class Solution9 {



    @Test
    public void test() {
        System.out.println(isPalindrome(121));
        ;
        System.out.println(isPalindrome(-121));
        ;
        System.out.println(isPalindrome(10));
        ;

    }

    @Test
    public void test2() {
        isPalindrome2(123);
//        1
//        12
//        123

    }

    @Test
    public void test3() {
        System.out.println(isPalindrome3(123321));
        System.out.println(isPalindrome3(1221));
        System.out.println(isPalindrome3(-121));
        System.out.println(isPalindrome3(10));
    }

    @Test
    public void test4() {
        System.out.println(isPalindrome4(123321));
//        System.out.println(isPalindrome4(1221));
//        System.out.println(isPalindrome4(-121));
//        System.out.println(isPalindrome4(10));
    }

    @Test
    public void test5() {
        System.out.println(isPalindrome5(123321));
//        System.out.println(isPalindrome4(1221));
//        System.out.println(isPalindrome4(-121));
//        System.out.println(isPalindrome4(10));
    }

    // 一半 half ， 只比较 前一半 和后一半 即可
    public static boolean isPalindrome5(int x) {
        int oldX = x;
        if (x < 0) return false;
        if (x == 0) return true;
        int l = (x + "").length(); // 3位数 2个零 123/100
        int half = l / 2; // 奇数、偶数 都处理了

        int loopCount = half - 1;
        int result = 0;
        for (; ; ) {
            int r = x % 10;
//            System.out.println(r);
            x = x / 10;
            result = result * 10 + r; // 乘几个零， 等价于 *10 乘几次  l-1个
            System.out.println(result);
            if (loopCount == 0) break;
            loopCount--;
        }

//        System.out.println("result " + result);
        return x == result;
    }

    public static boolean isPalindrome4(int x) {
        int oldX = x;
        if (x < 0) return false;
        if (x == 0) return true;
        int l = (x + "").length() - 1; // 3位数 2个零 123/100

        int result = 0;
        for (; ; ) {
            int r = x % 10;
//            System.out.println(r);
            x = x / 10;
            result = result * 10 + r; // 乘几个零， 等价于 *10 乘几次  l-1个
            System.out.println(result);
            if (l == 0) break;
            l--;
        }

//        System.out.println("result " + result);
        return oldX == result;
    }

    public static boolean isPalindrome3(int x) {
        int oldX = x;
        if (x < 0) return false;
        if (x == 0) return true;
        int l = (x + "").length() - 1; // 3位数 2个零 123/100

        int result = 0;
        for (; ; ) {
            int r = x % 10;
//            System.out.println(r);
            x = x / 10;
            result = result + r * getZeroCountByLength(l);
            if (l == 0) break;
            l--;
        }

//        System.out.println("result " + result);
        return oldX == result;
    }

    // 每次乘 几个零
    public static int getZeroCountByLength(int length) {
        String s = "";
        for (int i = 0; i < length; i++) {
            s += "0";
        }
        return Integer.parseInt("1" + s);
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int l = (x + "").length() - 1; // 3位数 2个零

        for (; ; ) {
            String string = "1";
            for (int i = 0; i < l; i++) {
                string += "0";
            }
            int s = Integer.valueOf(string);

            if (l < 0) break;
//            System.out.println(s);
            System.out.println(x / s);
            l--;

        }

        return true;
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();

        char[] reChars = new char[chars.length];

        for (int i = 0; i < reChars.length; i++) {
            reChars[i] = chars[reChars.length - 1 - i];
        }

        String reverseString = String.valueOf(reChars);
//        System.out.println("reverseString " + reverseString);
//        System.out.println("reChars " + reChars);
//        System.out.println("reChars.toString() " + Arrays.toString(reChars));


        return reverseString.equals(s);
    }
}
