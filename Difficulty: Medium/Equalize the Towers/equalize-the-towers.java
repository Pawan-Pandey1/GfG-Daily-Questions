class Solution {
    public int minCost(int[] heights, int[] cost) {
        // code here 
        //As we are not given ant target we will create them using tirnary search
        
        int n=heights.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
        high = Math.max(high, heights[i]);
        low = Math.min(low, heights[i]);
        }

        
        int result=high;
        
        while(low<=high){
            
            int mid1=low+(high-low)/3;
            int mid2=high-(high-low)/3;
            
            int cost1=calculateCost(heights,cost,mid1);
            int cost2=calculateCost(heights,cost,mid2);
            
            result=Math.min(cost1,cost2);
            
            if(cost1<cost2){
                high=mid2-1;
            }else{
                low=mid1+1;
            }
        }
        return result;
    }
    
    private int calculateCost(int[]heights,int[]cost,int target){
        int total=0;
        for(int i=0;i<heights.length;i++){
            total+=Math.abs(heights[i]-target)*cost[i];
        }
        return total;
    }
}
