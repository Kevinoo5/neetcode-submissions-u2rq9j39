class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (diff.containsKey(key)) {
                return new int[]{diff.get(key), i};
            } else {
                System.out.println(diff);
            }
            diff.put(nums[i], i);
        }
        return new int[]{};
    }
}
