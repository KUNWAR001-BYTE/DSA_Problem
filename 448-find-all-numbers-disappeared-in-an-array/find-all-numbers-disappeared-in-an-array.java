class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        int expect[]=new int [nums.length];

        for(int i=0;i<nums.length;i++){
            expect[i]=i+1;
            set.add(nums[i]);
        }

        for(int j=0;j<expect.length;j++){
            if(set.contains(expect[j])){
                continue;
            }
            else{
                ans.add(expect[j]);
            }
        }
        return ans;

    }
}