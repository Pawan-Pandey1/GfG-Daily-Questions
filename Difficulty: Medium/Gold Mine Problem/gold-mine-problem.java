class Solution {
    private int n,m;
    
    private int solve(int i,int j,int[][]mat,int[][]dp){
        if(i<0 || i>=n || j>=m){
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        int right=solve(i,j+1,mat,dp);
        int DuRight=solve(i-1,j+1,mat,dp);
        int DdRight=solve(i+1,j+1,mat,dp);
        
        return dp[i][j]=mat[i][j]+Math.max(right,Math.max(DuRight,DdRight));
        
    }
    public int maxGold(int[][] mat) {
        // code here
        n=mat.length;
        m=mat[0].length;
        
        int[][]dp=new int[n][m];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        
        int maxGold=0;
        
        for(int i=0;i<n;i++){
            maxGold=Math.max(maxGold,solve(i,0,mat,dp));
        }
        
        return maxGold;
    }
}