class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        
        int cand1=0;
        int count1=0;
        
        int cand2=0;
        int count2=0;
        
        for(int num:arr){
            if(num==cand1){
                count1++;
            }else if(num==cand2){
                count2++;
            }else if(count1==0){
                cand1=num;
                count1=1;
            }else if(count2==0){
                cand2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        
        int c1=0;
        int c2=0;
        
        for(int num:arr){
            if(num==cand1){
                c1++;
            }else if(num==cand2){
                c2++;
            }
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        if(c1>n/3){
            ans.add(cand1);
        }
        if(c2>n/3){
            ans.add(cand2);
        }
        Collections.sort(ans);
        return ans;
    }
}