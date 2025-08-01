class Solution {
    private boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public int countBalanced(String[] arr) {
        // code here
        int n=arr.length;
        
        int[]diff=new int[n];
        
        for(int i=0;i<n;i++){
            int vowels=0;
            int consonats=0;
            
            for(char ch : arr[i].toCharArray()){
                if(isVowel(ch)){
                    vowels++;
                }else{
                    consonats++;
                }
            }
            diff[i]=vowels-consonats;
        }
        
        Map<Integer,Integer>freq=new HashMap<>();
        freq.put(0,1);
        
        int prefix=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            prefix+=diff[i];
            
            if(freq.containsKey(prefix)){
                count+=freq.get(prefix);
            }
            
            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);

        }
        return count;
    }
}