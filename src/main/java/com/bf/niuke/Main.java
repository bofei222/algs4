package com.bf.niuke;

import java.util.Scanner;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-17 09:31
 **/
public class Main {


    // 皮皮虾
    public static void main(String args[] ){
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while (in.hasNextInt()) {
            int a = in.nextInt();
            System.out.print(duiShuFor2(a) + 1);
        }
    }

    // 算出 以2为底的x的对数 log2X = N
    // 除几次2 能 把 长度 取到0

    public static  int duiShuFor2(int x) {
        if (x%2 != 0) x = x-1; // 如果是奇数，则次数与 x-1 相同
        int N =0;
        while ((x/2) != 0) {
            x = x/2 + x%2;
            N++;
        }
        return N;
    }
}
