import java.util.*;
public class Solution2 {
    static void func(int a ,int b,int k)
    {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        //int count =k;
        while(k>0)
        {
            if(a%2==0) //even
            {
                evens.add(a);
            }
            else
            {
                odds.add(a);
            }
            k--;
            if(k<=0)
            {
                break;
            }

            if(b%2==0) //even
            {
                evens.add(b);
            }
            else
            {
                odds.add(b);
            }
            k--;
            if(k<=0)
            {
                break;
            }

            int temp_a = a;
            a = a+b;
            b = temp_a+(2*b);
        }

        System.out.println(evens);
        System.out.println(odds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        func(a,b,k);
        sc.close();
    }
}
