class Solution {
    public int minimumCoins(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int prev = (i > 0) ? prefixSum[i - 1] : 0;
            
            int upperVal=arr[i]+k;
            int pos = upperBound(arr, upperVal, i, n);
            

            int total = (pos > 0) ? prefixSum[n - 1] - prefixSum[pos - 1] :0 ;
            int allowed = (n - pos) * (arr[i] + k);
            int extraCoins = prev + total - allowed;

            ans = Math.min(ans, Math.max(0, extraCoins));
        }

        return ans;
    }
    
    private int upperBound(int[] arr, int key, int low, int high) {
        while (low < high) {
            int mid = low+ (high-low)/2; 
            if (arr[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
