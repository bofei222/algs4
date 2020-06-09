package com.bf.leetcode;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-09 09:28
 **/
public class Solution9 {

    public static void main(String[] args) {

        int i = 123321;
        int j = 123321;
        System.out.println(i == j);
        System.out.println();

        int xx = i;
        System.out.println("xx == i " + (xx == i));
        i--;
        System.out.println("xx " + xx);
        System.out.println("xx == i " + (xx == i));

        System.out.println();
        System.out.println("array=============");
        String[] a = {"a", "b", "c"};
        String[] b = {"a", "b", "c"};
        System.out.println(a.equals(b)); // == 比较引用的值 -> 比较内存的物理地址


        System.out.println("String==================");
        String abc = new String("abv");
        String abc2 = new String("abv");
        System.out.println(abc == abc2);
        System.out.println(abc.equals(abc2));
    }

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
