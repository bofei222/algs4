package com.bf.sort.a;

import java.util.Arrays;

public class BubbleDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 8, 6, 3, 9, 2, 1, 7};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));


    }

    // 每一次都是内层循环的相邻2个比较 ，一次完整的内循环之后，把最大数移到了最右边，第二次外层循环把第二大的移到了右2，以此类推
    // 冒泡排序，a表示数组，n表示数组大小
    public static void bubbleSort(Integer[] a, int n) {
        if (n <= 1) return;
        for (int i = 0; i < n; ++i) {
            System.out.println("第" + (i + 1) + "遍外层 " + Arrays.toString(a));
            // 提前退出冒泡循环的标志位
            boolean flag = false; // 上一次是否有数据较换， 如果没有，则表示已经是排好序了 不用再继续循环
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) { // 交换
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) break; // 没有数据交换，提前退出
        }
    }
}
