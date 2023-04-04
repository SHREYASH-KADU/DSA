import java.util.Scanner;

public class Solution1 {
    static int func(int x, int y)
    {
        if(x%y==0)
        {
            return x;
        }
        else
        {
            while(true)
            {
                x *=10;
                for(int i=1 ; i<10 ; i++)
                {
                    x += i;
                    if(x%y==0)
                    {
                        return x;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = func(x,y);
        System.out.println(ans);
        sc.close();
    }
}
