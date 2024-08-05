class Solution {
    public String intToRoman(int num) {
     
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        int i = 0;
        while (num > 0) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
            i++;
        }
        
        return roman.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intToRoman(3749)); // Output: "MMMDCCXLIX"
    }
}
