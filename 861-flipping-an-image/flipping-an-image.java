class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int k=image[0].length-1;
            for(int j=0;j<image[0].length/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
                k--;
            }
        }

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }else if(image[i][j]==1){
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}