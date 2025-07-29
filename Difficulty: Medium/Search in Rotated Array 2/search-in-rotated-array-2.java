class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==key){
                return true;
            }
            
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                start++;
                end--;
                continue;
            }
            
            if(arr[start]<=arr[mid]){
                if(arr[start]<=key && key<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[end]>=key && key>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}
