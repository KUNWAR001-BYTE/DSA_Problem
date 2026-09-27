class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        //int res[]=new int[n];
        for(int i=0;i<nums.length;i++){
            int sq=0;
            nums[i]=nums[i]*nums[i];
           
        }
        Arrays.sort(nums);
        return nums;
    }
}