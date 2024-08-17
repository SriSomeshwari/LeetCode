class Solution {
    public String shortestPalindrome(String s) {
        
        String rev = new StringBuilder(s).reverse().toString();
        String l=s + "#" + rev;
        int[] lps=computeLPSArray(l);
        String add=rev.substring(0, rev.length() - lps[lps.length - 1]);
        return add+s;
    }

  
    private int[] computeLPSArray(String s) {
        int n=s.length();
        int[] lps=new int[n];
        int length = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i]=0;
                    i++;
                }
            }
        }
         return lps;

    }
}
