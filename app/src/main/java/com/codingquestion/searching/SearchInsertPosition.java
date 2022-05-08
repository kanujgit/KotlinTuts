package com.codingquestion.searching;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] arr = new int[]{1,3,5,6};
        int target =1;
        searchInsertPosition(arr,target)
        ;
    }

    private static int searchInsertPosition(int[] arr, int target) {
        int low =0;
        int high = arr.length-1;
        if(target<=arr[0])
            return 0;
        int mid;
        while (low<=high){
            mid = (low+high)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return mid;
            }else if(arr[mid]>target){
                high =mid-1;
            }else if(arr[mid]<target){
                low =mid+1;
            }
        }
        return low;
    }
}
