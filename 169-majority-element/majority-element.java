class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       int len = nums.length;
       len = len/2;
       int result = nums[len];
       return result;
    }
}