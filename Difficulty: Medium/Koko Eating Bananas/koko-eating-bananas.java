class Solution {
    
    public int totalHours(int [] arr, int mid){
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            count+=(arr[i]+(mid-1))/mid;
        }
        
        return count;
    }
    public int kokoEat(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=1;
        
        int high=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]>high){
                high=arr[i];
            }
        }
        
        int result=high;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            int hour=totalHours(arr,mid);
            
            if(hour<=k){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        return result;
    }
}
