class Solution {
    public int cuts(String s) {
        // code here
        int n=s.length();
        
        int [] dp=new int[n];
        Arrays.fill(dp,-1);
        
        int res=solve(0,s,dp);
        
        return res==Integer.MAX_VALUE?-1:res;
    }
    
    private int solve(int idx,String s, int[]dp){
        int n=s.length();
        
        if(idx==n){
            return 0;
        }
        
        if(dp[idx]!=-1){
            return dp[idx];
        }
        
        int minCuts=Integer.MAX_VALUE;
        
        for(int end=idx+1;end<=n;end++){
            String sub=s.substring(idx,end);
            
            if(isDivisible(sub)){
                int next=solve(end,s,dp);
                if(next!=Integer.MAX_VALUE){
                    minCuts=Math.min(minCuts,1+next);
                }
            }
        }
        return dp[idx]=minCuts;
    }
    
    private boolean isDivisible(String binary){
        if(binary.charAt(0)=='0') return false;
        
        int num=0;
        for(int i=0;i<binary.length();i++){
            num=num*2+(binary.charAt(i)-'0');
        }
        
        if(num==0) return false;
        
        while(num%5==0){
            num/=5;
        }
        return num==1;
    }
}
