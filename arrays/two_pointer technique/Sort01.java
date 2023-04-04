import java.util.Arrays;

public class Sort01 {

    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 0, 1, 0};
        System.out.println(Arrays.toString(arr));
        sort_01(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort_01(int [] arr)
    {
        int n = arr.length;
        int f = 0, r = n-1;
        while( f < r )
        {
            if(arr[r]==1)
            {
                r--;
            }
            else if(arr[r]==0)
            {
                if(arr[f]==0)
                {
                    f++;
                }
                else if(arr[f] == 1)
                {
                    arr[r]=1;
                    arr[f]=0;
                    r--;
                    f++;
                }
            }
            
        }
    }
    
}
