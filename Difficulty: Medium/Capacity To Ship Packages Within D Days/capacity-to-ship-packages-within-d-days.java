// User function Template for Java

class Solution {
    private static boolean isPossible(int c,int [] arr, int days ){
        //Day 1, the intial weight on boat is 0
        int reqDay=1;
        int load=0;
        
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>c){
                reqDay=reqDay+1;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return reqDay<=days;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        
        int start=0;
        
        int end=0;
        
        for(int i=0;i<n;i++){
            end+=arr[i];
            
            if(arr[i]>start){
                start=arr[i];
            }
        }
        
        int ans=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(isPossible(mid,arr,d)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
};