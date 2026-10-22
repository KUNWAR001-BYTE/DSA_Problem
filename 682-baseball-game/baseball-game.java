class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        for (String op:operations){
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("+")){
                int lst = st.pop();
                int slst = st.peek();
                st.push(lst);
                st.push(lst+slst);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for(int scr :st){
            sum+=scr;
        }
        return sum;
    }
}