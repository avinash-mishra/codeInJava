package com.code.coding_interview.hackerrank;

/*
Sample Input
5 4 (Array with length 5 and rotate it left by 4 elements)
1 2 3 4 5
Sample Output ()
5 1 2 3 4
Explanation: 1 2 3 4 5 -> 2 3 4 5 1 -> 3 4 5 1 2 -> 4 5 1 2 3 -> 5 1 2 3 4
*
*/

import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        System.out.print("Enter rotation value: ");
        int k = in.nextInt();
        int a[] = new int[n];

        for(int a_i=0;a_i < n; a_i++){
            System.out.print("Enter "+a_i+"th value of array: ");
            a[a_i] = in.nextInt();
        }

        int output[] = rotate(a,n,k);
        System.out.println("Array after "+k+" rotation is: ");
        for(int o_i=0;o_i < n; o_i++){
            System.out.println(output[o_i]);
        }

    }

    static int[] rotate(int[] a, int n, int k ){
        int arr[] = new int[n];
        int temp = k-1;
        for(int i = 0; i<n; i++){
            arr[i] = a[k++%n];
        }
        return arr;
    }
}
