import java.util.ArrayList;
import java.util.Arrays;

public class SpiralPrint {
    public static void main(String[] args) 
    {
        int [][] matrix =
        {
            {1,2,3,4},
            {10,11,12,5},
            {9,8,7,6}
        };
        System.out.println("Matrix M :");
        for(int [] row : matrix)
        {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Spiral of Matrix M :");
        System.out.println(spiralPrint(matrix));
    }
    static ArrayList<Integer> spiralPrint( int [][] matrix)
    {
        int nRows = matrix.length; // number of rows
        int mCols = matrix[0].length; //number of columns

        ArrayList<Integer> ans = new ArrayList<>();
        
        int row,col,count=0;
        int k=0; //indicates 'Starting Row & Starting Column'
      
        while(count < mCols*nRows)
        {
            //Start Row 
            row=k;
            for (col = k; col < mCols - k && count < mCols*nRows ; col++) 
            {
                ans.add(matrix[row][col]);
                count++;
            }

            //End Column 
            col = mCols - 1 - k;
            for (row = k+1 ; row < nRows - k && count < mCols*nRows ; row++) 
            {
                ans.add(matrix[row][col]);
                count++;
            }
            
            //End row
            row= nRows-k-1;
            for (col = mCols - 1 - (k+1) ; col >= k && count < mCols*nRows ; col--) 
            {
                ans.add(matrix[row][col]);
                count++;
            }

            //First Column
            col = k;
            for (row = nRows-1 - (k+1) ; row >= k+1 && count < mCols*nRows ; row--) 
            {
                ans.add(matrix[row][col]);
                count++;
            }
            
            k++;
        }
        return ans;
        
    }
    
}
