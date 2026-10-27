class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stk  = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int nums:nums2){
            while(!stk.isEmpty()&& nums>stk.peek()){
                map.put(stk.pop(),nums);
            }
            stk.push(nums);
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }
        int ans[]= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}