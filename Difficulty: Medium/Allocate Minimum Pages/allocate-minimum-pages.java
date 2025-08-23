
//Back-end complete function Template for Java

class Solution {
    private int countStudents(int [] arr, int pages){
        int students=1;
        int pagesStudent=0;
        
        for(int i=0;i<arr.length;i++){
            if(pagesStudent+arr[i]<=pages){
                pagesStudent+=arr[i];
            }else{
                students+=1;
                pagesStudent=arr[i];
            }
        }
        return students;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        
        if(k>arr.length){
            return -1;
        }
        
        int low=-1;
        int high=0;
        
        for(int i=0;i<n;i++){
            high+=arr[i];
            if(arr[i]>low){
                low=arr[i];
            }
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(countStudents(arr,mid)>k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}