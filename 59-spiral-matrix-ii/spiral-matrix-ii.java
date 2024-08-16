class Solution {
    public int[][] generateMatrix(int n)
    {
        int[][] matrix = new int[n][n]; 
        int val = 1,i; 
        int top=0,bottom=n-1,left=0,right=n-1;
        while(left<=right &&top<=bottom)
        {
            for(i=left ; i<=right ;i++)
            {
                matrix[top][i] = val;  //0,4=  4 
                val++;
            }
            top++; 
            for(i=top ; i<=bottom ; i++)
            {
                matrix[i][right] = val; 
                val++;
            } 
            right--; 
            if(top<=bottom)
            {
                for(i=right; i>=left ; i--)
                {
                    matrix[bottom][i] = val; 
                    val++;
                }
            } 
            bottom--; 
            if(left<=right)
            {
                for(i=bottom ; i>=top ; i--)
                {
                    matrix[i][left] = val; 
                    val++;
                }
            }
            left++;
        } 
        return matrix;
    }
}