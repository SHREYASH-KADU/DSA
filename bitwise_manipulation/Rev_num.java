import java.util.Scanner;
import java.lang.Integer;

public class Rev_num {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        reverse(n);
    }
    static int reverse(int n)
    {
        int ans = 0;
        while(n != 0)
        {
            int digit = n%10;

            if(ans > (Integer.MAX_VALUE)/10 || ans < (Integer.MIN_VALUE)/10 )
            {
                return 0;
            }

            ans = (ans*10) + digit;

            n = n/10;
        }
        System.out.println(ans);
        return ans;
    }
}
