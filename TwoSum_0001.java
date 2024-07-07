/*
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that 
 * they add up to target
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

//Solution 1
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        return null;
//    }
//}

//Solution 2
package com.leetcode.problems;
import java.util.HashMap;
class TwoSum_0001{
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map= new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			int remainingNumber = target-nums[i];
			if(map.containsKey(remainingNumber)) {
				return new int[] {map.get(remainingNumber),i};
			}
			else {
				map.put(nums[i],i);
			}
		}
		return nums;
	}
}


















