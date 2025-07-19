class Solution {
    private boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int vowelCount(String s) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(isVowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        int k=map.size();
        if(k==0){
            return 0;
        }
        
        int selection=1;
        for(int val:map.values()){
            selection*=val;
        }
        
        
        int permutation=1;
        for(int i=2;i<=k;i++){
            permutation*=i;
        }
        
        return selection*permutation;
    }
}