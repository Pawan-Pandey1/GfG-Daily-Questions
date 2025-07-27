class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int start=0;
        int end=arr.length-1;
        
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
};