/*
    Given an array of length ‘N’, where each element denotes the position of a stall. 
    Now you have ‘N’ stalls and an integer ‘K’ which denotes the number of cows that are aggressive. 
    To prevent the cows from hurting each other, you need to assign the cows to the stalls, 
    such that the minimum distance between any two of them is as large as possible. 
    Return the largest minimum distance.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

public class AggresiveCows {
    public static void main(String[] args) {
        ArrayList <Integer> stallsPossitions = new ArrayList<>(Arrays.asList(0,4,3,7,10,9));
        int k = 3; //k denotes number of aggressive cows
        System.out.println(stallsPossitions);
        System.out.println("Number of Aggresive Cows = " + k);
        int ans = solveAggressiveCows(stallsPossitions,k);
        System.out.println("largest minimum distance will be : " + ans);
    }

    static int solveAggressiveCows(ArrayList<Integer> stalls,int k)
    {
        Collections.sort(stalls);
        int n = stalls.size();
        int start = 1 ;
        int end = stalls.get(n-1) - stalls.get(0);
        int ans = start;

        while(start<=end)
        {
            int mid = start + (end-start)/2; //possible ans
       
            int c = stalls.get(0); //possition of first cow
            int cows = 1; //number of cows placed

            for(int i = 1 ; i<n ;i++) // here i denotes position of next cow to be placed
            {
                if(stalls.get(i) - c >= mid)
                {
                    cows++;
                    c = stalls.get(i);
                }
            }

            if(cows < k)
            {
                end = mid -1;
            }
            else //cows >= k
            {
                ans = Math.max(ans,mid);
                start = mid+1;
            }
        }
        return ans;
    }
}