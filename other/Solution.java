//import java.util.*;
//import java.lang.*;
/**
 * Solution
 */
public class Solution {

    static void prob(int n)
    {
        float x=0,y=0; 
        float ans = x+y;
        for(int i=0; i<4 ; i++)
        {
            int l1 = n;
            int l2 = n;
            while(l1 !=0 && l2 !=0)
            {
                if(i==0)
                {
                    l1 = l1-75;
                    l2 = l2-25;
                }
                else if(i==1)
                {
                    l1 = l1-25;
                    l2 = l2-75;
                }
                else if(i==2)
                {
                    l1=0;
                }
                else if(i==3)
                {
                    l1=l1-50;
                    l2=l2-50;
                }
            }
            if(l1==l2)
            {
                x += 0.25f;
            }
            else if(l1==0)
            {
                x += 0.25f;
            }
            else if(l2==0)
            {
                y += 0.25f;
            }
        }
        ans = x + (float)(0.5*y);
        System.out.println(ans);
    }

    public static int numExecutedApps(int [][] arr)
    {
        int answer = 0;
        return answer;
    }
    public static String reverseString(String input1)
    {
        
        String[] words = input1.split("\\s+");
        StringBuilder str = new StringBuilder();

        for(int i = words.length - 1; i >= 0; --i){
            str.append(words[i] + " ");
        }

        return str.toString().trim();
    }

    static String mailserver(String email)
    {
        String s = "";
        int n = email.length();
        boolean flag = false;
        for(int i = 0 ; i<n ; i++)
        {
            if(email.charAt(i)=='.' && flag==true)
            {
                break;
            }
            if(flag)
            {
                s = s+email.charAt(i);
            }
            if(email.charAt(i)=='@')
            {
                flag = true;
            }          
        }
        return s;
    }

    public static int getNextPalindrome(int n)
    {
        int sum =0 ;
        int rem =0;
        int temp;

        while(true)
        {
            n++;
            temp = n;
            sum = rem =0;
            while (temp > 0)
            {
                rem = temp%10;
                sum = sum*10 + rem;
                temp = temp/10;
            }
            if(sum == n)
            {
                return n;
            }
        }
    }

    public static int largestAdjacentLCM(int [] arr)
    {
        int n = arr.length;
        int ans = -1;
        int temp = 0;
        for(int i = 1 ; i<n ; i++)
        {
            temp = lcm(arr[i],arr[i-1]);
            if(ans<temp)
            {
                ans = temp;
            }
        }
        return ans;
    }
    static int lcm(int a , int b)
    {
        return ((a*b)/gcd(a,b));
    }
    static int gcd(int a , int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        /* 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int ans = largestAdjacentLCM(arr);
        System.out.println(ans);
        sc.close();
        */
        /*
        int num = getNextPalindrome(10005);
        System.out.println(num);
        */
        /* 
        String s = "i am sahil";
        System.out.println(reverseString(s));

        String email = "a.ss@hp.com";
        System.out.println(mailserver(email));
        */
        prob(100);
    }
}