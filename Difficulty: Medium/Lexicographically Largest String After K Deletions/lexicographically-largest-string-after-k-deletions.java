class Solution {
    public static String maxSubseq(String s, int k) {
        // code here
        int n=s.length();

        StringBuilder result=new StringBuilder();
        
        int toRemove=k;

        for(int i=0;i<s.length();i++){
            while(result.length()>0 && toRemove>0 && result.charAt(result.length()-1)<s.charAt(i)){
                result.deleteCharAt(result.length()-1);
                toRemove--;
            }
            result.append(s.charAt(i));
        }
        
        return result.substring(0,n-k);
    }
}