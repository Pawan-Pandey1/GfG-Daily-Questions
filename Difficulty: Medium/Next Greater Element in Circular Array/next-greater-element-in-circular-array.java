class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n=arr.length;
        
        ArrayList<Integer>ans=new ArrayList<>();
        
        int [] newArr=new int[2*n];
        
        for(int i=0;i<n;i++){
            newArr[i]=arr[i];
        }
        
        for(int i=n;i<2*n;i++){
            newArr[i]=arr[i-n];
        }
        
        
        for(int i=0;i<n;i++){
            int nge=-1;
            for(int j=i+1;j<2*n;j++){
                if(arr[i]<newArr[j]){
                    nge=newArr[j];
                    break;
                }
            }
            ans.add(nge);

        }
        return ans;
    }
}