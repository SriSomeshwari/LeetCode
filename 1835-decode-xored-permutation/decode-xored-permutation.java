class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] perm = new int[n];
        
       
        int totalXor = 0;
        for (int i = 1; i <= n; i++) {
            totalXor ^= i;
        }
        
    
        int oddXor = 0;
        for (int i = 1; i < n - 1; i += 2) {
            oddXor ^= encoded[i];
        }
        
       
        perm[0] = totalXor ^ oddXor;
        
       
        for (int i = 1; i < n; i++) {
            perm[i] = perm[i - 1] ^ encoded[i - 1];
        }
        
        return perm;
    }
}
