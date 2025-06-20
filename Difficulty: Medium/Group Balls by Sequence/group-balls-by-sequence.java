class Solution {
    public boolean validgroup(int[] arr, int k) {
        // code here
        if(arr.length%k!=0){
            return false;
        }
        
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        
        while(!map.isEmpty()){
            int smallest=map.firstKey();
            int smallestFreq=map.get(smallest);
            
            
            for(int i=0;i<k;i++){
                int current=smallest+i;
                
                if(!map.containsKey(current)) return false;
                if(map.get(current)<smallestFreq) return false;
                
                map.put(current, map.get(current)-smallestFreq);
                if(map.get(current)==0){
                    map.remove(current);
                }
            }
        }
        return true;
    }
}