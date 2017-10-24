package com.mutunda.solutions;

import java.util.Arrays;


public class Solutuion {

    /*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
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

}
