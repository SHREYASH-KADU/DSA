import java.util.ArrayList;
/**
 * PermutationOfString
*/
public class PermutationOfString{
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = new ArrayList<>();
        ans=permutation(str);
        System.out.println(ans);
    }
    static ArrayList<String> permutation(String str)
    
    {
        ArrayList<String> ans = new ArrayList<>();
        permutate(str,"",ans);
        return ans;
    }
    static void permutate(String str,String pS,ArrayList<String> ans)
    {
        if(str.isEmpty())
        {
            ans.add(pS);
            return;
        }

        char ch = str.charAt(0);
        //i will be used to set the possitions(different) of ch
        //number of recursion calls is increasing by factorial times of pS.length,
        //at each level of recursion tree
        //pS is termed as processed String
        for (int i = 0; i <= pS.length(); i++) 
        { 
            String f = pS.substring(0,i);
            String s = pS.substring(i , pS.length());
            permutate(str.substring(1), f+ch+s, ans);
        }      
    }
    /*
        number of permutations possible for String with length n is n!
        i.e, n*(n-1)*(n-2)*(n-3)-----------*1

        Time complexity of above program = 0(n!)
        observe the recursion tree for above code you will see that at each level 
        recursive calls are increasing by factorial time
        i.e, at each level factorial of pS.length() number of calls are made..
    */
}