package com.bf.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: bofei
 * @date: 2020-04-20 16:59
 **/
public class SelectSortDemo {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 8, 6, 3, 9, 2, 1, 7};
        System.out.println(Arrays.toString(sort1(arr)));

    }

    public static Integer[] sort1(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "遍外层 " + Arrays.toString(arr));
            // j从i+1开始
            for (int j = (i + 1); j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    // 原来这是 选择排序
    // 我的想法
    // 思路：找出最小的一个数放到最左边，然后从第二个数开始，找出第二小的数放到坐2，然后从第三个数开始，以此类推
    // 问题：这里面 有重复比较 吗
    // 如何找， 将第一个数和其他所有的数对比，如果此数大就交换位置
    // 错误  j从1开始，会导致和前面已经挑选出的 比较、又换位 换回来了
    public static Integer[] sort1_error(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "遍外层 " + Arrays.toString(arr));
            // j从1开始
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }


}
