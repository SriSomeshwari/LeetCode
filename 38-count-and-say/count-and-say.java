class Solution
{
    public String countAndSay(int n) // n  = 5 
    {
        int j;
        String str1 ="1";  
      for(j=1 ; j<=n-1 ;j++)
      { 
        String str2 = ""; 
        int i,count=1; 
        for(i=0 ; i<=str1.length()-2;i++) // i  =5 
        {
             if(str1.charAt(i)==str1.charAt(i+1))
             {
                count++; //2 
             } 
             else 
             {
                str2 = str2+count;  //str2="312" 
                str2 = str2+str1.charAt(i); // str2 = "3122" 
                count = 1;
             }
        } 
        str2 = str2+count;  
         str2 = str2+str1.charAt(i); // str2 = "11"  
         str1 = str2; //str1="11"
      }
      return str1;
    }
}



