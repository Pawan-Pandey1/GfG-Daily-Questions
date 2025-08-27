class Solution {
    public int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        
        for(int i=arr.length-1;i>=0;i--){
            int first=0;
            int second=i-1;
            
            while(first<second){
                if(arr[first]+arr[second]>arr[i]){
                    count+=second-first;
                    second--;
                }else{
                    first++;
                }
            }
        }
        return count;
    }
}