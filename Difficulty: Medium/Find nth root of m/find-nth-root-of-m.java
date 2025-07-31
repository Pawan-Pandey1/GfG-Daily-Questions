class Solution {
    public int nthRoot(int n, int m) {
        int start = 0;
        int end = m;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long pow = power(mid, n, m);

            if (pow == m) {       
                return mid;
            } else if (pow < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  
    }

    private long power(int base, int p, int limit) {
        long result = 1;
        for (int i = 1; i <= p; i++) {
            result *= base;
            if (result > limit){
                return result;
            } 
        }
        return result;
    }
}
