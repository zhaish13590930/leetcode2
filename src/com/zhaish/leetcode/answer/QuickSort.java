package com.zhaish.leetcode.answer;

public class QuickSort {

    public static void sort(int[] arr, boolean isAsc){
        if(arr == null){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }

    private int[] partition(int[] arr){
        //int mid = arr.length/2;
        int left = 0;
        int right = arr.length -1;
        quickSort(arr,left,right);
        return  arr;
    }

    private static void quickSort(int[] arr, int left,int right) {
        //先排左边的
        int mid = (left+right)/2;
        for(int begin = left;begin<mid;begin++){
            if(arr[begin] > arr[mid]){
                swap(arr,begin,mid);
            }
        }
        for(int end=right;end > mid;end--){
            if(arr[mid] > arr[end]){
                swap(arr,mid,end);
            }
        }
        if(left < mid ){
            quickSort(arr,left,mid-1);
        }
        if(mid < right){
            quickSort(arr,mid+1,right);
        }

    }

    public static void main(String[] args) {
        int[] nums = {5,2,3,1,6,8,9,4};
        QuickSort.sort( nums,true);
        print(nums);
        QuickSort.sort( nums,false);
        System.out.println("");
        print(nums);
    }
    public static void print(int[] nums){
        for (int num : nums) {
            System.out.print(num+ " ");
        }
    }

    private static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
