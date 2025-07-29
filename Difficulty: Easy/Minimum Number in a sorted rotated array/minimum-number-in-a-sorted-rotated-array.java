class Solution {
    static int minNumber(int arr[], int low, int high) {
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            ans = Math.min(ans, arr[mid]);
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            }else{
              high = mid - 1;  
            } 
        }
        return ans;
    }
}
