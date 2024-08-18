import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        List<String> sortedStrings=new ArrayList<>();

        for(String str:strs) {
     
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String sortedStr=new String(chars);
            
      
            int index=sortedStrings.indexOf(sortedStr);
            if(index!=-1){
              result.get(index).add(str);
            }else{
                List<String> newGroup=new ArrayList<>();
                newGroup.add(str);
                result.add(newGroup);
                sortedStrings.add(sortedStr);
            }
        }
       return result;
    }
}
