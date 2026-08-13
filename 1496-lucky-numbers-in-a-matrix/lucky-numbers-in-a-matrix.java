class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> Rowmin= new ArrayList<>();
        List<Integer> Colmax= new ArrayList<>();
        List<Integer> result= new ArrayList<>();
        int min;
        int max;

        for(int i=0;i<matrix.length;i++){
            min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                min = Math.min(min,matrix[i][j]);
            }
            Rowmin.add(min);   
        }

        for(int j=0;j<matrix[0].length;j++){
            max = Integer.MIN_VALUE;
            for(int i=0;i<matrix.length;i++){
                max = Math.max(max,matrix[i][j]);
            }
            Colmax.add(max);
        }
        for(int i=0;i<Rowmin.size();i++){
            for(int j=0;j<Colmax.size();j++){
                if(Rowmin.get(i).equals(Colmax.get(j))){
                    result.add(Rowmin.get(i));
                }
            }
        }
        return result;
    }
}