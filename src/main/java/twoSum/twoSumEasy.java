/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
package twoSum;

import java.util.HashMap;
import java.util.Map;

public class twoSumEasy {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i < nums.length; i++){

            if(hmap.containsKey(target - nums[i]) && i!= hmap.get(target - nums[i])){
                res[0] = hmap.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            else if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], i);
            }
        }

        return res;
    }

}
