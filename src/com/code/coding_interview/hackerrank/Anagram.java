package com.code.coding_interview.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Sample Input
str1 = "cde"
str2 = "acpd"
Delete number of characters to make both the string anagram. Anagram is a permuted string.

o/p : 4
explanation: "de"+"ap" should be deleted then both strings will be left with cd/cd which is an Anagram.
*
*/
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println("Required number of characters to be deleted are : "+makeAnagram2(str1, str2));

    }

    public static int makeAnagram(String str1, String str2){

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
                continue;
            }
            map.put(str1.charAt(i), 1);
        }

        System.out.println("first");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }

        for(int j=0; j<str2.length(); j++){
            if(map.containsKey(str2.charAt(j))){
                map.put(str2.charAt(j),map.get(str2.charAt(j))-1);
                continue;
            }
            else{
                map.put(str2.charAt(j),-1);
            }

        }
        System.out.println("second");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        int count = 0;
        for(Map.Entry m: map.entrySet()){
            count = count +  Math.abs((Integer) m.getValue());
        }

        return count;
    }

    public static int makeAnagram2(String str1, String str2){
        int[] lettercounts = new int[26];

        for(char c: str1.toCharArray()){
            lettercounts[c-'a']++;
        }

        for(char c: str2.toCharArray()){
            lettercounts[c-'a']--;
        }
        int count = 0;

        for(int i: lettercounts){
            count += Math.abs(i);
        }
        return count;
    }
}
