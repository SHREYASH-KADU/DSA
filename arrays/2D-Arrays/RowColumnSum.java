/*
    Row-wise sum and Column-wise sum
*/
public class RowColumnSum {
    public static void main(String[] args) {
        int [][] matrix = 
        {
            {1,4,2},
            {3,1,2},
            {5,5,1}
        };
        System.out.println("Row Wise Sum : ");
        rowWiseSum(matrix);

        System.out.println();

        System.out.println("Column Wise Sum : ");
        colWiseSum(matrix);
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
    static int[] colWiseSum(int [][] matrix)
    {   
        int [] ans = new int[matrix[0].length];

        for (int col = 0; col < matrix[0].length; col++) 
        {
            int cSum = 0;
            for (int row = 0; row < matrix.length ; row++) 
            {
                cSum = cSum + matrix[row][col];
            }
            ans[col] = cSum;
            System.out.print(cSum + " ");
        }
        
        return ans;
    }
}