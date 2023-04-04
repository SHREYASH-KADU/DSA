import java.util.Arrays;

public class CheckRotatedSorted {
    public static void main(String[] args) {
        int [] arr = {4,6,7,8,1,2};
        System.out.println(Arrays.toString(arr));

        boolean ans = isRotatedSorted(arr);

        System.out.println("Is Rotated Sorted ? \n" + ans);
    }
    static boolean isRotatedSorted(int [] arr)
    {
         int pivotInd = findPivot(arr);
         if(pivotInd == -1)
         {
            return false; // Sorted but not rotated
         }
         for (int i = 0; i < pivotInd; i++) 
         {
            if(arr[i] > arr[i+1])
            {
                return false; //not sorted not rotated
            }   
         }
         for (int i = pivotInd+1 ; i < arr.length-1; i++) 
         {
            if(arr[i] > arr[i+1])
            {
                return false; //not sorted not rotated
            }   
         }
         return true;
    }
    static int findPivot(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) 
        {
            if(arr[i] > arr[i+1])
            {
                return i;
            }
        }
        return -1; // if pivot is last index
    }
}
