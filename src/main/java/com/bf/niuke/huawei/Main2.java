package com.bf.niuke.huawei;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 3*3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        // 循环表示 结束次数
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        }
        System.out.println(ans);
    }
}
