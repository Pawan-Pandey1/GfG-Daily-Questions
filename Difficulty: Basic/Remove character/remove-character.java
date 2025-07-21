// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        boolean[]freq=new boolean[26];
        
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)-'a']=true;
        }
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(!freq[str1.charAt(i)-'a']){
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }
}