class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int curr_max=arr[0];
        int max_so_far=arr[0];
        int curr_min=arr[0];
        int min_so_far=arr[0];
        int total_sum=arr[0];
        
        for(int i=1;i<arr.length;i++){
            total_sum+=arr[i];
            curr_max=Math.max(arr[i]+curr_max,arr[i]);
            max_so_far=Math.max(max_so_far,curr_max);
            
            curr_min=Math.min(arr[i]+curr_min,arr[i]);
            min_so_far=Math.min(min_so_far,curr_min);
        }
        
        if(max_so_far<0){
            return max_so_far;
        }
        
        return Math.max(max_so_far,total_sum-min_so_far);
        
    }
}
