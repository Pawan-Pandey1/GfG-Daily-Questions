
class Solution {
    public int maxKPower(int n, int k) {
        Map<Integer, Integer> primeFactors = primeFactorize(k);
        int minPower = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            int prime = entry.getKey();
            int exponentInK = entry.getValue();
            int exponentInNFactorial = countPrimeInFactorial(n, prime);
            minPower = Math.min(minPower, exponentInNFactorial / exponentInK);
        }

        return minPower;
    }

    private Map<Integer, Integer> primeFactorize(int k) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                k /= i;
            }
        }
        if (k > 1) {
            factors.put(k, 1);
        }
        return factors;
    }

    private int countPrimeInFactorial(int n, int p) {
        int count = 0;
        while (n > 0) {
            n /= p;
            count += n;
        }
        return count;
    }
}
