class Solution {
    public int numSpecial(int[][] mat) {
        int cnt=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    int k=0;
                    boolean Rowvalid=true;
                    boolean Colvalid=true;
                    while(k<mat[0].length){
                       if(k!=j && mat[i][k]==1){
                       Rowvalid=false;
                        break;
                       }
                       else{ k++;

                       }
                    }
                    int l=0;
                    while(l<mat.length){
                       if(l!=i && mat[l][j]==1){
                        Colvalid=false;
                        break;
                       }
                       else{
                        l++;
                       }
                    }
                    if(Colvalid && Rowvalid){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
        
    }
}