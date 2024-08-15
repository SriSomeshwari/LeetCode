class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int[] res = new int[n];
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd= 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd^= encoded[i];
        }
        res[0] = total^ odd;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] ^ encoded[i - 1];
        }
        return res;
    }
}
