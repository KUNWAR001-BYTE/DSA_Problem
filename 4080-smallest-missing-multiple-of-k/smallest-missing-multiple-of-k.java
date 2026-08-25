class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
         int multiple=0;
         int i=1;

        while(true){
            multiple=k*i;
            if(!set.contains(multiple)){
                return multiple;
            }
            i++;
        }
    }
}