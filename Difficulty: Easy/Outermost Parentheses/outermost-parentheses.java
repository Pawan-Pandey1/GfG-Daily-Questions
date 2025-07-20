class Solution {
    public static String removeOuter(String s) {
        // code here
        Stack<Character>stack=new Stack<>();
        
        String ans=" ";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch=='('){
                if(!stack.isEmpty()){
                    ans+=ch;
                    stack.push(ch);
                }else{
                    stack.push(ch);
                }
            }else if(ch==')'){
                stack.pop();
                if(!stack.isEmpty()){
                    ans+=ch;
                }
            }
        }
        return ans;
    }
}
