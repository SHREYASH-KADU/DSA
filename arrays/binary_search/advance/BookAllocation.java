import java.util.Arrays;
import java.lang.Math;
public class BookAllocation {
    public static void main(String[] args) 
    {
        int [] arr = {30,20,10,40,5,45};
        int n = 3; //n denotes number of days
        int m = arr.length; //n denotes number of chapters
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of Days (Split arrays) = " + n);
        System.out.println("Number of Chapters = " + m);
        long ans = ayushGivesNinjatest(n,m,arr);
        System.out.println("Minimum Largest Sum of Split array = " + ans);
    }

    public static long ayushGivesNinjatest(int n, int m, int[] time) 
    {
        // n = number of days or number of partitions we have to make
        //m = number of chapters or size of the array
        
        //finding range where possible ans lies , range = [s,e]
        m = time.length;
        int start = 0;
        int end = 0;
        for(int i=0 ; i<m ; i++)
        {
            end = end + time[i];
            if(time[i]>start)
            {
                start = time[i];
            }
        }
        int ans = end;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            int sum = 0; //sum of split array
            int count = 1; // number of split arrays
            for(int i = 0; i<m ; i++)
            {
                if(sum + time[i] <= mid)          
                {
                    sum = sum + time[i];
                }
                else 
                {
                    count++;
                    sum = time[i];
                    
                }
            }
            if(count<=n) //n is number of splits we have to make
            {
                end = mid-1;
                //as we have to find minimum largest
                ans = Math.min(ans,mid); 
            }
            else //count > n
            {
                start = mid+1;
            }
        }
        return ans;
    }
}

