package com.bf.niuke;

import java.util.Scanner;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-17 09:31
 **/
public class Main {


    // 皮皮虾
    public static void main2(String args[]) {
        Scanner in = new Scanner(System.in);
        in.next();
        while (in.hasNextInt()) { // 会不退出程序
            System.out.print(duiShuFor2(in.nextInt()) + 1);
        }
    }

    public static void main4(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(duiShuFor2(in.nextInt()));
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(Math.ceil(Math.log(in.nextInt()) / Math.log(2)));
            //log2N=logeN/loge2
        }
    }

    // 算出 以2为底的x的对数 log2X = N
    // 除几次2 能 把 长度 取到0
    // java 取对数
    // java 如何取对数
    // 除数是2的话，
    public static int duiShuFor2(int x) {
        if (x <=1) return 1;
//        if (x%2 != 0) x = x-1; // 如果是奇数，则次数与 x-1 相同
        int N = 0;


        while ((x / 2) != 0) {
            x = x / 2 + x % 2;
            N++;
        }
        if (x == 0) return N + 1;
        else return N;
    }
}
