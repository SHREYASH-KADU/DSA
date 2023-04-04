import java.util.Arrays;
/*
 Given an m x n integer matrix, if an element is 0, 
 set its entire row and column to 0's.
*/
public class setMatrixZero {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        setZeroes(matrix);
        System.out.println();
        System.out.println();
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void setZeroes(int[][] arr) {
        
        int [] row = new int[arr.length];
        int [] col = new int[arr[0].length];
        for(int i = 0 ; i<row.length ;i++)
        {
            for(int j = 0; j<col.length;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for(int i = 0 ; i<row.length ;i++)
        {
            for(int j = 0; j<col.length;j++)
            {
                if(row[i] == -1 || col[j] == -1)
                {
                    arr[i][j]=0;
                }
            }
        }
        // time comp: O( 2(rows*cols) )
        // extra space : O(rows+cols)
        
        
        /* brute force
            int rows = arr.length;
            int cols = arr[0].length;
            for(int i = 0 ; i<rows ;i++)
            {
                for(int j = 0; j<cols;j++)
                {
                    if(arr[i][j]==0)
                    {
                        for(int k = 0 ; k<cols ; k++)
                        {
                            if(k==j || arr[i][k]==0)
                            {
                                continue;
                            }
                            arr[i][k] = -1;
                        }
                        for(int k = 0 ; k<rows ; k++)
                        {
                            if(k==i || arr[i][k]==0)
                            {
                                continue;
                            }
                            arr[k][j] = -1;
                        }
                    }
                }
            }
            for(int i = 0 ; i<rows ;i++)
            {
                for(int j = 0; j<cols;j++)
                {
                    if(arr[i][j]==-1)
                    {
                        arr[i][j]=0;
                    }
                }
            }
            // O([(rows*cols) * (rows+cols)] + (rows*cols))
            // extra space = O(n)
        */
    }
}
