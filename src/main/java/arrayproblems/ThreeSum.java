/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i !=
 * j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * <p>Notice that the solution set must not contain duplicate triplets.
 */
package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {

    Set<List<Integer>> res = new HashSet<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      int firstNum = nums[i];
      int start = i + 1;
      int end = nums.length - 1;
      int tempTarget = 0 - firstNum;
      while (start < end) {

        if (nums[start] + nums[end] == tempTarget) {
          List<Integer> temp = new ArrayList<>();

          temp.add(firstNum);
          temp.add(nums[start]);
          temp.add(nums[end]);
          res.add(temp);
          start++;
          end--;
        } else if (nums[start] + nums[end] > tempTarget) {
          end--;
        } else {
          start++;
        }
      }
    }

    return res.stream().collect(Collectors.toList());
  }
}
