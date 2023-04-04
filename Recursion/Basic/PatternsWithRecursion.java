/*
    Contains:
    Patterns (Triangles)
    Bubble sort 
*/
import java.util.Arrays;
public class PatternsWithRecursion {
    public static void main(String[] args) {
        /* 
        int n = 4;
        pattern1(n);

        System.out.println();
        pattern2(n,n);
        */
        int [] arr = {1,7,5,3,8,5};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern1(int n)
    {
        /*
            n=4
            ****
            *** 
            **  
            *
        */
        if(n==0)
        {
            return;
        }
        rowPrinter1(n,1);
        System.out.println();
        pattern1(n-1);
    }
    static void rowPrinter1(int rows , int cols)
    {
        if(cols>rows)
        {
            return;
        }
        if(cols <= rows)
        {
            System.out.print("*");
        }
        rowPrinter1(rows, cols+1);
    }

    static void pattern2(int rows,int cols)
    {
        /*
            n=4
            *
            **
            ***
            ****
        */
        if(rows==0)
        {
            return;
        }
        rowPrinter2(rows,cols);
        System.out.println();
        pattern2(rows-1,cols);
    }
    static void rowPrinter2(int rows , int cols)
    {
        if(cols<rows)
        {
            return;
        }
        System.out.print("*");
        rowPrinter2(rows , cols-1);
    }

    static void bubbleSort(int [] arr,int n)
    {
        if(n==1)
        {
            return;
        }
        boolean isSwapped = bubbleSwapper(arr,0,n,false);
        if(!isSwapped)
        {
            return;
        }
        bubbleSort(arr, n-1);
    }
    static boolean bubbleSwapper(int[] arr,int k,int n, boolean isSwapped)
    {
        if(k > n-2)
        {
            return isSwapped;
        }
        if(arr[k]>arr[k+1])
        {
            int temp = arr[k];
            arr[k] = arr[k+1];
            arr[k+1] = temp;
            isSwapped = true;
        }
        return bubbleSwapper(arr,k+1,n,isSwapped);
    }
}
