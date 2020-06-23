package com.bf.niuke;

import java.util.Scanner;

public class LeastCommMulTest {
    public static void main2(String[] args) {

        // 循环解决
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String next1 = scanner.next();
            String next2 = scanner.next(); // 空格 会 分割输入
            int a = Integer.parseInt(next1);
            int b = Integer.parseInt(next2);
            int max = a >= b ? a : b;
            int min = a <= b ? a : b;
            for (int i = max; i <= a * b; i += max) {
                if (i % min == 0) {
                    System.out.println(i);
                    return;
                }
            }

        }
    }

    public static void main3(String[] args) {
        System.out.println(lcm(5, 7));
        System.out.println(lcm(12, 18));
        System.out.println(lcm(328 , 7751)); //2542328
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String next1 = scanner.next();
            String next2 = scanner.next(); // 空格 会 分割输入
            int a = Integer.parseInt(next1);
            int b = Integer.parseInt(next2);

            System.out.println(lcm(a,b));

        }
    }



    public static int lcm(int a, int b) {

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        return lvm2(max, min, max);

    }

    private static int lvm2(int max, int min, int step) {
        if (max % min == 0) {
            return max;
        } else {
            return lvm2(max + step, min, step);
        }
    }
}
