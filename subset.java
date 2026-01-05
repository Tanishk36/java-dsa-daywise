import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        allSubset(nums, 0, ans, res);

        return res;
    }

    public void allSubset(int[] nums, int i,
                          List<Integer> ans,
                          List<List<Integer>> res) {

        if (i == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }

        // include
        ans.add(nums[i]);
        allSubset(nums, i + 1, ans, res);

        // backtrack
        ans.remove(ans.size() - 1);

        // exclude
        allSubset(nums, i + 1, ans, res);
    }
}
