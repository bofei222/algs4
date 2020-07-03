package com.bf.niuke.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 寻找身高相近的小朋友

// 输入 100 10
//      95 96 97 98 99 100 101 102
// 输出
public class Main4 {
    static int[] arr = new int[201];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int hi = scanner.nextInt();
            arr[hi] = h >= hi ? (h - hi) : hi - h;
        }
//        Arrays.sort(arr);
        // 各正整数 以 空格分隔
//        System.out.println(Arrays.toString(arr));
     /*   int[] brr = new int[n];
        int x= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[x] = arr[i];
                x++;
            }
        }*/

// 不能排序，一排序，
//        System.out.println(Arrays.toString(arr));
        List<Integer> list =new ArrayList<>();

        for (int i : arr) {
            list.add(arr[i]);
        }
        int min = 200;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) continue;
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        list.remove(min);
        System.out.print(getIndex(getIndex(min)));
        System.out.print(" ");


    }

    public static int getIndex(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return 0;
    }
}
