class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!seen.containsKey(nums[i])) {
                seen.put(nums[i], i);
            } else {
                return true;
            }
        }
        return false;
    }
}