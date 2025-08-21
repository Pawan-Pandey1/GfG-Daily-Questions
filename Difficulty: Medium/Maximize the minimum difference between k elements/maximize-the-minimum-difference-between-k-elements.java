class Solution {
    private boolean canPlace(int[]arr,int dist,int k){
        int count=1;
        int last=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                count++;
                last=arr[i];
            }
        }
        return count>=k;
    }
    public int maxMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int x=arr.length;
        
        int n=arr[x-1]-arr[0];
        int ans=0;
        
        for(int i=0;i<=n;i++){
            if(canPlace(arr,i,k)){
                ans=i;
            }else{
               break;
            }
        }
        return ans;
    }
}
