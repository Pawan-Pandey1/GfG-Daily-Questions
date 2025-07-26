class Solution {
    public String reverseWords(String s) {
        // Code here
        String[] words=s.trim().split("\\s+");
        
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            words[i] = reverse(0, words[i].length() - 1, words[i]);
            result.append(words[i]);
            
            if(i!=words.length-1){
                result.append(" ");
            }
            
        }
        return result.toString();
    }
    
    private String reverse(int start, int end, String str) {
        char[] arr = str.toCharArray();

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return new String(arr);
    }
}
