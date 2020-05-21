package com.bf;

import java.util.HashMap;

/**
 * @description:
 * @author: bofei
 * @date: 2020-05-13 18:50
 **/
public class HashMapNodeOrder7 {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>(4);
        hashMap.put("AaAa", 1);
        hashMap.put("BBBB", 2);
        hashMap.put("AaBB", 3);
        hashMap.put("BBAa", 4);
        hashMap.put("bf1", 101);
        hashMap.put("bf2", 202);
    }
}
