package com.mutunda.solutions;

import com.mutunda.ListNode.ListNode;

import java.util.Arrays;
import java.util.List;


public class Solutuion {

    /*
    * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    * You may assume that each input would have exactly one solution, and you may not use the same element twice.
    */

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if (nums[i] + nums[j] == target && i != j){
                    return new int[] { i, j };
                }
            }
        }

        return new int[]{};
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return l1;
    }
}
