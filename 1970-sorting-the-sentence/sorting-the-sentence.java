class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] res=new String[str.length];
        StringBuilder sb=new StringBuilder();

        int i=0;

        for(String words: str)
        {
           i=(int)(words.charAt(words.length()-1)-'0');
            res[i-1]=words.substring(0,words.length()-1);

        }

        for( i=0;i<res.length;i++)
        {
            sb.append(res[i]).append(" ");
           
            
        }
         
        return sb.toString().trim();
        
    }
}

  
    