// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        
        String first=arr[0];
        String last=arr[n-1];
        
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return last.substring(0,i);
    }
}