class Solution {
    public ArrayList<Integer> findGreater(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) ans.add(-1);

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        
        Stack<Integer> stack = new Stack<>();

        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && freq.get(stack.peek()) <= freq.get(arr[i])) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
