class Solution {
    static String decodeString(String s) {
        Stack<String> result = new Stack<>();
        Stack<Integer> count = new Stack<>();
        
        char[] arr = s.toCharArray();
        int i = 0;
        int num = 0;
        String curr = "";
        
        while (i < s.length()) {
            if (Character.isDigit(arr[i])) {
                num = 0;
                while (i < s.length() && Character.isDigit(arr[i])) {
                    num = num * 10 + (arr[i] - '0'); // FIXED conversion issue
                    i++;
                }
                count.push(num);
            } else if (arr[i] == '[') {
                result.push(curr); // Store previous result
                curr = "";
                i++;
            } else if (arr[i] == ']') {
                int n = count.pop();
                StringBuilder sb = new StringBuilder(result.pop()); // Restore previous string
                for (int j = 0; j < n; j++) {
                    sb.append(curr);
                }
                curr = sb.toString();
                i++;
            } else {
                curr += arr[i];
                i++;
            }
        }
        return curr;
    }
}