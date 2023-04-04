/*
    Rotate Array K times from left to right
*/

import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 2;
        System.out.println(Arrays.toString(arr));
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int [] arr , int k)
    {
        int n = arr.length;
        for (int i = n-1; i>=k; i--) //0 => n-1-k
        {
            int temp = arr[i];
            arr[i] = arr[ (i+k) % n ] ; 
            arr[ (i+k) % n] = temp;
        }
    }
}
