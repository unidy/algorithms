package array;

import java.util.*;
/**
 * https://leetcode.com/problems/two-sum/description/
 * 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 *
 */
public class TwoSum {
	public int[] solution(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
        	map.put(nums[i], i);
        }
        
        int temp;
        for (int i = 0; i < nums.length; i++) {
        	temp = target - nums[i];
        	if (map.containsKey(temp) && map.get(temp) != i ) {
        		return new int[]{i, map.get(temp)};
        	}
        }
        
		return new int[]{};
    }
}
