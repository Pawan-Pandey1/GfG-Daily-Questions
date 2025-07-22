class Solution {
    private int solve(int idx,int[]dp){
        if(idx<=1){
            return 1;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int left=solve(idx-1,dp);
        int right=solve(idx-2,dp);
        
        dp[idx]=left+right;
        
        return dp[idx];
    }
    int countWays(int n) {
        // your code here
        
        int[]dp=new int[n+1];
        Arrays.fill(dp, -1); 

        
        return solve(n,dp);
    }
}
