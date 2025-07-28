class Solution {
    public static int balanceSums(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int operations=0;
        int maxSum=0;
        
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=mat[i][j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=mat[i][j];
            }
            maxSum=Math.max(maxSum,sum);
        }
        
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<m;j++){
                rowSum+=mat[i][j];
            }
            operations+=maxSum-rowSum;
        }
        return  operations;
    }
}