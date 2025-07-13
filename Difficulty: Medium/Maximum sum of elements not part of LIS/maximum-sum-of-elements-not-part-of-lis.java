class Solution {

    public int nonLisMaxSum(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // Step 1: Calculate the total sum of all array elements
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Step 2: Initialize DP arrays
        // dpLength[i]: Length of LIS ending at index i
        // dpSum[i]: Sum of elements in that LIS
        int[] dpLength = new int[n];
        int[] dpSum = new int[n];

        for (int i = 0; i < n; i++) {
            dpLength[i] = 1;        // Every element alone is a LIS of length 1
            dpSum[i] = arr[i];      // Initial sum is the element itself
        }

        // Step 3: Compute LIS length and minimum sum at each index
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    // If we find a longer subsequence
                    if (dpLength[i] < dpLength[j] + 1) {
                        dpLength[i] = dpLength[j] + 1;
                        dpSum[i] = dpSum[j] + arr[i];
                    }
                    // If same length, prefer the one with smaller sum
                    else if (dpLength[i] == dpLength[j] + 1) {
                        dpSum[i] = Math.min(dpSum[i], dpSum[j] + arr[i]);
                    }
                }
            }
        }

        // Step 4: Find the LIS with maximum length and minimum sum
        int maxLISLength = 0;
        int minLISSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (dpLength[i] > maxLISLength) {
                maxLISLength = dpLength[i];
                minLISSum = dpSum[i];
            } else if (dpLength[i] == maxLISLength) {
                minLISSum = Math.min(minLISSum, dpSum[i]);
            }
        }

        // Step 5: Return the sum of elements not in the LIS
        return totalSum - minLISSum;
    }
}
