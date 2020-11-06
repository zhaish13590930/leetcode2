package com.zhaish.leetcode.answer;

public class BubbleSort {

    public static void sort(int[] arr, boolean isAsc){
        if(arr == null){
            return;
        }
        int len = arr.length;
        int childIndex = arr.length -1;

        for(int k=0;k<childIndex;childIndex--){
            for (int i = 0; i < childIndex; i++) {
                    int left = arr[i];
                    int right= arr[i+1];
                    if(isAsc){
                        if(left > right){
                            swap(arr,i,i+1);
                        }
                    }
            }
        }
    }
    private static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        BubbleSort.sort( nums,true);
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }
}
