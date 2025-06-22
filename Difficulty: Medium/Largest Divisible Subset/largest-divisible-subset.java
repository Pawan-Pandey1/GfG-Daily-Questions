
class Solution {
    public ArrayList<Integer> largestSubset(int[] arr) {
        Arrays.sort(arr);  // Sort ascending

        // Reverse the array to descending
        int n = arr.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int[] dp = new int[n];
        int[] prevIdx = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(prevIdx, -1);

        int maxLen = 1;
        int lastChosenIdx = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] % arr[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prevIdx[i] = j;
                }
            }

            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastChosenIdx = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = lastChosenIdx; i >= 0; i = prevIdx[i]) {
            result.add(arr[i]);
            if (prevIdx[i] == -1)
                break;
        }

        return result;
    }
}
