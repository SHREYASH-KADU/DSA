/*

You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, 
where the first m elements denote the elements that should be merged, 
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

*/

import java.util.Scanner;
import java.util.Arrays;
/*
Sample Input:
5 4
1 2 5 5 9
3 5 8 13
*/
public class MergeTwoSortedArr{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //initial number of elements in nums1
        int n = sc.nextInt(); //initial number of elements in nums2

        int [] nums1 = new int[m+n];
        int [] nums2 = new int[n];

        for (int i = 0; i < m; i++) 
        {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            nums2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("nums1 : "+Arrays.toString(nums1));
        System.out.println("nums2 : "+Arrays.toString(nums2));

        merge(nums1 ,m , nums2 ,n);

        System.out.println("\nMerged Array(updated nums1) :"+Arrays.toString(nums1));
        System.out.println();
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) 
    {   
        for(int i = m-1 , j = m+n-1; i>=0 ; i--,j--)
        {
            //shifting elements to last
            nums1[j] = nums1[i];
        }

        int firstArray = 0 , lastArray = 0 , mainArray = 0;
        
        //initially k points to first element of shifted array(nums1)
        int k = firstArray+n;
        
        while(k < m+n && lastArray < n )
        {   
            if(nums1[k] < nums2[lastArray])
            {
                nums1[mainArray] = nums1[k];
                k++;
                mainArray++;
            }
            else // nums1[k] >= nums2[lastArray]
            {
                nums1[mainArray] = nums2[lastArray];
                lastArray++;
                mainArray++;
            }
        }
        
        //adding remainning elements of nums2 array
        while(mainArray < n+m && lastArray < n)
        {
            nums1[mainArray] = nums2[lastArray];
            mainArray++;
            lastArray++;
        }
        
    }
    
}