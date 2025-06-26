class Solution {
    public int minValue(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int f : freq) {
            if (f > 0) pq.offer(f);
        }

        while (k-- > 0 && !pq.isEmpty()) {
            int top = pq.poll();
            if (top > 1) pq.offer(top - 1);
        }

        int result = 0;
        while (!pq.isEmpty()) {
            int val = pq.poll();
            result += val * val;
        }

        return result;
    }
}