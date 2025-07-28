class Solution {
    int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1) return 0;
        int last = lastOccurrence(arr, target);
        return last - first + 1;
    }

    int firstOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }

    int lastOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }
}
