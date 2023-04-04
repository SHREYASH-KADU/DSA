public class Level1Problems {
    public static void main(String[] args) {
        int n = 1234;
        int ans = sumOfDigits(n);
        System.out.println(ans);

        ans = reverseNumber(n);
        System.out.println(ans);

        n = 12321;
        System.out.println(isPalindrome(n));
        
        n = 103201;
        ans=numberOfZeros(n);
        System.out.println(ans);
    }

    static int sumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10) + sumOfDigits(n/10); 
        //similarly, we can find product of digits
    }

    //Approaches to find Reverse of a Number
    /* With the help of additional variable..

    static int reverseNum = 0;
    static int reverseNumber(int n)
    {
        if(n==0)
        {
            return 0;
        }
        reverseNum = (reverseNum*10) + (n%10);
        int a = reverseNumber(n/10);
        return reverseNum;
    }

    * Placing that Additional Requirred Variable in the argument...
    static int reverseNumber(int n , int reverseNum)
    {
        if(n==0)
        {
            return reverseNum;
        }
        reverseNum = (reverseNum*10) + (n%10);
        return reverseNumber(n/10,reverseNum);  
    }
    */
    //When additional Variable is Requirred in the Argument then use another function
    static int reverseNumber(int n)
    {
        return reverseFunc(n,0);
    }
    static int reverseFunc(int n , int reverseNum)
    {
        if(n==0)
        {
            return reverseNum;
        }
        reverseNum = (reverseNum*10) + (n%10);
        return reverseFunc(n/10,reverseNum);  
    }

    static boolean isPalindrome(int n)
    {
        if(n == reverseNumber(n))
        {
            return true;
        }
        else{
            return false;
        }
    }
    static int numberOfZeros(int n)
    {
        return countZeros(n,0);
    }
    static int countZeros(int n , int count)
    {
        if(n==0)
        {
            return count;
        }
        if(n%10 == 0)
        {
            count++;
        }
        return countZeros(n/10, count);
    }
}
