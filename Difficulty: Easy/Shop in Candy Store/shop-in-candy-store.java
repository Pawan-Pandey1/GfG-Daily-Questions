class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        // code here
        int n=prices.length;
        
        int minCost=0;
        int maxCost=0;
        
        Arrays.sort(prices);
        
        int i=0;
        int j=n-1;
        
        while(i<=j){
            minCost+=prices[i];
            j-=k;
            i++;
        }
        
        i=0;
        j=n-1;
        
        while(i<=j){
            maxCost+=prices[j];
            i+=k;
            j--;
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(minCost);
        ans.add(maxCost);
        
        return ans;
    }
}
