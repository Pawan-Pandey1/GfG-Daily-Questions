// // User function Template for Java

class Solution {
    public void rotate(int start,int end,int[]arr){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        
        rotate(0,n-1,arr);
        rotate(1,n-1,arr);
    }
}