//find a^b (a power b)

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 5;
        long ans = power(base,power);
        System.out.println(ans);
    }

    static long power(int a , int b)
    {
        long base = a;
        long ans = 1;
        /* 
            b can be represented in  addition of power of 2's , ex - 5 = (2^0) + (2^2)
            if base = 3 and power = 5
            3 power '101' (101 in binary => 5 in decimal)

            multiply ans with ans 'power of 2' times only if bit is 1,
            here 'power of 2' refers to 2 power current possition of bit in b;
        */ 
        while(b>0)
        {
            int bit = b&1; 
            
            if(bit == 1)
            {
                ans = ans * base;  
            }
            base = base * base;
            b = b >> 1;
        }
        return ans;
    }
}
