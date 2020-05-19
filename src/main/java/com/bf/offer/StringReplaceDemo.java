package com.bf.offer;

import java.util.Arrays;
import java.util.List;

public class StringReplaceDemo {
    public static void main(String[] args) {

        // 字符串 在java中 就是char数组


        List<Character> list = Arrays.asList('w', 'e', ' ', 'a', 'r', 'e', ' ', 'h', 'a', 'p', 'p', 'y', '.');
        Character[] arr = list.toArray(new Character[20]);



        Character blank = ' ';
        // 变动的个数
        int count = 0;

        for (Character c : arr) {
            if (c == blank) {
                count += 2;
            }
        }
        System.out.println(count);

        int newLastIndex = arr.length + count;
        System.out.println(Arrays.toString(arr));

        // 倒序
        for (int i = arr.length - 1; i >= 0; i--) {
            Character c = arr[i];
//            System.out.println("c: " + c);
            if (null != c) {
                arr[i + count] = arr[i];
            }
            if (blank == arr[i]) {
                count -= 2;
            }

        }
        System.out.println(Arrays.toString(arr));


    }

}
