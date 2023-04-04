import java.util.ArrayList;
import java.util.Arrays;

public class WavePrint {
    public static void main(String[] args) 
    {
        ArrayList< ArrayList<Integer> >  matrix = new ArrayList<>();

        matrix.add ( new ArrayList<Integer> ( Arrays.asList(1 , 4 , 2 , 3 ) ) );
        matrix.add ( new ArrayList<Integer> ( Arrays.asList(2 , 4 , 5 , 1 ) ) );
        matrix.add ( new ArrayList<Integer> ( Arrays.asList(1 , 2 , 4 , 5 ) ) );

        wavePrint(matrix);
    }
    static void wavePrint(ArrayList< ArrayList<Integer> >  matrix)
    {
        int nRows = matrix.size();
        int mCols = matrix.get(0).size();
        for (int col = 0; col < mCols; col++) 
        {
            if( (col & 1 ) == 0) // if col&1 == 0  then col is even
            {
                for (int row = 0 ; row < nRows ; row++) 
                {
                    System.out.println( matrix.get(row).get(col) );
                } 
            }
            else // if col is odd
            {
                for (int row = nRows-1 ; row >= 0 ; row--) 
                {
                    System.out.println( matrix.get(row).get(col) );
                } 
            }
            System.out.println();
        }
    }
}
