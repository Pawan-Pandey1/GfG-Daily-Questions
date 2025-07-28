// User function Template for Java

class GFG {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer>ans=new ArrayList<>();
        
        int first=firstOccurence(arr,x);
        int last=lastOccurence(arr,x);
        
        ans.add(first);
        ans.add(last);
        
        return ans;
    }
    private int firstOccurence(int arr[], int x){
        int n=arr.length;
        int start=0;
        int end=n-1;
        
        int first=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==x){
                first=mid;
                end=mid-1;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
         return first;
    }
    
    private int lastOccurence(int arr[], int x){
        int n=arr.length;
        int start=0;
        int end=n-1;
        
        int last=-1;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==x){
                last=mid;
                start=mid+1;
            }else if(arr[mid]<x){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
         return last;
    }
}
