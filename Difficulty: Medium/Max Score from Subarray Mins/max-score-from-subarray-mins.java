class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n=arr.length;
        
        int maxSum=0;
        
        for(int i=1;i<n;i++){
           maxSum=Math.max(maxSum,arr[i]+arr[i-1]);

        }
        return maxSum;
    }
}