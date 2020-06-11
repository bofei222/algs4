package com.bf.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:
 * @author: bofei
 * @date: 2020-06-11 09:07
 **/
public class Solution739 {

    @Test
    public void test() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));

    }

    //    对于温度列表中的每个元素 T[i]，需要找到最小的下标 j，使得 i < j 且 T[i] < T[j]。  （我的思路：j > i, 且T[j] > T[i]）
//
//    由于温度范围在 [30, 100] 之内，因此可以维护一个数组 next 记录每个温度第一次出现的下标。数组 next 中的元素初始化为无穷大，在遍历温度列表的过程中更新 next 的值。
//
//    反向遍历温度列表。对于每个元素 T[i]，在数组 next 中找到从 T[i] + 1 到 100 中每个温度第一次出现的下标，将其中的最小下标记为 warmerIndex，

//    则 warmerIndex 为下一次温度比当天高的下标。
//
//    如果 warmerIndex 不为无穷大，则 warmerIndex - i 即为下一次温度比当天高的等待天数，最后令 next[T[i]] = i。
//
//    为什么上述做法可以保证正确呢？
//    因为遍历温度列表的方向是反向，当遍历到元素 T[i] 时，只有 T[i] 后面的元素被访问过，
//    即对于任意 t，当 next[t] 不为无穷大时，一定存在 j 使得 T[j] == t 且 i < j。
//    又由于遍历到温度列表中的每个元素时都会更新数组 next 中的对应温度的元素值，
//    因此对于任意 t，当 next[t] 不为无穷大时，令 j = next[t]，则 j 是满足 T[j] == t 且 i < j 的最小下标。


    @Test
    public void test2() {
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures2(temperatures)));

    }
    public int[] dailyTemperatures2(int[] arr) {
        int length = arr.length;
        int[] ans = new int[length];
        int[] next = new int[101]; // 因此可以维护一个数组 next 记录每个温度第一次出现的下标
        Arrays.fill(next, Integer.MAX_VALUE);
        for (int i = length - 1; i >= 0; --i) {
            int warmerIndex = Integer.MAX_VALUE;
            for (int t = arr[i] + 1; t <= 100; ++t) {
                if (next[t] < warmerIndex) {
                    warmerIndex = next[t];
                }
            }
            if (warmerIndex < Integer.MAX_VALUE) {
                ans[i] = warmerIndex - i;
            }
            next[arr[i]] = i;
        }
        return ans;
    }

    public int[] dailyTemperatures(int[] t) {
        int[] result = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            int warmerIndex = 0;
            for (int j = i; j < t.length; j++) { // 内层循环 可能 有 重复

                if (t[j] > t[i]) {
                    warmerIndex = j - i;
                    break;
                }
            }
            result[i] = warmerIndex;
        }
        return result;
    }
}
