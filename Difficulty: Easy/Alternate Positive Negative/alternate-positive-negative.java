// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer>positive=new ArrayList<>();
        ArrayList<Integer>negative=new ArrayList<>();
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<0){
                negative.add(arr.get(i));
            }else{
                positive.add(arr.get(i));
            }
        }
        
        int neg=0;
        int pos=0;
        
        int i=0;
        
        while(pos<positive.size() && neg<negative.size()){
            if(i%2==0){
                arr.set(i,positive.get(pos));
                i++;
                pos++;
            }else{
                arr.set(i,negative.get(neg));
                i++;
                neg++;
            }
        }
        
        while(pos<positive.size()){
            arr.set(i,positive.get(pos));
            i++;
            pos++;
        }
        
        while(neg<negative.size()){
            arr.set(i,negative.get(neg));
            i++;
            neg++;
        }
        
    }
}