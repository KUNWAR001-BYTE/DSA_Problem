class Solution {
    public int[] findnxtsmall(int[] arr){
        int n = arr.length;
        int nxtsmall[]= new int[n];
        Stack<Integer>st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
                
            }
            nxtsmall[i] = st.isEmpty()?n:st.peek();
                st.push(i);
        }
        return nxtsmall;
    }

    public int[] prevsmall(int[] arr){
        int n = arr.length;
        int presmall[] = new int[n];
        Stack<Integer>st1 = new Stack<>();

        for(int i=0; i<=n-1; i++){
            while(!st1.isEmpty() && arr[st1.peek()]>arr[i]){
                st1.pop();
                
            }
            presmall[i] = st1.isEmpty()?-1:st1.peek();
                st1.push(i);
        }
        return presmall;
    }
    public int sumSubarrayMins(int[] arr) {
         int nse[] = findnxtsmall(arr);
         int pse[] = prevsmall(arr);
         long total = 0;
          long mod = 1000000007L;
          for(int i=0; i<=arr.length-1; i++){
            long left = i-pse[i];
            long right = nse[i]-i;
            total = (total+ (right*left*arr[i])%mod)%mod;
          }
          return (int)total;
    }
}