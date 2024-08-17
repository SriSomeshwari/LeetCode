class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<str.length;i++){
        str[i]=nums[i]+"";
        }
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                String s1 = str[j] + str[j + 1];
                String s2 = str[j + 1] + str[j];
                if (s1.compareTo(s2) < 0) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                } 
            }
        }
        if(str[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(String n:str){
            sb.append(n);
        }

      return sb.toString();
        
    }
}