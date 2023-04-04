/**
 * Sort012
 */
import java.util.Arrays;

public class Sort012 {

    public static void main(String[] args) {
        int [] arr = {1, 1, 2, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        sort_012(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort_012(int [] arr)
    {
        int n = arr.length;
        int s=0,m=0,e=n-1;
        
        while(m<=e)
        {
            int temp =0;
            switch(arr[m])
            {
                case 0:
                    if(m==s)
                    {
                        m++;
                        s++;
                        break;
                    }
                    else
                    {
                       temp = arr[s];
                       arr[s] = arr[m];
                       arr[m] = temp;
                       s++;
                       break;
                    }
                case 1 : 
                    m++;
                    break;
                case 2 :
                    temp=arr[e];
                    arr[e] = arr[m];
                    arr[m] = temp;
                    e--;
                    break;
            }
        }
    }
}