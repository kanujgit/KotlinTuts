package com.codingquestion.backtracking;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int start = 0;
        int end = str.length()-1;
        printAllPermutation(str, start, end);
        System.out.println();
        System.out.println("not contain AB");
        printAllPermutationWhichNotContainAB(str, 0, str.length()-1);
        System.out.println();
    }

    private static void printAllPermutation(String str, int start, int end) {
        if(start == end)
            System.out.print(str+" ");
        else {
            for (int i = start; i <= end  ; i++) {
                str=new String(swap(str, i, start));
                printAllPermutation(str,start+1,end);
                str=new String(swap(str, i, start));

            }
        }
    }

    private static void printAllPermutationWhichNotContainAB(String str, int start, int end) {
        if(start == end) {
            System.out.print(str + " ");
            return;
        } else {
            for (int i = start; i <= end  ; i++) {
                if(isSafe(str,start,end,i)){
                    str=new String(swap(str, i, start));
                    printAllPermutationWhichNotContainAB(str,start+1,end);
                    str=new String(swap(str, i, start));
                }
            }
        }
    }

    private static boolean isSafe(String str, int start, int end, int i) {
        if(start!=0 && str.charAt(start-1) == 'A' && str.charAt(i) == 'B')
            return false;

        if(end ==(start+1) && str.charAt(i) == 'A' && str.charAt(start) == 'B')
            return false;

        return true;
    }

    private static char[] swap(String str, int i, int j) {
        char[] tmpArr = str.toCharArray();
        char tmp = tmpArr[i];
        tmpArr[i] = tmpArr[j];
        tmpArr[j] = tmp;
        return tmpArr;
    }


}
