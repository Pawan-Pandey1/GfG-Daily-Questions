class Solution {
    public static int countNumbers(int n) {
        // code here
        int limit=(int) Math.sqrt(n)+1;
        
        boolean[]isPrime=new boolean[limit+1];
        Arrays.fill(isPrime,true);
        
        isPrime[0]=isPrime[1]=false;
        
        for(int i=2;i*i<=limit;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=limit;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        
        ArrayList<Integer>primes=new ArrayList<>();
        for(int i=2;i<=limit;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        
        int count=0;
        
        for(int i=0;i<primes.size();i++){
            long pow8=1L;
            
            for(int j=1;j<=8;j++){
                pow8*=primes.get(i);
            }
            if(pow8<=n){
                count++;
            }else{
                break;
            }
        }
        
        for(int i=0;i<primes.size();i++){
            long p2= 1L * primes.get(i)*primes.get(i);
            for(int j=i+1;j<primes.size();j++){
                long q2=1L * primes.get(j)*primes.get(j);
                    if(p2*q2<=n){
                        count++;
                    }else{
                        break;
                }
            }
        }
        return count;
    }
}