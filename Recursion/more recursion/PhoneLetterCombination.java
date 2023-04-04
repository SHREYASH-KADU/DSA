import java.util.ArrayList;
import java.util.List;
/*
    Given a string containing digits from 2-9 inclusive, 
    return all possible letter combinations that the number could represent. 
    Return the answer in any order.
    A mapping of digits to letters (just like on the telephone buttons) is given below. 
    Note that 1 does not map to any letters.

    mapping of digits in phone pad:
    2 => "abc"
    3 => "def"
    4 => "ghi"
    5 => "jkl"
    6 => "mno"
    7 => "pqrs"
    8 => "tuv"
    9 => "wxyz"
    https://assets.leetcode.com/uploads/2022/03/15/1200px-telephone-keypad2svg.png 

    example:
    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
*/
public class PhoneLetterCombination {
    public static void main(String[] args) {
        String str = "29";
        List<String> ans= new ArrayList<>();
        ans = letterCombinations(str);
        System.out.println(ans);
    }
    static List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        lc( digits,"",ans );
        return ans;
    }
    static void lc(String digits, String pS, List<String> ans)
    {
        if(digits.isEmpty())
        {
            ans.add(pS);
            return;
        }
            
        int d = digits.charAt(0)-'0'; //digit (char to integer conversion)
        int [] index = { (d-2)*3 , (d-1)*3 };

        if(d==7)
        {
            index[1] = index[1]+1;
        }
        if(d==8)
        {
            index[0] = index[0]+1;
            index[1] = index[1]+1;
        }
        if(d==9)
        {
            index[0] = index[0]+1;
            index[1] = index[1]+2;
        }
        
        for(int i=index[0] ; i<index[1] ; i++)
        {
            char ch = (char)('a'+ i);
            lc( digits.substring(1) , pS+ch , ans);
        }
    }
}

