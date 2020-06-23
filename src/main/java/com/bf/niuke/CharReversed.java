package com.bf.niuke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 如：输入“I am a student”，输出“tneduts a ma I”。
 * <p>
 * 输入参数：
 * inputString：输入的字符串
 * <p>
 * 返回值：
 * 输出转换好的逆序字符串
 */
public class CharReversed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (int i = chars.length -1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
