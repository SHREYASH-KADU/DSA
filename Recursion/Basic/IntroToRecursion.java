/*
  Why use Recursion :
  -> To solve bigger Complex Problem easy way
  -> note: you can convert every recursion solution into iteration solution for better optimization,
     as recursion takes extra space for calling function 
     but solving complex problems using iterations is hard so try to use recursion first then optimize it..
  
  Approach to Solve Recursion Problem :
  1) Identify if you can break down problem with smaller problems
  2) Write the Recurrence relation if needed
  3) Draw the recursive tree
  4) Figure out About the tree:
  -> See the flow of functions how they are getting in stack
  -> observe flow of left tree calls and right tree calls
     (note : left tree call executes first then right tree calls are executed)
  5) See how and what type of value are returned in each level of tree, figure out at which point(base condition) 
     call stack should start getting empty
  6) Tip : 
     Figure out which variable should be placed where   
     Variables Involved in Recursion:
         1) Variables in Argument
         2) Variables in Return Type
         3) Variables in body of the function
*/
public class IntroToRecursion {
    public static void main(String[] args) {   
        printForward(5); //print upto n in forward manner
        System.out.println();
        printBackward(5); //print from n in backward manner

        int fiboNum = fibo(5); //find nth fibonacci number
        System.out.println("Requirred Fibonacci number : " + fiboNum);
        
    }

    static void printForward(int n)
    {
        if(n < 0) //base condition, a condition when hit 'call stack starts getting empty'
        {
            return;
        }

        printForward(n-1); // Recursion : function calling itself while altering the argument
        System.out.println(n);
    }
    static void printBackward(int n)
    {
        if(n < 0)
        {
            return;
        }

        System.out.println(n);
        printBackward(n-1);   
    }
    static int fibo(int n)
    {
        // fibonacci series :  0 1 1 2 3 5 8 13 21 . . . . .
        if(n<2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}