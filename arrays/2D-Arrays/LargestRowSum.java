public class LargestRowSum {
    public static void main(String[] args) 
    {
        int [][] matrix = 
        {
            {1,4,2},
            {5,5,1},
            {3,1,2}
        };
        System.out.println("Row Wise Sum : ");
        rowWiseSum(matrix);

        System.out.println("Row Index with Largest Sum " + largestRowSum(matrix));
        //note : index starts with 0   
    }
    static int largestRowSum ( int [][] matrix )
    {
        int maxi = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int row = 0; row < matrix.length; row++) 
        {
            int rSum = 0;
            for (int col = 0; col < matrix[row].length ; col++) 
            {
                rSum = rSum + matrix[row][col];
            }
            
            if(rSum > maxSum)
            {
                maxSum = rSum;
                maxi = row;
            }  
        }
        return maxi;
    }
    static int[] rowWiseSum(int [][] matrix)
    {   
        int [] ans = new int[matrix.length];

        for (int row = 0; row < matrix.length; row++) 
        {
            int rSum = 0;
            for (int col = 0; col < matrix[row].length ; col++) 
            {
                rSum = rSum + matrix[row][col];
            }
            ans[row] = rSum;
            System.out.println(rSum);
        }

        return ans;
    }
}
