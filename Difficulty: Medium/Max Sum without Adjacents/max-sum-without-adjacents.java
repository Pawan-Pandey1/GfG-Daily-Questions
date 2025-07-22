// User function Template for Java

class Solution {
    private int solve(int idx,int [] arr, int [] dp){
        if(idx==0){
            return arr[idx];
        }
        if(idx<0){
            return 0;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int notPick=0+solve(idx-1,arr,dp);
        
        int pick=arr[idx]+solve(idx-2,arr,dp);
        
        dp[idx]=Math.max(notPick,pick);
        
        return dp[idx];
    }
    int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        
        return solve(n-1,arr,dp);
    }
}