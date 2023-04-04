//not correct
import java.util.ArrayList;
public class DiceRolls {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        int faces,target;
        faces=6;
        target = 4;
        ans=rollstoTarget(faces, target);
        System.out.println(ans);

        //Find number of ways possible to get a target value using n dices(custom faces)
        int count = rollsCountToTarget(2,6, target);
        System.out.println(count);   
    }
    static ArrayList<String> rollstoTarget(int faces,int target)
    {
        ArrayList<String> ans = new ArrayList<>();
        findRolls(faces, "", target, ans);
        return ans;
    }
    static void findRolls(int faces,String pS,int target,ArrayList<String> ans)
    {
        if(target==0)
        {
            ans.add(pS);
            return;
        }

        for(int i=1 ; i<=faces && i<=target; i++)
        {
            findRolls(faces, pS+(i), target-i, ans);
        }
    }

    //Find number of ways possible to get a target value using n dices(custom faces)
    static int rollsCountToTarget(int n, int faces, int target) {
        return findRolls(n,faces,target,0);
    }
    
    static int findRolls(int n, int k, int target,int count)
    {
        if(target==0 && n==0)
        {
            count++;
            return count;
        }
        for(int i=1 ; i<=k && i<=target; i++)
        {
            count = findRolls(n-1,k,target-i,count);
        }
        return count;
    }
}
