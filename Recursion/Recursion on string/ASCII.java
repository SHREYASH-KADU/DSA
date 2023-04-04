import java.util.ArrayList;

public class ASCII 
{
    //To get Ascii value of a character cast it into integer type..
    // ch+0 will give the requirred result...

    //Program to find subsequences of a string along with there ascii values
    public static void main(String[] args) 
    {
        String str = "abc";
        ArrayList<String> subseqs = new ArrayList<>();
        subseqs = findSubSeqAscii(str);
        System.out.println(subseqs);
    }
    
    static ArrayList<String> findSubSeqAscii(String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        subseqFinder(str,"",ans);
        return ans;
    }
    static void subseqFinder(String str , String up , ArrayList<String> ans)
    {
        if(str.isEmpty())
        {
            ans.add(up);
        }
        else
        {
            char ch = str.charAt(0);
            int ascii = ch+0;
            subseqFinder(str.substring(1), up+ch, ans);
            subseqFinder(str.substring(1), up+ascii, ans);
            subseqFinder(str.substring(1), up , ans);
        }
    }
}
