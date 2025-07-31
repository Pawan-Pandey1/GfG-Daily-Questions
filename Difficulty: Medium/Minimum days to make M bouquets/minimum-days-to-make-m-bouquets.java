class Solution {
    private boolean isPossible(int mid,int[]arr,int k,int m){
        int count=0;
        int bloom=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }else{
                bloom+=(count/k);
                count=0;
            }
        }
        bloom+=count/k;
        
        return bloom>=m;
    }
    public int minDaysBloom(int[] arr, int k, int m) {
        // code here
        int n=arr.length;
        if(n<k*m){
            return -1;
        }
        
        int start=Integer.MAX_VALUE;
        int end=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
           if(arr[i] < start) {
                start = arr[i];
            }
            if(arr[i] > end) {
                end = arr[i];
            }

        }
        
        int ans=end;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(isPossible(mid,arr, k, m)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
}