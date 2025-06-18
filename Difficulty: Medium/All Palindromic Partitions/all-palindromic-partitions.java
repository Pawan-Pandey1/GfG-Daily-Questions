class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        int n=s.length();
        ArrayList<ArrayList<String>>ans=new ArrayList<>();
        ArrayList<String>curr=new ArrayList<>();
        backtrack(s,0,curr,ans);
        return ans;
    }
    
    public void backtrack(String s, int idx, ArrayList<String>curr, ArrayList<ArrayList<String>>ans){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(curr));
        }
        
        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                backtrack(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    
    private boolean isPalindrome(String s,int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
