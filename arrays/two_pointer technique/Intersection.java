/**
 * Intersection using two pointer
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Intersection {

    public static void main(String[] args) 
    {
        ArrayList<Integer> arr1  = new ArrayList<>(1);
        ArrayList<Integer> arr2 = new ArrayList<>(1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) 
        {
            arr1.add(sc.nextInt());
        }
        for (int j = 0; j < m; j++) 
        {
            arr2.add(sc.nextInt());
        }
        sc.close();
        ArrayList<Integer> ans = find_intersection(arr1,arr2);
        System.out.println(ans);

    }

    static ArrayList<Integer> find_intersection(ArrayList <Integer> arr1 , ArrayList <Integer> arr2)
    {
        Collections.sort(arr1);
        Collections.sort(arr2);
        int n = arr1.size();
        int m = arr2.size();
        ArrayList<Integer> ans = new ArrayList<>(1);
        int i=0,j=0;
        while(i < n && j<m)
        {
            if (arr1.get(i)==arr2.get(j))
            {
                ans.add(arr1.get(i));
                i++;
                j++;
            }
            else if(arr1.get(i) < arr2.get(j))
            {
                i++;
            }
            else if(arr1.get(i) > arr2.get(j))
            {
                j++;
            }
        }
        return ans;
        /*
        int n = arr1.length;
        int m = arr2.length;

        int i=0,j=0,k=0;
        int [] ans = new int[find_min(n,m)];

        while(i < n && j < m)
        {
            if(arr1[i] == arr2[j])
            {
                ans[k] = arr1[i];
                k++;
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                j++;
            }
        }
        return ans;
        */
    }
   
}