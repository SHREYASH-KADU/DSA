/**
 * CodeChef
 */
//import java.util.*;
public class Modulo {
    static int M = (int)(1e9+7);
    static long L = 1L;
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        long c = (a*L*b)%M;
        long temp;
        temp = (a*L*a)%M;
        a = (int)temp; //long to int
        System.out.println(c);
        System.out.println(a);
    }
}