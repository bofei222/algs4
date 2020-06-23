package com.bf.niuke;

import java.util.Scanner;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-23 17:34
 **/
public class DuoduoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0;i<num;i++){
            int n = sc.nextInt();
            System.out.println(cal(n));
        }

    }

    public static int cal(int n){
        if (n==1) return 1;
        if (n==2) return 2;
        else return 1+cal(n/2);
    }
}
