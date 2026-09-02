class Solution {
    public String reverseWords(String s) {
        String word[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<word.length; i++){
            str.append(new StringBuilder(word[i]).reverse());
            if(i<word.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}