package Concept;

/*
    x%n => value
    where value lies between (0 , n-1)

    In competitive platforms we are requirred to have value in modulos form
    (mostly M = 1e9+7 , i.e 1000000007)
    if value is too big   
*/
public class Modulo {
    static int M = (int)(1e9+7);
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        
        //CASE 1
        long c = (a+b)%M; 
        //here (a+b) value will be in int ,overflow occurs
        System.out.println(c);

        //CASE 2
        long L = 0L;
        long temp = (a+L+b)%M; 
        //(a+L+b) here,long L will convert a+b to long , prevents overflow  
        System.out.println(temp);

        /*
        imp point:
            -> first right side of = operator is evaluated 
            -> so in first case a+b is not type casted to long
               when operation was performed , 
               a+b value overflows the int giving wrong ans
            -> so to prevent it we type casted it to long with help of long L variable
        */


    }
}
/*
    Properties Of Modulos:
    
*/
