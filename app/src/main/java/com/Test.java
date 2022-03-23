package com;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        String num = addNumber("12", "1");
//        System.out.println(num);
        int[] arr ={22,1,34,22,16};
        rearrange(arr);
    }

    private static void rearrange(int [] arr){
        int x =22;
        int n =arr.length;
        int swapPosition = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i] == x){
                arr[i] =1;
            }
            Arrays.sort(arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static <T> void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static String addNumber(String a, String b) {
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        int carrier = 0;
        StringBuilder sb = new StringBuilder();

        while (len1 >= 0 || len2 >= 0) {
            int sum = carrier;
            sum += (len1 >= 0) ? a.charAt(len1--) - '0' : 0;
            sum += (len2 >= 0) ? b.charAt(len2--) - '0' : 0;
            carrier = sum / 10;
            sb.append(sum % 10);
        }
        if (carrier != 0) {
            sb.append(carrier);
        }
        return sb.reverse().toString();
    }
}