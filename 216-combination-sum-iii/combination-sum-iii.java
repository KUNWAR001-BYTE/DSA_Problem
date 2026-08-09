class Solution {
    public void SubsetSum(int i,int k,int n,int sum,List<Integer>pair,List<List<Integer>>ans){
        if(sum>n)return;
        if(k==0){
            if(sum==n){
                ans.add(new ArrayList<>(pair));
            }
            return;
        }
        if(i==10)return;

        pair.add(i);
        SubsetSum(i+1,k-1,n,sum+i,pair,ans);
        pair.remove(pair.size()-1);

        SubsetSum(i+1,k,n,sum,pair,ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        SubsetSum(1,k,n,0,new ArrayList<>(),ans);
        return ans;
    }
}