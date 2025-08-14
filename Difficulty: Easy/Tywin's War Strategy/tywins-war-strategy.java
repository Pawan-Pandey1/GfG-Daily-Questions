class Solution {
    public int minSoldiers(int[] arr, int k) {
        // code here
        int n=arr.length;
        int luckyNeeded=(n+1)/2;
        
        int luckyCount=0;
        
        List<Integer>costs=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if((arr[i]%k)==0 ){
                luckyCount++;
            }else{
                costs.add(k-(arr[i]%k));
            }
        }
        if(luckyCount>=luckyNeeded){
            return 0;
        }
        
        int req=luckyNeeded-luckyCount;
        Collections.sort(costs);
        
        int total=0;
        
        for(int i=0;i<req;i++){
          total+=costs.get(i);  
        }
        
        return total;
    }
}