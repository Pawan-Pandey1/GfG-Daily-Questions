class Solution {
    private int binaryS(int[] arr, int[] minIndex, int val, int start) {
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[minIndex[mid]] < val) {
                ans = mid;
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public ArrayList<Integer> farMin(int[] arr) {
        int n = arr.length;

        int[] minIndex = new int[n];
        minIndex[n - 1] = n - 1;

    
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[minIndex[i + 1]]) {
                minIndex[i] = i;
            } else {
                minIndex[i] = minIndex[i + 1];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(binaryS(arr, minIndex, arr[i], i + 1));
        }
        return result;
    }
}