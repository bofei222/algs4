package com.bf.huawei;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            inttInt();
            // 两个 int 可以在一行输入
            // 空格 表示 分割 两次输入
            int b = in.nextInt(),a = in.nextInt();
            System.out.println(a + b);
        }
    }
}