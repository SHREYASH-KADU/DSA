/**
 * Triple_sum
 */
import java.util.Arrays;
public class Triple_sum0 {
    public static void main(String[] args) 
    {
        int [] arr = {1,2,3,1,2,3};
        int [][] ans = tripleSum(arr,6);
        for(int [] t : ans)
        { 
            System.out.println(Arrays.toString(t));
        }
    }

    static int[][] tripleSum(int [] arr,int s)
    {
        Arrays.sort(arr);
        int n = arr.length;
        int [][] ans = new int[n][3];
        int a = 0;
        for (int i = 0; i < n-1; i++) 
        {
            int f=i+1;
            int r=n-1;  
            while(f<r)
            {
                if(arr[i] + arr[f] + arr[r] == s)
                {
                    ans[a][0] = arr[i];
                    ans[a][1] = arr[f];
                    ans[a][2] = arr[r];
                    a++;
                    r--;
                    break;
                }
                else if(arr[i]+arr[f]+arr[r]> s)
                {
                    r--;
                }
                else if(arr[i]+arr[f]+arr[r] < s)
                { 
                    f++;
                }
            }
        }
        return ans;
    }
    
}