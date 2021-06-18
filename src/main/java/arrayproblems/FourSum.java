package arrayproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int secondNum = nums[j];
                int start = j + 1;
                int end = nums.length - 1;
                int tempTarget = target - (firstNum + secondNum);
                while (start < end) {

                    if (nums[start] + nums[end] == tempTarget) {
                        List<Integer> temp = new ArrayList<>();

                        temp.add(firstNum);
                        temp.add(secondNum);
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
        }

        return res.stream().collect(Collectors.toList());
    }
}
