class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int total_sum=0;
        for(int i=0;i<nums.length;i++){
            total_sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            rightSum=total_sum-leftSum-nums[j];
            if(rightSum==leftSum){
                return j;
            }
            leftSum+=nums[j];
        }
        return -1;
    }
}