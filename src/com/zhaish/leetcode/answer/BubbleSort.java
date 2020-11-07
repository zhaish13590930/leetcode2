package com.zhaish.leetcode.answer;

public class BubbleSort {

    public static void sort(int[] arr, boolean isAsc){
        if(arr == null){
            return;
        }
        int len = arr.length;
        int childIndex = arr.length -1;

        for(int k=0;k<childIndex;childIndex--){
            boolean changedPosition = false;
            for (int i = 0; i < childIndex; i++) {
                    int left = arr[i];
                    int right= arr[i+1];
                    if(isAsc){
                        if(left > right){
                            changedPosition = true;
                            swap(arr,i,i+1);
                        }
                    }else{
                        if(left < right){
                            changedPosition = true;
                            swap(arr,i,i+1);
                        }
                    }
            }
            if (!changedPosition){
                break;
            }
        }
    }
    private static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1,6,8,9,4};
        //int[] nums = {1,2,3,4,5,6,7,8};
        BubbleSort.sort( nums,true);
        print(nums);
        BubbleSort.sort( nums,false);
        System.out.println("");
        print(nums);
    }
    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }
}
