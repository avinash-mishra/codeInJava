package com.code.concepts;

import java.util.ArrayList;
import java.util.List;

/*
Length of array, string and list
 */
public class Lenth {
    public static void main(String[] args) {
        int[] a = new int[10];
        String str = "Sample String";
        List<Integer> list = new ArrayList<Integer>(10);

        System.out.println(a.length); // 10
        System.out.println(str.length()); // 13
        System.out.println(list.size()); // 0

        list.add(15);
        System.out.println(list.size()); // 1

        int num = -2;
        System.out.println(Math.abs(num));
    }
}
