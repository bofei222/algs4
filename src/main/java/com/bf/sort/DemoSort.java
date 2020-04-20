package com.bf.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: bofei
 * @date: 2020-04-20 16:59
 **/
public class DemoSort {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 8, 6, 3, 9, 2, 1, 7};
        System.out.println(Arrays.toString(sort1(arr)));

    }

    public static Integer[] sort1(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
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
