class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j = 0;
        while (j < chars.length) {
            int count = 0;
            char curr = chars[j];
            
            while (j < chars.length && chars[j] == curr) {
                j++;
                count++;
            }
            chars[i++] = curr;
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[i++] = digit;
                }
            }
        }
        return i;
    }
}