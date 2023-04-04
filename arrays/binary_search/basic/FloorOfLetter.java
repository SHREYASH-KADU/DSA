/*
    Find Floor of a letter from given array
    note: letters wrap around
*/

public class FloorOfLetter {
    public static void main(String[] args) 
    {
        char [] letters = {'a','b','c','c','c','c','h'};
        char target = 'c';
        char ans = nextSmallestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextSmallestLetter(char[] letters, char target) 
    {
        int s = 0 , e = letters.length - 1 ;
        
        if(target > letters[e] || target <= letters[s])
        {
            return letters[e];
        }
        
        while(s<=e)
        {
            int m = s + (e-s)/2;
            
            if( letters[m] >= target)
            {
                e = m - 1;       
            }
            else //letters[m] < target
            {
                s = m + 1;
            }
        }
        return letters[e];
    }
}
