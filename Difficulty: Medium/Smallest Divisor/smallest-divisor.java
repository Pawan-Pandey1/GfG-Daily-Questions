class Solution {
    public int check(int[]arr,int mid){
        int total=0;
        
        for(int i=0;i<arr.length;i++){
            total+=(arr[i]+mid-1)/mid;
        }
        return total;
    }
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int n=arr.length;
        
        int l=1;
        int r=1;
        
        for(int i=0;i<n;i++){
            if(arr[i] >r){
                r=arr[i];
            }
        }
        
        int result=r;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(check(arr,mid)<=k){
                result=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return result;
    }
}