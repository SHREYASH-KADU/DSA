import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Pair_sum {

    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            arr.add(sc.nextInt());
        }
        int s = sc.nextInt(); //sum
        sc.close();
        ArrayList<ArrayList<Integer>> ans = pairSum(arr, s);
        System.out.println(ans);
    }

    static ArrayList<ArrayList<Integer>> pairSum(ArrayList<Integer> arr, int s) 
    {
        Collections.sort(arr);
        int n = arr.size();
        int i=0,j=n-1,k=0;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        while(i<j)
        {
            if(arr.get(i)+arr.get(j) == s)
            {
                ans.add(new ArrayList<>());
                ans.get(k).add(0,arr.get(i)); 
                ans.get(k).add(1,arr.get(j));
                k++;
                i++;
            }
            else if(arr.get(i)+arr.get(j) > s)
            {
                j--;
            }
            else if(arr.get(i)+arr.get(j) < s)
            {
                i++;
            }
        }
        return ans;

         /*
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0 , j = n-1;
        int [][] ans = new int[n][2];
        int a = 0;
        while(i < j)
        {
            if(arr[i]+arr[j] == s)
            {
                ans[a][0] = arr[i];
                ans[a][1] = arr[j];
                a++;
            //    i++;
                j--;
            }
            else if(arr[i]+arr[j] > s)
            {
                j--;
            }
            else if(arr[i]+arr[j] < s)
            {
                i++;
            }
        }
        return ans;
        */
    }
    
}
