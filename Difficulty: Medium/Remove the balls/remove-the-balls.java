class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        Stack<int[]>stack=new Stack<>();
        
        for(int i=0;i<color.length;i++){
            int c=color[i];
            int r=radius[i];
            
            if(!stack.isEmpty()){
                int [] topPair=stack.peek();
                int first=topPair[0];
                int secound=topPair[1];
                
                if(c==first && r==secound){
                    stack.pop();
                }else{
                    stack.push(new int[]{c,r});
                }
            }else{
                stack.push(new int[]{c,r});
            }
        }
        return stack.size();
    }
}