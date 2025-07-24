class Solution {
    public static int maxDepth(String s) {
        // code here
        int maxDepth=0;
        int currDepth=0;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                currDepth++;
            }else if(ch==')'){
                currDepth--;
            }
            maxDepth=Math.max(currDepth,maxDepth);
        }
        return maxDepth;
    }
}
