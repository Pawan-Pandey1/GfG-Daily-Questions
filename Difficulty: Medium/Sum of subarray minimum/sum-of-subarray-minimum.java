class Solution {
    
    public int sumSubMins(int[] arr) {
        // code here
        int n=arr.length;
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            int min=arr[i];
            for(int j=i;j<n;j++){
                min=Math.min(min,arr[j]);
                sum+=min;
            }
        }
        return sum;
    }
}
