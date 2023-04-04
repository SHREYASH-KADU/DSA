/*
Given a characters array letters that is sorted in non-decreasing order 
and a character target, return the smallest character in the array that is 
larger than target.

Note that the letters wrap around.
For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
*/

public class CeilingOfLetter {

    public static void main(String[] args) 
    {
        char [] letters = {'a','b','c','c','c','c','h'};
        char target = 'd';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) 
    {
        int s = 0 , e = letters.length - 1 ;
        
        if(target >= letters[e] || target < letters[s]) //  letters wrap around.
        {
            return letters[0];
        }
        
        while(s<=e)
        {
            int m = s + (e-s)/2;
            
            if( letters[m] <= target)
            {
                s = m + 1;
            }
            else //letters[m] > target
            {
                e = m-1;
            }
        }
        return letters[s];
    }

 }