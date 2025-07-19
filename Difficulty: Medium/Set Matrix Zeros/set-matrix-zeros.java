class Solution {
    private int MARKER = Integer.MIN_VALUE + 1;
    
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int row=mat.length;
        int col=mat[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    setRow0(i,mat);
                    setCol0(j,mat);;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==MARKER){
                    mat[i][j]=0;
                }
            }
        }
    }
    private void setRow0(int r,int[][]mat){
        for(int column=0;column<mat[0].length;column++){
            if(mat[r][column]!=0){
                mat[r][column]=MARKER;
            }
        }
    }
    
    private void setCol0(int c,int[][]mat){
        for(int row=0;row<mat.length;row++){
            if(mat[row][c]!=0){
                mat[row][c]=MARKER;
            }
        }
    }
}