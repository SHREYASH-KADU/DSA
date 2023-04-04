import java.util.*;
public class Solution4 {
    static void func(int n1 , int[]arr1 ,int n2 ,int[]arr2)
    {
        int sum=0;
        //find max
        int max=arr1[0];
        for(int i=1; i<n1 ; i++)
        {
            if(arr1[i]>max)
            {
                max=arr1[i];
            }
        }

        int min = arr2[0];
        for(int i=1; i<n2 ; i++)
        {
            if(arr2[i]<min)
            {
                min=arr2[i];
            }
        }

        sum=max+min;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for(int i=0; i<n1 ; i++)
        {
            arr1[i]=sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];

        for(int i=0; i<n2 ; i++)
        {
            arr2[i]=sc.nextInt();
        }
        func(n1,arr1,n2,arr2);
        sc.close();
    }
}
