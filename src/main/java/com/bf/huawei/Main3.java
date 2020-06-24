package com.bf.huawei;

import java.util.Scanner;

// 字符串家加密
public class Main3 {
    static char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {

//        System.out.println(arr.length);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            String str = scanner.next();
            System.out.println(getSecureString(str));
        }

    }

    private static String getSecureString(String str) {
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int oldIndex = getOldIndex(chars[i]);
            int a = getA(i);
            int newIndex = (oldIndex + a) % 26;
            newChars[i] = arr[newIndex];
        }

        return String.valueOf(newChars);
    }

    private static int getOldIndex(char c) {
        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) return i;
        }
        return 0;
    }


    public static int getA(int index) {
        if (index == 0) return 1;
        if (index == 1) return 2;
        if (index == 2) return 4;

        int n = 0;

        int aSUbThree = 1;
        int aSUbTwo = 2;
        int aSUbOne = 4;

        while (index >= 3) {

            n = aSUbThree + aSUbTwo + aSUbOne;
            aSUbThree = aSUbTwo;
            aSUbTwo = aSUbOne;
            aSUbOne = n;
            index--;

        }
//        return getA(index - 1) + getA(index - 2) + getA(index - 3);
        return n;
    }
}
