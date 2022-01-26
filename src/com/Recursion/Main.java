package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Linear search using recursion.
	1 . check whether the target element is present or not.
	2 . return the index of the target element.
	 */
      int[] arr = {5,7,3,9,7,1};
        System.out.println(find(arr,7,0));
        System.out.println(findIndex(arr,7,0));
        findAllIndex(arr,7,0);
        System.out.println(list);

    }
    // first part.
    public static boolean find(int[] arr,int target ,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    // second part.
    public static int findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
    // if target element is more than one, that is there is multiple occurance of the target element;
    static ArrayList <Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] nums,int target,int index){
        if(index==nums.length){
            return;
        }
        if(nums[index]==target){
            list.add(index);
        }
        findAllIndex(nums,target,index+1);
    }
}
