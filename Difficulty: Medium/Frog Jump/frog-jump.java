// User function Template for Java
class Solution {
    private int solve(int idx,int[]dp,int[]height){
        if(idx==0){
            return 0;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int left=solve(idx-1,dp,height)+Math.abs(height[idx]-height[idx-1]);
        
        int right=Integer.MAX_VALUE;
        if(idx>1){
            right=solve(idx-2,dp,height)+Math.abs(height[idx]-height[idx-2]);
        }
        
        dp[idx] = Math.min(left, right);
        return dp[idx];
    }
    int minCost(int[] height) {
        // code here
        int n=height.length;
        
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        
        return solve(n-1,dp,height);
    }
}