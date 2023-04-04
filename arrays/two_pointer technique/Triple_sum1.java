/**
 * Triple_sum (unique triplets)
 */
import java.util.*;
public class Triple_sum1 {

    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            arr.add(sc.nextInt());
        }
        int s = sc.nextInt();
        sc.close();
        ArrayList<ArrayList<Integer>> ans = tripleSum(arr, s);
        System.out.println(ans);
    }

    static ArrayList<ArrayList<Integer>> tripleSum(ArrayList<Integer> arr,int s)
    {
        Collections.sort(arr);
        int n = arr.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int a=0;
        for (int i = 0; i < n-2; i++) 
        {
            if(i>0 && arr.get(i)== arr.get(i-1))
            {
                continue;
            }
            int f=i+1;
            int r = n-1;
            while(f<r)
            {
                if(f > i+1 && arr.get(f)==arr.get(f-1))
                {
                    f++;
                    continue;
                }
                if(r < n-1 && arr.get(r)==arr.get(r+1))
                {
                    r--;
                    continue;
                }
                if(arr.get(i) + arr.get(f) + arr.get(r) == s)
                {
                    ans.add(new ArrayList<>());
                    ans.get(a).add(0,arr.get(i)); 
                    ans.get(a).add(1,arr.get(f));
                    ans.get(a).add(2,arr.get(r));
                    a++;
                    f++;
                    r--;
                }
                else if(arr.get(i)+arr.get(f)+arr.get(r) > s)
                {
                    r--;
                }
                else if(arr.get(i)+arr.get(f)+arr.get(r) < s)
                {
                    f++;
                }
            }
        }
        return ans;

         /*
        Arrays.sort(arr);
        int n = arr.length;
        int [][] ans = new int[n][3];
        int a = 0;
        for (int i = 0; i < n-1; i++) 
        {
            //if previous element is same as current
            if( i>0 && arr[i]==arr[i-1])
            {
                continue;
            }
            int f=i+1;
            int r=n-1;  
            while(f<r)
            {
                //if previous element is same as current
                if(f > i+1 && arr[f]==arr[f-1])
                {
                    f++;
                    continue;
                }
                //if previous element is same as current
                if(r < n - 1 && arr[r]==arr[r+1])
                {
                    r--;
                    continue;
                }
                if(arr[i] + arr[f] + arr[r] == s)
                {
                    ans[a][0] = arr[i];
                    ans[a][1] = arr[f];
                    ans[a][2] = arr[r];
                    a++;
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
        */
        
    }
    
}