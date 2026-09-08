class Solution {
    private boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    public String toGoatLatin(String sentence) {
        String word[] = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<word.length;i++){
            String temp = word[i];
            if(!isVowel(temp.charAt(0))){
                temp = temp.substring(1)+temp.charAt(0);
            }
            temp = temp+"ma";
            temp = temp+"a".repeat(i+1);
            if(i>0){
                res.append(" ");
            }
            res.append(temp);
        }
        return res.toString();
    }
}