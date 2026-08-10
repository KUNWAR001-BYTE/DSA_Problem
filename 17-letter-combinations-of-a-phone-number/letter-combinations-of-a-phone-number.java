class Solution {
    private final String map[];
    public Solution(){
        map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    public void combination(String digit,List<String>ans,int index,String curr){
        if(index==digit.length()){
            ans.add(curr);
            return;
        }

        String s=map[digit.charAt(index)-'0'];

        for(int i=0;i<s.length();i++){
            combination(digit,ans,index+1,curr+s.charAt(i));
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        combination(digits,ans,0,"");
        return ans;
    }
}